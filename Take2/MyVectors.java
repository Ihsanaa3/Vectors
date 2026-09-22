package Take2;

public class MyVectors {
    public String name; 
    public int size; // add vector size 
    public double[] coordinates; 

    // Constructor: Just sets the data
    public MyVectors(String name, double[] coordinates, int size) {
        this.name = name; 
        this.coordinates = coordinates; 
        this.size = size; 
    } 

    // Instance method: A vector knows how to print ITSELF
    public void print() {
        double i = coordinates[0];
        double j = coordinates[1];
        System.out.print("Vector " + name + " ( " + i + "i + " + j + "j");
        if (size == 3) {
            System.out.print(" + " + coordinates[2] + "k");
        }
        System.out.println(" )");
    }
}