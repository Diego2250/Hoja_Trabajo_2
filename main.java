import java.io.File;
import java.util.Scanner;
/**
 * @author Diego Morales
 *
 */
public class main {
	
static String ln;
	/***
	 * Funcion del programa principal
	 * @param args si es necesario agregar argumentos al ejecutar 
	 * @throws Exception
	 */
	public static void main(String[] args)throws Exception{
		CalculadoraPosfix calc = new CalculadoraPosfix();
		//File file = new File("datos.txt");
        //Scanner s = new Scanner(file);
		//while(s.hasNextLine()){
		 //ln = s.nextLine();
		 //}
		calc.Evaluate("6 2 3 + * ");
		System.out.println(calc.resultado);

	  }
}