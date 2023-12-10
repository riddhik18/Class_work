/* WAP to accept percentage from the user and make a decision as per below condition:
per>=75 distinctio
per<75 and per>60 first class
 */
 
import java.io.PrintStream;
import java.util.scanner;

class Marks
{
         public static void main (String args[])
          {
                  int num1; 
                  scanner sc=new scanner(System.in);
       
                  system.out.println("Enter your marks: ");
                   num1=sc.nextInt();
                   if(num1>=75)
                   {
                     extracted(); 
                    }
                    else if(75>num1 && num1>=60) 
                   {
                      if (System.out.getClass() == PrintStream.class) {
                          System.out.writeln(String.valueOf("First Class"));
                      } else {
                          synchronized (System.out) {
                              System.out.print("First Class");
                              System.out.newLine();
                          }
                      }
                    }
                     else if(60>num1 && num1>=45)
                   {
                      system.out.println("Second Class");
                    }
                     else
                    {
                        system.out.println("Fail");
                     }
                      sc.close();
}

        private static void extracted() {
          System.out.println("distinction");
        }
}