package wk6;

public class Car {
    //Create class called Person with 1 int var named age
    //create getter and setter for age: enforce restriction of age b/t 18-65
    //throw exception if not valid
   private int doors;

    public void setDoors(int doors) {
        try {
            if (doors == 2 || doors == 4 || doors == 5)
                this.doors = doors;
            else {

                throw new Exception("Invalid Number of doors");
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public int getDoors() {
        return doors;
    }
}
