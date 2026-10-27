import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static void main() {
        HashMap<String, Integer> plants = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        plants.put("White Clover", 30);
        plants.put("Apple Tree", 15);
        plants.put("Live Oak", 12);
        plants.put("Ozark Strawberry", 8);
        plants.put("Muscadine Grape", 10);

        while(true){
            System.out.println("Enter a plant name");
            String input = scan.nextLine();
            if(input == ""){
                break;
            }
            if (plants.containsKey(input)){
                System.out.println(input + " | " + plants.get(input));
            }else{
                System.out.println("Does not contain: " + input);
            }
        }
    }
}
