
package Assignment2;

public class Program_10{
    public static void main(String args[]){
    
	int n=6;
        int j;
	for(int i=n;i>0;i--)
        {
        
                       for(j=1;j<i;j++)
                       {
                           
                           if(i==n||i==1)
                               for(j=1;j<=i;j++)
                           {
                               System.out.print("*");
                           }
                           else
                           {
                               for(j=1;j<=i;j++)
                               {
                                   if(j==1||j==i)
                                       System.out.print("*");
                                   else
                                       System.out.print(" ");
                               }
                               
                           }
                           
                           System.out.println();
                       }
                       
                      
               }  System.out.println("*");                        
    }
}
    

