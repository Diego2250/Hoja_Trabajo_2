/******************************************************************
archivo.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021

Modelo de archivo para uso del Controlador.
******************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class Archivo{
/*Constructor de clase*/
  public Archivo(){

  }
      /*Metodo para leer el archivo
      @param archivo
      */
  public void leer(String archivo){
    try {
      File myObj = new File(archivo);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}



