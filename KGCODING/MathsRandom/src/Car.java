public class Car
{

        int noOfWheels;
        int noOfDoors;
        int maxSpeed;
        String name;
        String modelNumber;
        String company;


    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company)
    {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    public static void main(String[] args)
    {
        Car swift = new Car(4,4,120,"Swift","SW786","Maruti");
        System.out.println(swift.toString());
    }
}