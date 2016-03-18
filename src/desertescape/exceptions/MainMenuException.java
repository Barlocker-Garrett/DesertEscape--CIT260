/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desertescape.exceptions;

/**
 *
 * @author Garrett
 */
public class MainMenuException extends Exception{

    public MainMenuException() {
    }

    public MainMenuException(String message) {
        super(message);
    }

    public MainMenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainMenuException(Throwable cause) {
        super(cause);
    }

    public MainMenuException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
