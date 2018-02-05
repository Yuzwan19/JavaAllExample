package day2;

import java.util.Scanner;

public class Calculator implements Calculate {

    @Override
    public void hitung() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 : ");
        int input1 = scanner.nextInt();
        System.out.println("Input 2 : ");
        int input2 = scanner.nextInt();
        System.out.println("Operator : ");
        String operator = scanner.next();

        InputanModel inputan = new InputanModel(input1, input2, operator);
        Operator(inputan);
    }

    protected double Operator(InputanModel inputan) {
        String op = inputan.getOperator();
        int result = 0;
        switch (op) {
            case "+":
                result = inputan.getInput1() + inputan.getInput2();
                break;
            case "-":
                result = inputan.getInput1() - inputan.getInput2();
                break;
            case "*":
                result = inputan.getInput1() * inputan.getInput2();
                break;
            case ":":
                result = inputan.getInput1() / inputan.getInput2();
                break;
            case "/":
                result = inputan.getInput1() / inputan.getInput2();
                break;
        }
        System.out.println("Hasilnya: "+ result);
        return result;
    }
}
