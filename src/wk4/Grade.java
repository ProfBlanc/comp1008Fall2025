package wk4;

import java.util.Random;

public class Grade {

    private double percentage;
    private String letter;
    private static final String[] ALLOWED_GRADE_LETTERS = {"A","B","C","D","F"};

    public Grade() {
        setLetter();
    }
    //overloading: adding a variation
    //overloading: creating method with same name but VARYING parameter
    public Grade(double percentage) {
        setPercentage(percentage);
    }
    public Grade(String letter) {
        setLetter(letter);
    }
    public Grade(double percentage, String letter) {
        setPercentage(percentage);
        if(!letter.equals(getLetter()))
            throw new IllegalArgumentException("Percentage and Letter don't match");
    }

    public double getPercentage() {
        return percentage;
    }
    //first line of method = method header = method signature
    //access_level return_data_type nameOfMethod([dt1 arg1, dt2 argN])
    public void setPercentage(double percentage) {
        if(percentage >= 0 && percentage <= 100){
            this.percentage = percentage;
            setLetter();
        }
    }

    public String getLetter() {
        return letter;
    }
    private void setLetter() {

        if(percentage >= 80){
            letter = ALLOWED_GRADE_LETTERS[0];
        }
        else if(percentage >= 70){
            letter = ALLOWED_GRADE_LETTERS[1];
        }
        else if(percentage >= 60){
            letter = ALLOWED_GRADE_LETTERS[2];
        }
        else if(percentage >= 50){
            letter = ALLOWED_GRADE_LETTERS[3];
        }
        else{
            letter = ALLOWED_GRADE_LETTERS[4];
        }

    }
    private void setLetter(String letter) {

        int high = 49; int low = 0;
        Random random = new Random();

        switch(letter){
            case "A":
                high = 101;
                low = 80;
                break;
            case "B":
                high = 80;
                low = 70;
                break;
            case "C":
                high = 70;
                low = 60;
                break;
            case "D":
                high = 60;
                low = 50;
                break;
            default:
                break;
        }
        setPercentage(random.nextInt(low, high));

    }

    //factory method
    //method that returns an instance of the class (aka an object of the class)
    //??? why in the world would we do this?
    //ANSWER: to create a category of that class

    public static Grade PassingGrade(){
        int high = 101, low = 50;
        Random random = new Random();
        return new Grade(random.nextInt(low,high));
    }
}
