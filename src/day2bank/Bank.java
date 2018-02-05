package day2bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static Bank bank = new Bank();
    private List<Student> studentsList = new ArrayList<>();
    private int totalMoney = 0;

    public static Bank getInstance() {
        return bank;
    }

    private Bank() {
    }

    public void addMoney(Student student) {
//        int id = 0;

        if (student == null) {
            studentsList.add(student);
        } else {
            studentsList.set(Integer.parseInt(student.getId()), student);

        }

        totalMoney += student.getAmountMoney();
    }

    public void getTotalMoney() {
        System.out.println(totalMoney);
    }

    public void getAllData() {
        for (Student s : studentsList) {
            System.out.println("id : " + s.getId());
            System.out.println("name : " + s.getName());
            System.out.println("amount : " + s.getAmountMoney());
        }
    }

    public void getDataByName(String name) {
        int total = 0;
        for (Student s : studentsList) {
            if (s.getName().equalsIgnoreCase(name)) {
                total += s.getAmountMoney();
            }
        }

        System.out.println("Name: " + name + ", Balance: " + total);
    }
}
