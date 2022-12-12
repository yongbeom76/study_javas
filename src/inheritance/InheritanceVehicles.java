package inheritance;

public class InheritanceVehicles {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        int speed = vehicles.speed(50, 3);
        String speedStr = Integer.toString(speed);
        int weight = vehicles.weight(3, 4, 5);
        String weightStr = Integer.toString(weight);
        System.out.println("new Vehicles");
        System.out.println("speed : " + speedStr);
        System.out.println("weight: " + weightStr);
        System.out.println();

        Vans vans = new Vans();
        speed = vans.speed(50, 3);
        speedStr = Integer.toString(speed);
        weight = vans.weight(3, 4, 5);
        weightStr = Integer.toString(weight);
        int windows_count = vans.windows_count(5);
        String windows_count_str = Integer.toString(windows_count);
        System.out.println("new Vans");
        System.out.println("speed : " + speedStr);
        System.out.println("weight : " + weightStr);
        System.out.println("windows_count : " + windows_count_str);
        System.out.println();

        int oneway_count = 5;
        Cars cars = new Cars(oneway_count);
        speed = cars.speed(50, 3);
        weight = cars.weight(3, 4, 5);
        speedStr = Integer.toString(speed);
        weightStr = Integer.toString(weight);
        System.out.println("new Cars");
        System.out.println("speed : " + speedStr);
        System.out.println("weight : " + weightStr);

    }
}
