package day2bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Transaksi implements Transaction {

    @Override
    public void addMoneyToBank() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Weeks: ");
        int week = scanner.nextInt();
        Bank bank = Bank.getInstance();
        String inputName;
        int inputAmount, storeTotalAmount = 0;
        Student student;

        List<Student> studentsList = new ArrayList<>();

        for (int i = 1; i <= week; i++) {

            System.out.println("Week : " + i);
            System.out.println("Sunday: ");
            inputName = scanner.next();
            inputAmount = scanner.nextInt();
            student = new Student("1", inputName, inputAmount);
            bank.addMoney(student);

            System.out.println("Thursday: ");
            inputName = scanner.next();
            inputAmount = scanner.nextInt();
            student = new Student("2", inputName, inputAmount);
            bank.addMoney(student);

            System.out.println("Friday: ");
            inputName = scanner.next();
            inputAmount = scanner.nextInt();
            student = new Student("3", inputName, inputAmount);
            bank.addMoney(student);

            System.out.println("Wednesday: ");
            inputName = scanner.next();
            inputAmount = scanner.nextInt();
            student = new Student("4", inputName, inputAmount);
            bank.addMoney(student);

            System.out.println("Saturday: ");
            inputName = scanner.next();
            inputAmount = scanner.nextInt();
            student = new Student("5", inputName, inputAmount);
            bank.addMoney(student);


        }

        for (Student s : studentsList) {
            storeTotalAmount += s.getAmountMoney();
        }

        bank.getTotalMoney();
        bank.getAllData();
        System.out.println("Masukkan nama account: ");
        bank.getDataByName(scanner.nextLine());

    }


}
