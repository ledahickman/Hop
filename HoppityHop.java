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
               System.out.println("Hoppity Hop");     
               }       
            else if(number % 3 == 0)
                {
                 System.out.println("Hoppity");
                }
            else if(number % 5 == 0)
                {
                 System.out.println("Hop");
                }
            else
               {
               System.out.printf("%d \n",number);
               }           
      }
      
   }
}
