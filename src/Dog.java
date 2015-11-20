
public class Dog {
    private int age;
    private String passCode;
    private String breed;
    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }
    public String getPassCode() {
        return passCode;
    }
    public String getBreed() {
        return breed;
    }
    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }
    public void bark() {
        System.out.println("гав-гав-гав");
    }
}
