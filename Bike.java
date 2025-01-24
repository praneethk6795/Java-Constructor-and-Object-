// Program to create a class and object in java
public class Bike {
    String company_name;
    String model_name;
    int year;

    public engine_run() {
        System.out.println("Engine is running");
    }

    public void engine_stop() {
        System.out.println("Engine is stopped");
    }

    public static void main(String[] args) {
        Bike bk_obj1 = new Bike();
        bk_obj1.company_name = "Honda";
        bk_obj1.model_name = "CBR";
        bk_obj1.year = 2024;
        System.out.println(bk_obj1.company_name);
        System.out.println(bk_obj1.model_name);
        System.out.println(bk_obj1.year);

        Bike bk_obj2 = new Bike();
        bk_obj2.company_name = "Yamaha";
        bk_obj2.model_name = "R15";
        bk_obj2.year = 2023;
        System.out.println(bk_obj2.company_name);
        System.out.println(bk_obj2.model_name);
        System.out.println(bk_obj2.year);
    }
}