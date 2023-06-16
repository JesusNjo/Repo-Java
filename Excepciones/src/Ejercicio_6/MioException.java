/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

/**
 *
 * @author JesusNjo
 */
public class MioException extends Exception {

    /**
     * Creates a new instance of <code>MioException</code> without detail
     * message.
     */
    public MioException() {
    }

    /**
     * Constructs an instance of <code>MioException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MioException(String msg) {
        super(msg);
    }
}
