/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos;

/**
 *
 * @author lprie
 */
@SuppressWarnings("serial")
public class VectorLlenoException extends Exception{
    
    public VectorLlenoException(){
        super();
    }
    
    public VectorLlenoException(String cadena){
        super(cadena);
    }
    
}
