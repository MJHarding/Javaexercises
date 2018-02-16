import java.util.*;
public class Circle {
    Scanner input = new Scanner(System.in);
    double radius;


    //constructors
    public static newRadius(double n) {
        if (n <= 0) return 0;
        radius = n;
        return radius;
    }

    public static setZero(){
        return radius = 0;
    }

    //Calculation methods
    public static calcPerimeter(){
        double perimiter = (2 * Math.PI * radius);
        return perimiter;
    }


    public static calcArea(){
        double area = (Math.PI * (radius^2));
        return area;
    }

}
