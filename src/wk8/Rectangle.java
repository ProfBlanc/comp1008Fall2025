package wk8;

public class Rectangle extends Shape implements Drawable {

    private int length, width;

    public void draw() {

        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
        setName("Rectangle");
    }
    @Override
    public double area(){
        return length * width;
    }
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
