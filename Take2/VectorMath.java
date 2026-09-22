package Take2;

import java.util.ArrayList;

public class VectorMath { 
    public static double[] vectorAdd(MyVectors a, MyVectors b){
        double[] result = {a.coordinates[0]+b.coordinates[0], a.coordinates[1]+ b.coordinates[1]}; 
        return result; 
    }
    public static void main(String[] args) {
        ArrayList<MyVectors> myData = new ArrayList<>(); 
        myData.add(new MyVectors("A", new double[]{1,2},2)); 
        myData.add(new MyVectors("B", new double[]{3,4},2)); 
        double[] x = vectorAdd(myData.get(0), myData.get(1)); 
        System.out.println(x[0]);
        System.out.println(x[1]);
        // // Use the Manager to fill the list
        // VectorManager.addMultipleNewVectors(myData);
        
        // // Use the Data Class logic to print
        // System.out.println("\nFinal vectors");
        // for (MyVectors v : myData) {
        //     v.print();
        // }
    }
}
