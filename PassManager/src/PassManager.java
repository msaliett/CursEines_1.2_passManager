
import cat.proven.Password;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



/**
 *
 * @author roser
 */
public class PassManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

         Password p = new Password();
        boolean b;
        
        List<String> testData = new ArrayList<>();
        
        testData.add("");
        testData.add("curt");
        testData.add("curt1");
        testData.add("passsensenum");
        testData.add("1234567890");
        testData.add("            ");
        testData.add("1validpass");
        
        System.out.println("Test");
        for (String word:testData){
            System.out.println("Validate word " + word + " = " + p.validate(word));
        }
    
        
    
    }
    
}
