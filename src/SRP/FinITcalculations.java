package SRP;

public class FinITcalculations {

    public Double calcIncomeTaxForCurrentYear(Employee employee) {
        double payroll = employee.getPayroll();
        return 12 * payroll / 6.0;
    }
}
