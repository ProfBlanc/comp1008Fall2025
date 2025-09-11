package wk2;

import wk1.Fighter;

import java.io.Console;

public class Week2 {

    public static void main(String[] args) {

            example3();
    }
    static void example3(){

        Rectangle r1 = new Rectangle(8, 5);
        Rectangle r2 = new Rectangle(4, 10);

        System.out.println(r1.haveSameArea(r2));
        System.out.println(r2.haveSamePerimeter(r1));
    }
    static void example2(){

//        Fighter a1 = new Fighter();
//        Fighter a2 = a1;
//        System.out.println(a1);
//        System.out.println(a2);
//


        Form f1 = new Form("Ben", 30, 150, 160);
        Form f2 = new Form("Ben", 30, 150, 160);
        Form f3 = new Form("Benny", 40, 190, 210);
        Form f4 = f1;

        //System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
        System.out.println(f1.equals(f4));

    }

    static void example1(){
        System.out.println("Hello, you will be asked a series of questions");
        System.out.println("Then you will be sent a product, free of charge");

        Console console = System.console();

        System.out.println("Enter your name: ");
        String name = console.readLine();

        System.out.println("Enter your age: ");
//        String age1 = console.readLine();
//        int age = Integer.parseInt(age1);
        int age = Integer.parseInt(console.readLine());

        System.out.println("Enter your weight: ");
        float weight = Float.parseFloat(console.readLine());

        System.out.println("Enter your height: ");
        double height = Double.parseDouble(console.readLine());

        Form form = new Form(name, age, height, weight);
        System.out.println(form.getName());
        form.setName("B");
        System.out.println(form.getName());

        System.out.println(form);  //method named toString() is implicitly called
        System.out.println(form.hashCode());

    }
}
