package Take1;
import java.util.ArrayList;
import java.util.Random;

// class Vector2D{
//     ArrayList<Integer> arr = new ArrayList<Integer>();  
// }


public class Vectors{
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Double> arr = new ArrayList<Double>();  
        arr.add(random.nextDouble(100)); 

        System.out.println(arr);
    }
}

