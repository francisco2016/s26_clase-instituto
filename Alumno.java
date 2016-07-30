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
    //constante para determinar la nota mínima de aprobado.
    public static final int NOTA_DE_APROBADO = 5; 

    public Alumno(String nameAlum, int ageAlum) {
        this.nameAlum = nameAlum;
        this.ageAlum = ageAlum;
        aulaNum += sumador;
        sumador ++;
        
        notes = new double[0];
    }
    
        //permita introducir una nota entera del alumno. Este método se peude invocar tantas veces como deseemos.
    public void notesAlum(int note){
        if(note < 0 || note > 10){
            note = 5; 
        }
        double[] notes2 = notes;
        notes = new double[notes.length +1];
        for(int i = 0; i < notes2.length; i ++){
            notes[i] = notes2[i];
        }
        notes[notes2.length] = note;
    }
    
     /**
     * permita conocer la nota media (en decimal) del alumno en este momento
     */
    public double averageRating(){
        double notaM = 0;
        for(int i = 0; i < notes.length; i ++){
            notaM += notes[i];
        }
        return notaM / notes.length;
    }
    
     /**
     * indique si el alumno esta aprobado o no en función de su nota media actual
     */
    public boolean estaAprobado(){
        return averageRating() >= NOTA_DE_APROBADO;
    }
    
        /**
     * muestre todos los datos del alumno: nombe, edad, numero de clase, notas, nota media y si esta o no aprobado.
     */
    public void datosAlumno(){
        System.out.println("----- DATOS DEL ALUMNO/A -----");
        System.out.println("Nombre;    " +nameAlum+ "\nEdad;      " +ageAlum+ "\nNotas; ");
        for(int i = 0; i < notes.length; i ++){
            System.out.println( (i +1)+ " --- " +notes[i]);
        }
        System.out.println("Nota media;  " +averageRating());
        System.out.println("¿El alumno/a está aprobado? " +estaAprobado());
        System.out.println("    ----------------------------");  
    }
}







