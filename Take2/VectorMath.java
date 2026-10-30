package Take2;

import java.util.ArrayList;

public class VectorMath { 

    public static boolean isSameSize(MyVectors a, MyVectors b) {
        return a.size == b.size;
    }

    public static double[] vectorAdd(MyVectors a, MyVectors b) { 
        if (!isSameSize(a, b)) {
            System.out.println("Size Error: Vectors must be the same size for addition.");
            return null;  
        }

        double[] result = new double[a.size];
        for (int i = 0; i < a.size; i++) {
            result[i] = a.coordinates[i] + b.coordinates[i];
        }
        return result; 
    }

    public static double[] vectorSUB(MyVectors a, MyVectors b) {
        if (!isSameSize(a, b)) {
            System.out.println("Size Error: Vectors must be the same size for subtraction.");
            return null;  
        }

        double[] result = new double[a.size];
        for (int i = 0; i < a.size; i++) {
            result[i] = a.coordinates[i] - b.coordinates[i];
        }
        return result; 
    } 

    public static Double vectorDOT(MyVectors a, MyVectors b) {
        if (!isSameSize(a, b)) {
            System.out.println("Size Error: Vectors must be the same size for dot product.");
            return null;  
        }

        double result = 0;
        for (int i = 0; i < a.size; i++) {
            result += a.coordinates[i] * b.coordinates[i];
        }
        return result; 
    } 

    public static void main(String[] args) {
        ArrayList<MyVectors> myData = new ArrayList<>(); 
        myData.add(new MyVectors("A", new double[]{1, 2}, 2)); 
        myData.add(new MyVectors("B", new double[]{3, 4}, 2)); 
        
        double[] x = vectorAdd(myData.get(0), myData.get(1)); 
        if (x != null) {
            System.out.println("Addition result:");
            System.out.println(x[0]);
            System.out.println(x[1]);
        }

        // Test dot product
        Double dot = vectorDOT(myData.get(0), myData.get(1));
        if (dot != null) {
            System.out.println("Dot product: " + dot);
        }
    }
}