import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private ArrayList<Alumno> alumnos;
    private Random aleatorio;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        alumnos = new ArrayList<>();
        aleatorio = new Random();
    }

    public void test1()
    {
        Random rdm = new Random();
        for(int index = 0; index<5; index++){
            Alumno alumno = new Alumno("a",rdm.nextInt(100));
            alumno.notasDelAlumno(rdm.nextInt(10));
            alumno.notasDelAlumno(rdm.nextInt(10));
            alumno.datosAlumno();
            System.out.print("**************************************\n");
        }
    }
}