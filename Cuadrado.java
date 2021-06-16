package IntroduccionObjetos;
import java.util.*;
public class Cuadrado{
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("***Cuadrado***");
		Cuadrado t = new Cuadrado(5);
		t.perimetro();
		t.area();

		
	}
	private int lado =0;

	public Cuadrado(int lado){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un lado: ");
		lado = scanner.nextInt();
        this.lado = lado;
	}

	public void setCuadrado(int ancho){
        this.lado = lado;
    }

    public int getCuadrado(){
        return lado;
    }
	public void perimetro(){
		int perimetro;

		perimetro = 4*lado; 
		System.out.println("El perimetro es: "+perimetro);

	}

	public void area(){
		int area;

		area = lado*lado;
		System.out.println("El area es: " + area);

	}
}