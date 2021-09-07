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
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
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
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
               rsl = user;
               break;
            }
        }
        return rsl;
    }

    /**
     * Метод принимает на вход паспортные данные по котором будет
     * осуществляться поиск пользователя, а так же номер счета пользовател
     * если пользователь найден производится поиск по ArrayList сравнивая реквизиты
     * @param passport аргумент, передаваемый методу findByPassport для поиска пользователя
     * @param requisite реквизиты для поиска Account пользователя
     * @return возвращает
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User ac = findByPassport(passport);
        if (ac != null) {
            List<Account> list = users.get(ac);
                for (Account account : list) {
                    if (account.getRequisite().equals(requisite)) {
                        rsl = account;
                        break;
                    }
                }
            }
        return rsl;
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
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
                destAccount.setBalance(destAccount.getBalance() + amount);
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                rsl = true;
            }
        return rsl;
    }

    public static void main(String[] args) {
        User user = new User("3434", "Petr Arsentev");
        Account accountS = new Account("3434", 100.0);
        Account accountA = new Account("3435", 50.0);
        BankService bank = new BankService();
        bank.addUser(user);
        bank.findByPassport("3434");
        bank.addAccount("3434", accountS);
        bank.addAccount("3434", accountA);
        bank.transferMoney("3434", "3434", "3434", "3435", 100.0);
        System.out.println(bank.users.get(user));
    }
}
