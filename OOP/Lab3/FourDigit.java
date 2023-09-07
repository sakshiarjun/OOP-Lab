import java.util.Scanner;
public class FourDigit {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4}; int i,j,k,a,c=0;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=4; j++)
            {
                for(k=1; k<=4; k++)
                {
                    for(a=1; a<=4; a++)
                    {
                        System.out.print(i+""+j+""+k+""+a);
                        System.out.println();
                        c++;
                    }
                }
         
            }
            
        }
        System.out.println("C= "+c);
    
    }
}