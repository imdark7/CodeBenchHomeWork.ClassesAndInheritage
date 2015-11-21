import java.util.Scanner;

public class Calculator {
    String color;
    int weight;
    String producedBy;
    String type;
    boolean isTurnedOn = false;
    double currentNumber = 0;
    Scanner scanner = new Scanner(System.in);

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getCurrentNumber() {
        return currentNumber;
    }
    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getProducedBy() {
        return producedBy;
    }
    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setWorkStatus () {
        isTurnedOn = !isTurnedOn;
    }

    public void clear() {
        setCurrentNumber(0);
    }

    public void pressOnOffButton() {
        setWorkStatus();
    }

    public double inputNumber() {
        double a;
        a = scanner.nextDouble();
        setCurrentNumber(a);
        return  a;
    }

    public double sum() {
        return currentNumber = currentNumber + inputNumber();
    }

    public double sub() {
        return currentNumber = currentNumber - inputNumber();
    }

    public double mult() {
        return currentNumber = currentNumber * inputNumber();
    }

    public double div() {
        return currentNumber = currentNumber / inputNumber();
    }

    public double negate() {
        return currentNumber = 0 - currentNumber;
    }

    public double percentage() {
        return currentNumber = currentNumber * inputNumber() / 100;
    }

}
