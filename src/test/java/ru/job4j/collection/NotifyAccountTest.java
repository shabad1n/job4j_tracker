package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Kirill Gavrilov", "eDer3432f"),
                new Account("142", "Kirill  Gavrilov", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Kirill Gavrilov", "eDer3432f"),
                        new Account("142", "Kirill Gavrilov", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void sentFalse() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Kirill Gavrilov", "eDer3432f"),
                new Account("123", "Kirill Gavrilov", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Kirill Gavrilov", "eDer3432f"))
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}