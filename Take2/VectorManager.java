package Take2;

import java.util.ArrayList; 
import pyin.Input; 

public class VectorManager {

    public static void printAll(ArrayList<MyVectors> ray){
        for(MyVectors v: ray){
            v.print(); 
        }
    }

    public static void printAllNames(ArrayList<MyVectors> ray){
        if(ray.isEmpty()){
            System.out.println("\nNo Vector names yet. ");
        }else{
            System.out.println("\nlist of already used vector names: ");
            for(MyVectors v: ray){
                System.out.println("- "+v.name);; 
            }
            System.out.println("");
        }
    }
    
    public static boolean doesNameExist(String testName, ArrayList<MyVectors> ray){
        for(MyVectors v: ray){
            if(v.name.equals(testName)){
                return true; 
            }
        }
        return false; 
    }

    public static String obtainVectorName(ArrayList<MyVectors> ray){ 
        String name; 

        while (true){
            printAllNames(ray);
            name = Input.stringInput("\nEnter name of vector", true).toUpperCase(); 
            if(!doesNameExist(name, ray)){
                break; 
            }else{
                System.out.println("\n"+name+" is already in use. \nPlease select another name for the vector. ");
            }
        }

        return name; 
    }
    public static int obtainVectorSize(){
        return Input.intInputBounds("Enter vector size (2 or 3): ", 2, 3); 
    }
    
    public static int howManyVectorsToCreate(){
        return Input.intInputMin("Enter the number of vectors required: ", 1);
    }

    public static double[] obtainVector(int vecsize){ 
        double x = Input.doubleInput("Enter i component: "); 
        double y = Input.doubleInput("Enter j component: "); 
        double[] vectors = (vecsize == 3)
        ? new double[] {x,y,Input.doubleInput("Enter k component: ")} 
        : new double[] {x,y}; 

        return vectors; 
    }

    public static void addMultipleNewVectors(ArrayList<MyVectors> ray){
        int u  = howManyVectorsToCreate(); 
        for(int i = 0; i < u; i++){ 
            int vecsize = obtainVectorSize();
            double[] vector = obtainVector(vecsize); 
            String name = obtainVectorName(ray); 
            ray.add(new MyVectors(name, vector,vecsize)); 
        }
    }

    public static void addNewVector(ArrayList<MyVectors> ray){
        int vecsize = obtainVectorSize();
        double[] vector = obtainVector(vecsize); 
        String name = obtainVectorName(ray); 
        ray.add(new MyVectors(name, vector,vecsize)); 
    } 


    public static void main(String[] args) {
        ArrayList<MyVectors> vectors = new ArrayList<>(); 
        
        addMultipleNewVectors(vectors);
        
        printAll(vectors);    
    
    }

}
