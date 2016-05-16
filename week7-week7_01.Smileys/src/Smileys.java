
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
       //  printWithSmileys("Interface");
        printWithSmileys("Arto");
    }
    
    private static void printWithSmileys(String characterString){
        
        int charlength = characterString.length();
        if(characterString.length() % 2 == 1){
            charlength = characterString.length()+1;
        }
        if(charlength <= 4) {
            charlength = characterString.length()+1;
        }
        for(int i = 0; i < charlength; i++){
            System.out.print(":)");
            
            
            
        }
        System.out.println();
        if(characterString.length() % 2 == 1){
         System.out.print(":) " + characterString + "  :)");
        }else {
            System.out.print(":) " + characterString + " :)");
        }
        System.out.println();
        
        
        if(characterString.length() % 2 == 1){
            charlength = characterString.length()+1;
        }
        for(int i = 0; i <  charlength; i++){
            System.out.print(":)");
        
        
        
    }

}
}
