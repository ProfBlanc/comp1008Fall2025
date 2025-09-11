package wk2;

/**
 * Working with a Form Class
 * @author ProfBlanc
 */

public class Form {
    //first, last, height, weight, age

    private String name;
    private int age;
    private double height;
    private float weight;

    public Form(String name, int age, double height, float weight) {

        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    //alt+insert
    //right-click => Generate

    //alt+7
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 2) this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 100) {
            this.age = age;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height >= 50 && height <= 300)
            this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight >0)
            this.weight = weight;
    }


    public String toString() {
        //s = string, d = digit (whole number), f = float/double (decimal number)
        return String.format("Name = %s, Age = %d, Height = %.1f, Weight = %.2f",
                name, age, height, weight);
    }

    public boolean equals(Object o) {

        if(o instanceof Form) {

            Form form = (Form) o;

            return form.getAge() == this.getAge() &&
                    form.getName().equals(this.getName()) &&
                    form.getHeight() == this.getHeight() &&
                    form.getWeight() == this.getWeight();
        }
        else return false;

    }

}
