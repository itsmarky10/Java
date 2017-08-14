import java.util.Scanner;

public class Froyo
{
   static final String INDENT = "   ";
   static final int MIN_STAMP = 7;
   static final int DEDUCT_STAMP = 7;
   public static void main(String[] args)
   {
      String userInputStr;
      int totalStamp, userInt;
      char userInputChar;
      boolean isShutDown;
      Scanner inputStream = new Scanner(System.in);
      
      // initialized variables 
      totalStamp = 0;
      isShutDown = false; 
      System.out.println("-----------Foothill Fro-Yo, LLC----------");
      // Do-While loop whenever user enters (S) to end process.
      do
      {	// Main loop
         System.out.println("\nMenu:");
         System.out.println(INDENT + "P (process Purchase)");
         System.out.println(INDENT + "S (Shut down)\n");
        
         System.out.print(INDENT + "Your input: ");
         userInputStr = inputStream.nextLine();
         userInputChar = userInputStr.charAt(0);
         
         // User prompt for (p)rocess purchase or (s)hut down.
         if (userInputChar == 'P' || userInputChar == 'p')
         {
            if (totalStamp >= MIN_STAMP)
            {
               System.out.print("\nYou qualify for a free yogurt. "
                  + "Would you like to use your credits? (Y or N) ");
               userInputStr = inputStream.nextLine();
               userInputChar = userInputStr.charAt(0);
               if (userInputChar == 'Y' || userInputChar == 'y')
               {	// If user enters (y)es, we reduce stamps by 7.
                  totalStamp -= DEDUCT_STAMP;
                  System.out.println("\nYou have just used 7 credits "
                     + "and have " + totalStamp + " left.");
                  System.out.println("Enjoy your free yogurt.");
               }
               else if(userInputChar == 'N' || userInputChar == 'n')
               {  // Normal transaction
                  System.out.print("\nHow many yogurts would you like to buy? ");
                  userInputStr = inputStream.nextLine();
                  userInt = Integer.parseInt(userInputStr); 
                  
                  // Checks for negative input
                  if (userInt < 0)
                     System.out.println("Input ERROR: Out of range.");
                  else
                  {  // user accumulates stamps.
                     totalStamp += userInt;
                     System.out.println("\nYou just earned " + userInt 
                        + " stamps and have total of "
                        + totalStamp + " stamps.");
                  }
               }
               else
                  System.out.println("\n  *** Invalid response ***");
            }
            else
            {  // Normal transaction
               System.out.print("\nHow many yogurts would you like to buy? ");
               userInputStr = inputStream.nextLine();
               userInt = Integer.parseInt(userInputStr); 
               // Checks for negative input
               if(userInt < 0)
                  System.out.println("Input ERROR: Out of range.");
               else
               {
                  // user accumulates stamps.
                  totalStamp += userInt;
                  System.out.println("\nYou just earned " + userInt 
                     + " stamps and have total of "
                     + totalStamp + " stamps.");
               }
            }
         }
         else if(userInputChar == 'S' || userInputChar == 's')
         {
            System.out.println("\nUser shuts down.");
            isShutDown = true;
         }
         else
            System.out.println("\n  *** Use either P or S please ***");
      }
      while (!isShutDown);
      
      // Report results.
      System.out.println("You have " + totalStamp + " stamps left.");
      inputStream.close();
   }
}
