package IntroduccionObjetos;
public class Circulo{
	public static void main(String[] args) {
	    System.out.println("");
		System.out.println("***Circulo***");
		Circulo t = new Circulo(5);
		t.perimetro();
		t.area();
		t.mostrarDatos();
		
	}

	private double radio;
	private double pi = 3.1416;

	public Circulo(double radio){
		this.radio = radio;

	}

	public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }


	public void perimetro(){
		double perimetro;
		perimetro=2*pi*radio;
		System.out.println("El perimetro es: " + perimetro);

	}

	public void area(){
		double area;
		area = radio*radio*pi;
		System.out.println("El area es: " + area);

	}

	public void mostrarDatos(){
		


	}

}