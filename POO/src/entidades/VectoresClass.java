/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package entidades;

/**
 *
 * @author JesusNjo
 */
public class VectoresClass {
    
    private double[] vectorGrande =new double[50];
    private double[] vectorPequenio =new double[20];

    public VectoresClass() {
    }

    public double[] getVectorGrande() {
        return vectorGrande;
    }

    public void setVectorGrande(double[] vectorGrande) {
        this.vectorGrande = vectorGrande;
    }

    public double[] getVectorPequenio() {
        return vectorPequenio;
    }

    public void setVectorPequenio(double[] vectorPequenio) {
        this.vectorPequenio = vectorPequenio;
    }
    
    
    
}
