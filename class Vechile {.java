class Vechile {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");

class Car extends Vechile {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        system.out.println(myfastCar.brand + " "+myfastCar.modelName);
        
    }
}
    }
}