import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) throws Exception {
        // Array List = a resizable array.
        //              Elements can be added and removed after compilation phase.
        //              Store reference data types (Integer,String,Boolean,Character...)

    ArrayList<String> food = new ArrayList<String>();

    food.add("pizza");
    food.add("hamburger");
    food.add("hotdog");

    //food.set(0, "sushi"); // Belirtilen konumdaki değer ile yeni değeri değiştirir.
    //food.remove(2); // Belirtilen konumdaki değeri siler.
    //food.clear(); // Bütün değerleri siler.

    for(int i=0; i<food.size(); i++){
        System.out.println(food.get(i));
    }

    }
}
