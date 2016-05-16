
public class Main {

        // use this main class to test your program!
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
       
        
         for(int i =  1; i < 100; i++){
         int addWeight = i;
        Thing brick = new Thing("Brick", addWeight);
        Suitcase brickCase = new Suitcase(i);
         brickCase.addThing(brick);
         container.addSuitcase(brickCase);
          
          
          
          
          
           
          
          
         }
         
         
         
       
            
      

    }

}
