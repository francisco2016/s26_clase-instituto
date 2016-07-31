import java.util.Arrays;
import java.util.Random;
public class TestAlumno
{
    private Random aleatorio;
    public static final int CUANTOS_ALUMNOS = 5;
    public static final int NUMERO_DE_ASIGNATURAS = 5;
    /**
     * Constructor for objects of class TestAlumno
     */
    public TestAlumno(){
         aleatorio = new Random();
    }

    /**
     * una clase Test que genere 5 objetos alumnos con valores aleatorios para los nombres, edades, y notas y que 
     * imprima los datos de todoslos alumnos
     */
    public void testAlumno()
    {
      for(int i = 0; i < CUANTOS_ALUMNOS; i ++){
        Alumno alumno = new Alumno(nombresAleatorios(), aleatorio.nextInt(45) +6);
        for(int cont = 0; cont < NUMERO_DE_ASIGNATURAS; cont ++ ){
            alumno.notesAlum(aleatorio.nextInt(10) +1);
        }
        alumno.datosAlumno();
      }
    }

    /**
     * mt para generar nombre aleatorios.
     */
    private String nombresAleatorios(){
        String[] conso ={"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "x", "y", "z"};
        String[] voca ={"a", "e", "i", "o", "u"};
        String nombre = null;
        
              nombre = conso[aleatorio.nextInt(conso.length)].toUpperCase()+voca[aleatorio.nextInt(voca.length)]+
              conso[aleatorio.nextInt(conso.length)]+voca[aleatorio.nextInt(voca.length)]+conso[aleatorio.nextInt(conso.length)]+
              "  " +voca[aleatorio.nextInt(voca.length)].toUpperCase()+
            conso[aleatorio.nextInt(conso.length)]+voca[aleatorio.nextInt(voca.length)]+conso[aleatorio.nextInt(conso.length)];

        return nombre;
    }
}












