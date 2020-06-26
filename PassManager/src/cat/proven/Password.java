
package cat.proven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author roser
 */
public class Password {

    public Password() {
    }
    
    /**
     * Validates according security requirements password strength
     * @param toValidate
     * @return true if passwords satisfy security requirements
     */
    public boolean validate(String toValidate){
            boolean b = false;
            // Pattern for special symbols (not letter nor digit).
            Pattern pat = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
            
            if (toValidate.length()< 10) {
                b= false;
            } else {
                // match all vs special symbol
                Matcher m = pat.matcher(toValidate);
                // match first char vs special symbol
                Matcher begin = pat.matcher(toValidate.substring(0, 1));
                // match last char vs special symbol
                Matcher end = pat.matcher(toValidate.substring(toValidate.length()-1,toValidate.length()));
                b = 
                     
                    //Minimum 2 digits    
                    (toValidate.chars().filter(Character::isDigit).count()>1) &&
                    // Some character
                    (toValidate.chars().anyMatch(Character::isLetter))        &&   
                    // Some upper case    
                    (toValidate.chars().anyMatch(Character::isUpperCase))     &&
                    // Some lower case    
                    (toValidate.chars().anyMatch(Character::isLowerCase))     && 
                    // a special symbol
                    m.find()                                                  &&  
                    // Avoid special symbol at first character
                    !begin.find()                                             &&
                    // Avoid special symbol at last character
                    !end.find();
                
           
            }
            return b;
    }
}
