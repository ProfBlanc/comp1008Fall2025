package wk8;


public class Week10 {


    public static void main(String[] args) {

        //Shape s = new Shape();
        Rectangle r = new Rectangle(5, 30);
        r.draw();

        Triangle t = new Triangle(2, 3, 4, 5, 6);
        t.draw();

        Shape s1 = new Rectangle(10, 5);

        System.out.println(s1 instanceof Rectangle);

        Drawable f1 = new Rectangle(5, 4);

        /// ///////////////////////////////////






    }
}
