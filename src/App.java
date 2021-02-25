import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        storageSize(args);
    }

    public static void storageSize(String[] args) {

        // System.out.print("Mitu ühikut on teie laosuurus: ");
        // Scanner scanner = new Scanner(System.in);    
        
        // byte storageUnitSize = scanner.nextByte();
       

        System.out.print("Kas soovite lattu ühikuid lisada?");
        Scanner unitAddQuestion = new Scanner(System.in);
        
       
        String answer = unitAddQuestion.nextLine();


        System.out.println(answer);
        if(answer.equals("jah") || answer.equals("ja") ) {
            addUnits();
        }else{
            System.out.println("Ei tööta");
        }   
    }

    public static void addUnits(){
        HashSet<String> units= new HashSet<String>();

        System.out.print("Mitu ühikut soovite lisada: ");
        Scanner userUnitSize = new Scanner(System.in);
        

        int addedUnitsSize = userUnitSize.nextInt();
        for (int i = 0; i < addedUnitsSize; i++){

            System.out.print("Sisesta ühik: ");
            Scanner unitScanner = new Scanner(System.in);
    
            String inputUnits = unitScanner.nextLine();
            units.add(inputUnits);
            System.out.println(units);
        }
        System.out.println("Kas soovite veel ühikuid lisada?");
        Scanner userAddsMoreUnitsScanner = new Scanner(System.in);
        String addMoreUnits = userAddsMoreUnitsScanner.nextLine();
        if(addMoreUnits.equals("ja") || addMoreUnits.equals("jah")){
            userAddsMoreUnits(units);
        }else{
            
            System.out.println("Kas soovite ühikuid eemaldada?");
            Scanner removeScanner = new Scanner(System.in);
            String removeUnits = removeScanner.nextLine();
            if (removeUnits.equals("jah") || removeUnits.equals("ja")) {
                removeUnitsFromList(units);
            }
        }
 
    }

    public static void removeUnitsFromList(HashSet<String> units) {
        System.out.println(units);
        System.out.print("Millist objekti soovite eemaldada? ");
        Scanner removeUnitsScanner = new Scanner(System.in);
        String removeUnits = removeUnitsScanner.nextLine();
        units.remove(removeUnits);
        System.out.println(units);
        

    }

    public static void userAddsMoreUnits(HashSet<String> units) {
        System.out.println(units);
        
        HashSet<String> newUnits = new HashSet<String>();
        units = newUnits;
        Scanner addingScanner = new Scanner(System.in);
    
    }
   
}
