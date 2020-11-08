
package lbex12;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class maxrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num[]={84,2,635,100,9,56,1000,32};
        m<Integer>obj1=new m<>(num);
        obj1.display();
        
       
    }
    
}
class m<T >
{
    T[] value;
    
    public m(T[] value)
    {
        this.value=value;
        
    }

    public void display()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the range");
        System.out.println("Beginning limit:");
        int b=obj.nextInt();
        System.out.println("Ending limit:");
        int e=obj.nextInt();
        int ma=0;
        
        for(b=0;b<e;b++)
            {
                int w =Integer.parseInt(""+ value[b]);
                if(w>ma)
                {
                    ma=w;
                }
            }
             
        
        System.out.println("Maximum number in the range"+ma);
    }

}
