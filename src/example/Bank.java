package example;

import java.util.HashMap;

public class Bank {
    private static Bank bank;
    private HashMap<Integer, Double> depositor;

    private Bank(){
        depositor = new HashMap<Integer, Double>(7);
    }

    public static synchronized Bank createBank() {
        if (bank == null) {
            bank = new Bank();
        }
        return bank;
    }

    public void deposit(Student student) {
        depositor.put(student.getId(), student.getAmount());
    }
    
    public void debug() {
        for (double amount : depositor.values()) {
            System.out.println(amount);
        }
    }
}
