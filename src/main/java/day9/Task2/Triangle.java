package day9.Task2;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * S = √p(p - a)(p - b)(p - c)
     */

    public double area() {
        double halfP = perimeter() / 2; //perimeter
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC)); /* Area formula of Heron */
    }


    public double perimeter() {
        return sideA + sideB + sideC;
    }

}
