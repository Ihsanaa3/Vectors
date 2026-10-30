package Take1;
import java.util.ArrayList;
import pyin.Input; 

public class vectormake {
    public static ArrayList<String> VectorName = new ArrayList<String>();
    public static ArrayList<double[]> VectorList = new ArrayList<double[]>();     
    public static void printAllVectors(){
        for(int j = 0; j < VectorList.size(); j++){
            printVector(j);
        } 
    } 
    public static void PSV2(ArrayList<double[]> ListOfVectorsArray, ArrayList<String> ListOfVectorNamesArray, int indexOfVec){
        // PSV2 stand for print single vector take 2 
        String VecName = ListOfVectorNamesArray.get(indexOfVec); 
        double[] vec = ListOfVectorsArray.get(indexOfVec); 

        double i = vec[0]; 
        double j = vec[1]; 
        if (vec.length == 3){
            double k = vec[2]; 
            System.out.println("Vector "+VecName+ " ( "+i+" i + "+j+" j + "+k+" k )");
        }else{
            System.out.println("Vector "+VecName+ " ( "+i+" i + "+j+" j )");
        }        
    }
    public static void printVector(int indexOfVec){ 
        String VecName = VectorName.get(indexOfVec); 
        double[] vec = VectorList.get(indexOfVec); 

        double i = vec[0]; 
        double j = vec[1]; 
        if (vec.length == 3){
            double k = vec[2]; 
            System.out.println("Vector "+VecName+ " ( "+i+" i + "+j+" j + "+k+" k )");
        }else{
            System.out.println("Vector "+VecName+ " ( "+i+" i + "+j+" j )");
        }
    }   
    public static Boolean PassNameIntoVectorName(String n){ 
        String name = n.toUpperCase();
        if (VectorName.contains(name)){
            return true; 
        }else{
            VectorName.add(name); 
            return false; 
        }
    }
    public static double[] newVector(int lenOfVec, String NameOfVec) throws Exception{
        if (PassNameIntoVectorName(NameOfVec)){
            throw new Exception("That Name already exists, please try another. "); 
        };
        double x; double y; 
        // double z; 
        x = Input.doubleInput("Enter your value for the i vector: "); 
        y = Input.doubleInput("Enter your value for the j vector: ");

        double[] vector = (lenOfVec == 3) 
        ? new double[] {x,y,Input.doubleInput("Enter your value for the k vector: ")}
        : new double[] {x,y}; 

        return vector; 
    }

    public static void main(String[] args ) throws InterruptedException {

        for (int i = 0; i < 3; i++){
            try {
                VectorList.add(newVector(Input.intInputBounds("Enter the size of your vector (2 or 3 dimension): ", 2,3),Input.stringInput("Enter the name of the vector (i.e. A) : ",true ))); 
                
                break;
            } catch (Exception e) {
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException ie) { 
                    Thread.currentThread().interrupt(); 
                } 
            } 
        }
        PSV2(VectorList, VectorName, 0);
        printAllVectors();
        
    }
}


// DONE- change print vector to use ijk notation 
// index each vector as A B C ... 
// idk how thats gonna work though 
// could maybe do a string import and then depending on the index of the thing then i use that for the vector array 
// or use an arraylist so that whenever a new vector is made it returns the vector and also a letter/ string that is associated with 
// it, can then use index of that string to get index of vector for things such as vector calculations. 
