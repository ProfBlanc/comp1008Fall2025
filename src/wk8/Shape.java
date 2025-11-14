package wk8;

public abstract class Shape {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //abstract methods

    public abstract double area();

    public abstract double perimeter();
}
