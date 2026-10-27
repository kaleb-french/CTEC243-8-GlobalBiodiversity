import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main() {
        HashMap<String, Integer> animals = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        animals.put("White Sheep Dog", 30);
        animals.put("Blue Point Simese Cat", 15);
        animals.put("Red Fox", 12);
        animals.put("Opposum", 8);
        animals.put("Sloth", 10);

        try{
            Scanner fileScan = new Scanner(new File("sightings.txt"));
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                if(animals.containsKey(line)){
                    int value = animals.get(line) + 1;
                    animals.put(line, value);
                }
                else{
                    animals.put(line, 1);
                }
            }
            String highest = "";
            String lowest = "";

            for(Map.Entry<String, Integer> item : animals.entrySet()){
                System.out.println(item.getKey() + " | " + item.getValue());
                if(highest == ""&& lowest == ""){
                    highest = item.getKey();
                    lowest = item.getKey();
                }else if(animals.get(highest) < item.getValue()){
                    highest = item.getKey();
                }else if (animals.get(lowest) > item.getValue()) {
                    lowest = item.getKey();
                }
            }
            System.out.println("Most Seen: " + highest + " | Count: " + animals.get(highest));
            System.out.println("Least Seen: " + lowest + " | Count: " + animals.get(lowest));
            fileScan.close();
        }catch(Exception e){
            System.out.println(e);
        }

        while(true){
            System.out.println("Enter a animal name");
            String input = scan.nextLine();
            if(input == ""){
                break;
            }
            if (animals.containsKey(input)){
                System.out.println(input + " | " + animals.get(input));
            }else{
                System.out.println("Does not contain: " + input);
            }
        }
    }
}
