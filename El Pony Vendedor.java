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
	private int totaldulces;
	private int totalfrituras;
	private int totalhuevo;
	private int totalrefresco;
	private static int totalleche;
    public static void main(String[] args) {
        
         
        System.out.println("Bienvenido al 'Pony comprador'");
        System.out.println("Estos productos están a la venta");
        
        int respuesta;
        int respuesta2;

        float totaldulces = 0;
        float total = 0;
        float totalleche = 0;
        float totalfrituras =0;
        float totalhuevo = 0;
        float totalrefresco = 0;
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
			 totalleche = cantidadleche*16;
                        System.out.println("Subtotal: "+totalleche);
			break;
		case 2:
			System.out.println("¿cuántas unidades quieres de huevo (kg)?");
			int cantidadhuevo;
			Scanner numerohuevo = new Scanner (System.in);
			cantidadhuevo = numerohuevo.nextInt();
		    totalhuevo = cantidadhuevo*25;
                        System.out.println("Subtotal: "+totalhuevo);
			break;
		case 3: 
			System.out.println("¿cuántas unidades quieres de refresco?");
			int cantidadrefresco;
			Scanner numerorefresco = new Scanner (System.in);
			cantidadrefresco = numerorefresco.nextInt();
			 totalrefresco = cantidadrefresco*20;
                        System.out.println("Subtotal: "+totalrefresco);
			break;
		case 4:
		System.out.println("¿cuántas unidades quieres de frituras?");
		int cantidadfrituras;
		Scanner numerofrituras = new Scanner (System.in);
		cantidadfrituras = numerofrituras.nextInt();
		totalfrituras = cantidadfrituras*7;
                System.out.println("Subtotal: "+totalfrituras);
		    break;
		  
		case 5:
			System.out.println("¿cuántas unidades quieres de dulces?");
			int cantidaddulces;
			Scanner numerodulces = new Scanner (System.in);
			cantidaddulces = numerodulces.nextInt();
			 totaldulces = cantidaddulces*5;
                        System.out.println("Subtotal: "+totaldulces);
			
			break;
		
			
		}
                System.out.println("¿Quieres comprar algo más 1 para si 2 para no?");
		Scanner resp = new Scanner (System.in);
		respuesta = resp.nextInt();
		}while (respuesta == 1);
		           
        	       
            	   
           		
                   total = totalleche + totaldulces+ totalfrituras + totalhuevo+ totalrefresco;
                   System.out.println("Su total es: "+total);
              
	}
		
	
	public void presentacion (){
		System.out.println(this.codigo+"  "+this.nombre+" $"+this.precio);
		}
     
        
}

        
