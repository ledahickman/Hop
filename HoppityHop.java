public class HoppityHop
{
   public static void main (String[]args)
   {
      int number = 0; 
       
      while(number < 25)
      {        
         number++;
            if(number % 15 == 0)
               {
               System.out.println("Hoppity Hop, GIT");     
               }       
            else if(number % 3 == 0)
                {
                 System.out.println("Hoppity, GIT");
                }
            else if(number % 5 == 0)
                {
                 System.out.println("Hop, owww ya, I'm using GIT");
                }
            else
               {
               System.out.printf("%d \n",number);
               }           
      }
      
   }
}
