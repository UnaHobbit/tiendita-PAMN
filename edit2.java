package productos;
import java.util.Scanner; 

public class Productos {

    public Productos (String nombre,float precio, int codigo){
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.codigo = codigo;
	}
	String nombre;
	float precio;
	int cantidad;
	int codigo;
    public static void main(String[] args) {
        
         
        System.out.println("Bienvenido");
        System.out.println("Estos productos están a la venta");
        
        int respuesta;
		
		do{ 
		
		Productos leche = new Productos ("leche", 16 , 1);
		Productos huevo = new Productos ("huevo", 25, 2);
		Productos refresco = new Productos ("refresco", 20, 3);
		Productos frituras = new Productos ("frituras", 7, 4);
		Productos dulces = new Productos ("dulce", 5, 5);
                
	
		leche.presentacion ();
		huevo.presentacion();
		refresco.presentacion();
		frituras.presentacion();
		dulces.presentacion();
		
		
		System.out.println ("Ingresa el número del producto");
		int numero;
		Scanner numeroleido = new Scanner(System.in);
		numero = numeroleido.nextInt();
		
		switch (numero){
		case 1:
			System.out.println("¿cuántas unidades quieres de leche?");
			int cantidadleche;
			Scanner numeroleche = new Scanner (System.in);
			cantidadleche = numeroleche.nextInt();
			float totalleche = cantidadleche*16;
                        System.out.println("Subtotal: "+totalleche);
			break;
		case 2:
			System.out.println("¿cuántas unidades quieres de huevo (kg)?");
			int cantidadhuevo;
			Scanner numerohuevo = new Scanner (System.in);
			cantidadhuevo = numerohuevo.nextInt();
			float totalhuevo = cantidadhuevo*25;
                        System.out.println("Subtotal: "+totalhuevo);
			break;
		case 3: 
			System.out.println("¿cuántas unidades quieres de refresco?");
			int cantidadrefresco;
			Scanner numerorefresco = new Scanner (System.in);
			cantidadrefresco = numerorefresco.nextInt();
			float totalrefresco = cantidadrefresco*20;
                        System.out.println("Subtotal: "+totalrefresco);
			break;
		case 4:
		System.out.println("¿cuántas unidades quieres de frituras?");
		int cantidadfrituras;
		Scanner numerofrituras = new Scanner (System.in);
		cantidadfrituras = numerofrituras.nextInt();
		float totalfrituras = cantidadfrituras*7;
                System.out.println("Subtotal: "+totalfrituras);
		    break;
		  
		case 5:
			System.out.println("¿cuántas unidades quieres de dulces?");
			int cantidaddulces;
			Scanner numerodulces = new Scanner (System.in);
			cantidaddulces = numerodulces.nextInt();
			float totaldulces = cantidaddulces*5;
                        System.out.println("Subtotal: "+totaldulces);
			
			break;
		
			
		}
                System.out.println("¿Quieres comprar algo más 1 para si 2 para no?");
		Scanner resp = new Scanner (System.in);
		respuesta = resp.nextInt();
		}while (respuesta == 1);
               total(totalleche,totalhuevo,totalrefresco,totalfrituras,totaldulces);
	}
		
	
	public void presentacion (){
		System.out.println(this.codigo+"  "+this.nombre+" $"+this.precio);
		}
     
        public void total(float leche,float huevos,float refresco,float frituras,float dulces){
        float total;
        total = leche+huevos+refresco+frituras+dulces;
        System.out.println("Su total es: "+total);
}
}

        
 
