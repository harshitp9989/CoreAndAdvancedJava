package com.excelr.basics.corejava.collections.list.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class AccountMainComparable {

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setId(122);
        account1.setName("Ajay");
        account1.setOrganization("TCS");

        Account account2 = new Account();
        account2.setId(222);
        account2.setName("Vijay");
        account2.setOrganization("Infosys");

        Account account3 = new Account();
        account3.setId(322);
        account3.setName("Malinga");
        account3.setOrganization("Cognizant");

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        System.out.println("=======Before sorting=========");
        if (!CollectionUtils.isEmpty(accounts)) {
            accounts.forEach(account -> System.out.println(account));
        }

        Collections.sort(accounts);

        System.out.println("=======After sorting=========");
        if (!CollectionUtils.isEmpty(accounts)) {
            accounts.forEach(account -> System.out.println(account));
        }
    }
}
