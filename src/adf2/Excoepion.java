
package adf2;

/**
 *
 * @author Duc
 */
public class  Excoepion{
    
     public static void main(String[] args) {
        String name = "chan , doi , lam , gi , day " ;
        String[] arrayName = name.split(",");    
        for (int  i = 0 ;i < arrayName.length;i++){
         System.out.println(i+ 1 + "." + arrayName[i]);
     }
    }
}
