package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
       users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> list = users.get(user);
        if(!list.contains(account)) {
            list.add(account);
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if(user.getPassport().equals(passport)) {
               rsl = user;
               break;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        List<Account> list = users.get(user);
        if(list != null) {
            for(Account account : list) {
                if(account.getRequisite().equals(requisite)) {
                   rsl = account;
                   break;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        if (findByRequisite(srcPassport, srcRequisite).getBalance() >= amount) {
            Account srcAccount = findByRequisite(srcPassport, srcRequisite);
            Account destAccount = findByRequisite(destPassport, destRequisite);
            if(srcAccount != null && destAccount != null && srcAccount.getBalance() >= 0) {
                destAccount.setBalance(destAccount.getBalance() + amount);
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                rsl = true;
            }
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
