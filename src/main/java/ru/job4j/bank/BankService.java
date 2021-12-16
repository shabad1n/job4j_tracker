package ru.job4j.bank;

import java.util.*;

/**
 * Класс имитирует банковскую систему с возможностью добавлять пользователя
 * и привязывать к нему аккаунты банковских карт
 * @author KIRILL GAVRILIV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей и аккаунты банковских карт осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход объект типа User
     * если такого пользователя в коллекции не сущетсвует
     * добавляется новый user и создается пустая коллекция
     * типа ArrayList для хранения Account банковских карт
     * @param user пользователь которого мы хотим добавить в коллекцию
     */
    public void addUser(User user) {
       users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод позволяет добавить новый аккаунт пользователю
     * если такой User существует
     * Перед тем как добавить новый аккаунт произодится проверка
     * на совпадение добавляемого аккаунта с уже имеющимися в коллекции
     * @param passport аргумент, передаваемый методу findByPassport для поиска пользователя
     * @param account аккаунт который добавляется в коллекцию
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод выполняет поиск User проходясь по коллекции
     * и сравнивая его данные по паспорту
     * @param passport паспортные данные, по которым производится поиск User
     * @return возвращает пользователя(User) если он был найден в коллекции
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод принимает на вход паспортные данные по котором будет
     * осуществляться поиск пользователя, а так же номер счета пользовател
     * если пользователь найден производится поиск по ArrayList сравнивая реквизиты
     * @param passport аргумент, передаваемый методу findByPassport для поиска пользователя
     * @param requisite реквизиты для поиска Account пользователя
     * @return возвращает
     */
    public  Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> ac = findByPassport(passport);
        if (ac.isPresent()) {
            return users.get(ac.get())
                    .stream()
                    .filter(req -> req.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод выполняет перевод денежный средств с одного счета на другой
     * @param srcPassport паспортные данный для поиска пользователя отправителя
     * @param srcRequisite реквизиты для поиска счета отправителя
     * @param destPassport паспортные данный для поиска пользователя получателя
     * @param destRequisite реквизиты для поиска счета получателя
     * @param amount сумма которую требуется перечислить
     * @return в случае успешной операции возвращается true иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
                destAccount.get().setBalance(destAccount.get().getBalance() + amount);
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                rsl = true;
            }
        return rsl;
    }
}
