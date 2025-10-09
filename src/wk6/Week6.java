package wk6;

import java.io.Console;
import java.util.Scanner;

public class Week6 {

    public static void main(String[] args) {

//
//        Scanner scanner = new Scanner(System.in);
//
//        scanner.nextInt();
        example6();
    }
    static void example6(){
        int counter = 0;
        int target = 2;
        int [] validNums = new int[target];
        //validNums = {0,0}
        String userInput = null;
        while(true){
            System.out.printf("Enter a number %d of %d: ", counter + 1, target);
            userInput = console.readLine();

            try{
                int num = Integer.parseInt(userInput);
                if(num < 2 || num % 2 == 1)
                    throw new IllegalArgumentException("Invalid number. Number is not divisible by 2.");

                validNums[counter++] = num;
                if(counter == target)
                    break;

            }
            catch (Exception e){
                System.err.println(e.getMessage());
            }
        }

        System.out.println("Finished Program");
        System.out.println("First number is " + validNums[0]);
        System.out.println("Second number is " + validNums[1]);


    }
    static void example5(){
        Course course = new Course();
        course.setCode("ABCD9876");


    }
    static void example4(){
//        Car car = new Car();
//        car.setDoors(100);
        try {
            Person p = new Person();
            p.setAge(20);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    static void example3(){
        try {
            example2();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    static Console console = System.console();

    //create a static method named example2()
    // ask user for 2 float values
    // output the quotient of floats
    static void example2(){

        //ask the user for 2 numbers
        System.out.println("Enter 1 number");
        float num1 = Float.parseFloat(console.readLine());
        System.out.println("Enter 2 number");
        double num2 = Double.parseDouble(console.readLine());
        System.out.printf("%.1f / %.2f = %.0f\n", num1, num2, num1/num2);

    }

    static void example1() throws Exception{

        //ask the user for 2 numbers
        System.out.println("Enter 1 number");
        int num1 = Integer.parseInt(console.readLine());
        System.out.println("Enter 2 number");
        int num2 = Integer.parseInt(console.readLine());
        System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);

    }
}
