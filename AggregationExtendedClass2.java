package Inheritance;

public class AggregationExtendedClass2 {

    int id;
    String name;
    AggregationBaseClass2 address;

    public AggregationExtendedClass2(int id, String name, AggregationBaseClass2 address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(address.city + " "+ address.state + " " + address.country);
    }

    public static void main(String[] args) {
        AggregationBaseClass2 address1 = new AggregationBaseClass2("abc", "def", "ghi");
        AggregationBaseClass2 address2 = new AggregationBaseClass2("123", "456", "789");

        AggregationExtendedClass2 obj1 = new AggregationExtendedClass2(101, "qwe", address1);
        AggregationExtendedClass2 obj2 = new AggregationExtendedClass2(102, "dfg", address2);

        obj1.display();
        obj2.display();
    }
}
