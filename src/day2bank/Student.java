package day2bank;

public class Student {
    String id, name;

    int amountMoney;

    public Student() {
    }

    public Student(String id, String name, int amountMoney) {
        this.id = id;
        this.name = name;
        this.amountMoney = amountMoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }
}
