import java.util.HashMap;
import java.util.Scanner;
//Se importo el scanner y hasmap

public class Codigo7 {
	//se agrego el main
	public static void main(String[] args) {
		//Le falta agregar el system.in
	    Scanner s = new Scanner(System.in);

	    //En vez de ca debe ser capitales
	    //El tipo de datos debe ser String
	    HashMap<String, String> capitales = new HashMap<>();

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    //Le falta la capital del salvador
	    capitales.put("El Salvador", "San Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = "";
	    do {
	      //Debe ser out en vez de in
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      //Se debe recibir un string por lo que metodo debe cambiar a nextline
	      c = s.nextLine();
	      //Le falta una s al squals
	      if (!c.equals("salir")) {
	    	  //Debe ser capitales no ca
	    	  //Debe buscar por llave no por valor 
	        if (capitales.containsKey(c)) {
	          //Le falta el out
	          System.out.print("La capital de " + c);
	          //Debe ser capitales no ca
	          //El metodo debe ser get para mandar la informacion
	          System.out.println(" es " + capitales.get(c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          //Debe ser capitales no ca
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	      //Le falta un parentesis al final para cerrar el while
	    } while (!c.equals("salir"));
	    //Cerrar el scanner
	    s.close(); 
	}
}