
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
        
        //Test V1
//        testData.add("");
//        testData.add("curt");
//        testData.add("curt1");
//        testData.add("passsensenum");
//        testData.add("1234567890");
//        testData.add("            ");
//        testData.add("1validpass");
//        
        //Test V2
        testData.add("");
        testData.add("curt");
        testData.add("curt1");
        testData.add("passsensenum");
        testData.add("1234567890");
        testData.add("            ");
        testData.add("*1novalidpass");
        testData.add("1novalidpass&");
        testData.add("lletra+simbols");
        testData.add("1234567*1234567");
        testData.add("Lletra+Simb0ls");
        testData.add("*Lletra+Simb0ls");
        testData.add("Lletra+Simb0ls!");
        testData.add("*L1etra+Simb0ls");
        testData.add("L1etra+Simb0ls!");
        testData.add("L1etra+Simb0ls");
        
        
        System.out.println("Test");
        for (String word:testData){
            System.out.println("Validate word " + word + " = " + p.validate(word));
        }
    
        
    
    }
    
}
