package Inheritance;

public class InheritanceExtendedClass extends InheritanceBaseClass{

    int bonus = 500;

    public static void main(String[] args) {

        InheritanceExtendedClass p = new InheritanceExtendedClass();
        System.out.println("Employee's salary is " + p.salary);
        System.out.println("Employee's bonus is " + p.bonus);
    }
}
