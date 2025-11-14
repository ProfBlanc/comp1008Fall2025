package wk8;

public class Triangle extends Shape implements Drawable{

    private int base, height;
    private int sideA, sideB, sideC;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setBase(int base) {
        this.base = base;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public Triangle(int sideA, int sideB, int sideC, int base, int height) {
        setBase(base);
        setHeight(height);
        setName("Triangle");
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }
    public double area(){
        return 0.5 * base * height;
    }
    public double perimeter(){
        return sideA + sideB + sideC;
    }
    public void draw(){

        for(int i = 0; i < height; i++){
            for(int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println();
        }


    }

}
