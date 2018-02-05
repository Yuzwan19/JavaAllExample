import OCP.ex1.IMessageLogger;
import OCP.ex1.Logger;
import SRP.Employee;
import SRP.FinITcalculations;
import SRP.HRpromotions;
import day2.Calculator;
import day2bank.Transaksi;

import java.util.Scanner;

public class Main {

    private Scanner scanner;

    public static void main(String[] args) {
//        Scanner scanner1 = new Scanner(System.in);
//        ConsoleLogger consoleLogger = new ConsoleLogger();
//        consoleLogger.Log("Pesan Printer Console");
//
//        Circle circle = new Circle();
//        System.out.println("Masukkan radius: ");
//        circle.setRadius(scanner1.nextDouble());
//        double area = circle.calculateArea();
//
//        Rectangle rectangle = new Rectangle();
//        System.out.println("Masukkan panjang: ");
//        rectangle.setLength(scanner1.nextDouble());
//        System.out.println("Masukkan lebar: ");
//        rectangle.setWidth(scanner1.nextDouble());
//        double area1 = rectangle.calculateArea();
//
//        System.out.println(area + " " + area1);

//        Calculator calculator = new Calculator();
//        calculator.hitung();

        Transaksi transaksi = new Transaksi();
        transaksi.addMoneyToBank();
    }

    private void SRPpromotionAndTax() {

        scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Input employeeId: ");
        employee.setEmployeeId(scanner.nextLine());
        System.out.println("Input employee payroll: ");
        employee.setPayroll(scanner.nextDouble());
        HRpromotions hRpromotions = new HRpromotions();
        FinITcalculations finITcalculations = new FinITcalculations();
        boolean promotionThisYear = hRpromotions.isPromotionThisYear(employee);
        double incomeTaxForCurrentYear = finITcalculations.calcIncomeTaxForCurrentYear(employee);

        System.out.println("Promotion: " + promotionThisYear);
        System.out.println("Payroll: " + incomeTaxForCurrentYear);
    }

    public void OCPmessage() {
        Logger logger = new Logger(new IMessageLogger() {
            @Override
            public void Log(String message) {
                System.out.println(message);
            }
        });


        logger.Log("Pesan printer");
    }

}
