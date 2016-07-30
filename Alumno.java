import java.util.Arrays;
/**
 * . Cada alumno se caracteriza por un nombre, una edad, su número de clase (que empieza en 1 para el primer alumno
 * y que debe generarse automáticamente, es decir, no se pasa como parámetro al constructor). 
 */
public class Alumno
{
    private String nameAlum;
    private int ageAlum;
    //variables para facilitar la numeración de las aulas.
    private static int sumador = 1;
    private int aulaNum;
    
    private double[] notes;
    

    public Alumno(String nameAlum, int ageAlum) {
        this.nameAlum = nameAlum;
        this.ageAlum = ageAlum;
        aulaNum += sumador;
        sumador ++;
        
        notes = new double[0];
    }
}







