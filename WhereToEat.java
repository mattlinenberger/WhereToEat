import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class WhereToEat
{
   private static String[] options = new String[]{"American Food","Mexican Food","Chinese Food"};
   private static String[] americanChoices = new String[]{"Burger King","McDonald's","Wendy's","Long John Silvers","Spangles","Braums","Sonic","Freddy's","Arby's","KFC"};
   private static String[] chineseChoices = new String[]{"Imperial Garden","Great Wall","Dillons Chinese","Hong Kong Buffet"};
   private static String[] mexicanChoices = new String[]{"La Hacienda","Poncho's", "Taco Bell","Taco John's"};
   
   public static void main(String[]args)
   {
   //create a random number generator 
      Random random = new Random();
      
      int randomNumber = random.nextInt(9);
      int randomNumber1 = random.nextInt(5);
      int randomNumber2 = random.nextInt(4);
      //set the random number to the choices available
      String randomChoice = americanChoices[randomNumber];
      String randomChoice1 = mexicanChoices[randomNumber1];
      String randomChoice2 = chineseChoices[randomNumber2];
      String category;
      //create title and prompt for the JOPane
      String title = "Can't Decide? Let me help!";
      String prompt = "What Sounds Good?";
      //set category to JOPane showinputDialog
      category = (String) JOptionPane.showInputDialog( 
                           null, 
                           prompt, 
                           title,
                           JOptionPane.QUESTION_MESSAGE, 
                           null, 
                           options, 
                           options[0]);
                           
       //set if statements to choose from the arrays using our variables set to randomize the options in the array                   
     if(category.equalsIgnoreCase("AMERICAN Food")){
     JOptionPane.showMessageDialog(null, "How about..." + randomChoice + "?"); 
     System.out.println(randomChoice);}
    
     if(category.equalsIgnoreCase("MEXICAN Food")){
     JOptionPane.showMessageDialog(null, "How about..." + randomChoice1 + "?"); 
     System.out.println(randomChoice1);}
     
     if(category.equalsIgnoreCase("CHINESE Food")){
     JOptionPane.showMessageDialog(null, "How about..." + randomChoice2 + "?"); 
     System.out.println(randomChoice2);}        
     }
}
