
package cat.proven;

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
            if (toValidate.length()< 8) {
                b= false;
            } else {
            b = (toValidate.chars().anyMatch(Character::isLetter)) && 
                    (toValidate.chars().anyMatch(Character::isDigit));
            }
            return b;
    }
}
