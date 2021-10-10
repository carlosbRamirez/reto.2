import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  

public class Inventario {

static List<Maleta> maletas = new ArrayList<Maleta>();

	
	public Inventario() {	
		
	}
	
	public static void agregarMaleta(String comando) {
		
		String items[] = comando.split("/");
		if(items[1].equals("Viaje")) {
			Viaje viaje = new Viaje(items[2],items[3],items[4],items[5]);
			maletas.add(viaje);
			
		}else {
			Trabajo trabajo = new Trabajo(items[2],items[3],items[4],items[5]);
			maletas.add(trabajo);
		}
	}
	
	public static void listarMaletas() {
		System.out.println("***Inventario de maletas***");
		for(int i = 0; i < maletas.size(); i++) {
            System.out.println(maletas.get(i));
       
        }	
	}
	
	
	public static void procesarComandos(String comando) {
		String items[] = comando.split("/");
			switch (items[0]){
            case "1":  agregarMaleta(comando);
                     	
                     	break;
            case "2":  listarMaletas();
                     	break;
                     	
			}
	
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    String comando = sc.nextLine();
	    String items[] = comando.split("/");
	    boolean isValid = true;
	    do {
	    	procesarComandos(comando);
	    	comando =sc.nextLine();
	    	if(comando.equals("3")){
	    		isValid=false;
	    	}else {
	    		isValid=true;
	    	}
	    	
		} while (isValid);

	}
}