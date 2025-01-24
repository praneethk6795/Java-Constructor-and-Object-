// Program to create a class and object in Java with constructor usage
public class Bike_constructor {
    String company_name;
    String model_name;
    int year;

    // Constructor to initialize attributes
    public Bike(String cmp_name, String mdl_name, int yr) {
        company_name = cmp_name;
        model_name = mdl_name;
        year = yr;
    }

    // Method to simulate engine running
    public void engine_run() {
        System.out.println("Engine is running");
    }

    // Method to simulate engine stopped
    public void engine_stop() {
        System.out.println("Engine is stopped");
    }

    public static void main(String[] args) {
        // Create objects using the constructor
        Bike_constructor bk_obj1 = new Bike_constructor("Honda", "CBR", 2024);
        System.out.println(bk_obj1.company_name + " " + bk_obj1.model_name + " " + bk_obj1.year);
        
        Bike_constructor bk_obj2 = new Bike_constructor("Yamaha", "R15", 2023);
        System.out.println(bk_obj2.company_name + " " + bk_obj2.model_name + " " + bk_obj2.year);
    }
}
