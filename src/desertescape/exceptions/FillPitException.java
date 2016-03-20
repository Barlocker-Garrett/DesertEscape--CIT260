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
public class FillPitException extends Exception{

    public FillPitException() {
    }

    public FillPitException(String message) {
        super(message);
    }

    public FillPitException(String message, Throwable cause) {
        super(message, cause);
    }

    public FillPitException(Throwable cause) {
        super(cause);
    }

    public FillPitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
