package example;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        UserInterface interfaceUI = new UserInterface();
        Bank bank = Bank.createBank();

        interfaceUI.simulation(bank);
        bank.debug();
    }
}
