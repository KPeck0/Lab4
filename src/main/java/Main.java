public class Main {
    public static void main(String[] args) {
        
         Car car = new Car(2018, "Ferrari");
         
        for(int i = 0; i < 5; ++i) {
            car.accelerate();
            System.out.println("Speed of the car: " + car.getSpeed());
        }
        for(int i = 0
                ; i < 5; ++i) {
            car.brake();
            System.out.println("Speed of the car: " + car.getSpeed());
        }
    }
    
}
