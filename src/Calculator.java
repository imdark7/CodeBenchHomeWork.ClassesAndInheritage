public class Calculator {
    String color;
    int weight;
    String producedBy;
    String type;
    boolean isTurnedOn = false;
    int currentNumber = 0;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCurrentNumber() {
        return currentNumber;
    }
    public void setCurrentNumber(int currentNumber) {
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
        this.isTurnedOn = !isTurnedOn;
    }

    public void clear() {
        setCurrentNumber(0);
    }

    public void pressOnOffButton() {
        setWorkStatus();
    }
}
