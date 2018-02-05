package day2;

public class InputanModel {
    private int input1, input2;
    private String operator;

    InputanModel(int input1, int input2, String operator) {
        this.input1 = input1;
        this.input2 = input2;
        this.operator = operator;
    }

    public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
