/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author Kevin
 */
public class PasswordValidator {

    // Min pass length
    private static final int MIN_PASSWORD_LENGTH = 8;

    public boolean validatePassword(String password) {
        return isLengthValid(password) && hasUpperCase(password) && hasDigit(password);
    }

    // Checks if pass has min required length
    
    private boolean isLengthValid(String password) {
        return password.length() >= MIN_PASSWORD_LENGTH;
    }

    //Checks if the password contains at least one uppercase letter.

    private boolean hasUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

  // Checks if the pass contains at least one number

    private boolean hasDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}