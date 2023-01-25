package area;
import java.util. Scanner; 
public class rectangulo {
static Scanner entrada;
public static void main(String[] args) {
	entrada= new Scanner (System.in);
	rectangulo1 p= new rectangulo1();
	int opc;
	System.out.println("Ingrese una opcion:\n 1.-area del rectangulo \n 2.- perimetro del rectangulo\n 3.-circunferencia del circulo \n 4.- area del circulo \n 5- Diagonal del rectangulo \n 6.- salida");
	opc = entrada.nextInt();
	switch(opc) {
	case 1: 
		p.datos();
		p.areadelrectangulo();
		break;

	case 2:
		p.datos();
		p.perimetrodelrectangulo();
		break;
	case 3:
	p.datos2();
	p.circunferenciadelcirculo();
		break;
	case 4:
			p.datos2();
			p.areaciadelcirculo();
		break;
	
	case 5:
		p.datos();
		p.diagonaldelrectangulo();
		break;
		
	case 6
		System.exit(0);
		defaul:
			System.out.println("Opcion Incorrecta");
	break;
	}
		
}}


