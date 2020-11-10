/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package Assignment2;

/**
 *
 * @author naman
 */
public class Program_12 {
    public static void main(String args[])
{
  for(int i =0; i<=6; i++)
{
  for(int j=0; j<=6-i; j++)
{
  System.out.print(" ");
}
 for(int k=0; k<=i; k++)
{
 System.out.print("* ");
}
  System.out.println();
}
}
    
}
