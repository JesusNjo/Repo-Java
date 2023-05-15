/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishPractice;

/**
 *
 * @author JesusNjo
 */
public class InglesClass {
    private String frase;
    private String traduccion;

    public InglesClass() {
    }

    public InglesClass(String frase, String traduccion) {
        this.frase = frase;
        this.traduccion = traduccion;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }
    
    
}
