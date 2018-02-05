package example;

import java.util.Scanner;

public class UserInterface {
    private Scanner keyboard;

    public void inputBalance (int id, Bank bank) {
        String name;
        double amount;
        Student student;
        keyboard = new Scanner(System.in);

        System.out.println("Input your name");
        name = keyboard.nextLine();

        System.out.println("Input your amount");
        amount = keyboard.nextDouble();

        student = new Student(id, name, amount);

        bank.deposit(student);
    }

    public void generateWeeks(int weeks, Bank bank) {
        for (int i = 0; i < weeks; i++) {
            System.out.println("Week-" + (i+1));
            for (int j = 0; j < 5; j++) {
                inputBalance(j+1, bank);
            }
        }
    }

    public void simulation(Bank bank) {
        int weeks;
        keyboard = new Scanner(System.in);

        System.out.print("Input how many weeks? ");
        weeks = keyboard.nextInt();

        generateWeeks(weeks, bank);
    }
}
