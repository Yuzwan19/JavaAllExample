package example;

public class Student {
    private String name;
    private int id;
    private double amount;

    public Student(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
