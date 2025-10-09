package wk6;

public class Person {

    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception {
        if (age < 18 || age > 65) {
            throw new Exception("Age must be between 18 and 65");
        }
        this.age = age;
    }
}
