import java.util.ArrayList;

public class Practice {

    ArrayList<Integer> numbers;

    public static void main(String[] args){
        Practice p = new Practice();
    }

    public Practice(){
        // construct numbers arraylist with integers from 0-15
        numbers = new ArrayList<>();
        for (int i=0; i<15; i++){
            numbers.add(i);
            System.out.println("Numbers ArrayList has "+ numbers.size() + " elements");
        }
    }
}
