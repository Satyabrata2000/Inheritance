package Inheritance;

public class AggregationExtendedClass {

    AggregationBaseClass ab;
    double pi = 3.14;

    double area(int radius){
        ab = new AggregationBaseClass();
        int rsquare = AggregationBaseClass.square(radius);
        return pi*rsquare;
    }

    public static void main(String[] args) {
        AggregationExtendedClass ae = new AggregationExtendedClass();
        double result = ae.area(5);
        System.out.println(result);
    }
}
