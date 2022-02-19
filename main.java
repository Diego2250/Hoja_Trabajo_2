import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author Diego Morales
 */
public class main {
	
	public static void main(String[] args)throws Exception{
		CalculadoraPosfix calc = new CalculadoraPosfix();
		try {
            File file = new File("datos.txt");
            Scanner s = new Scanner(file);
            while(s.hasNextLine()){
            String data = s.nextLine();
            System.out.println("Se ha leido del archivo: ");
            System.out.println(data); 
            try {
                calc.Evaluate(data);
                System.out.println("El resultado de esta operación es: ");
                System.out.println(calc.resultado);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, por favor, intentalo de nuevo con una expresión diferente"); 
            }
    
            }
            s.close(); 
        } catch(FileNotFoundException e){
            e.printStackTrace(); 
        }
	  }
}