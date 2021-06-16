package IntroduccionObjetos;
public class Contador2{
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("***Contador2***");
        Contador2 t = new Contador2(5);
        Contador2 e = new Contador2(4);
        t.incrementar();
        t.mostrarDatos();
        e.incrementar();
        e.mostrarDatos();
        t.decrementar();
        t.cargarDatos();
        e.decrementar();
        e.cargarDatos();
    }
    private int cont;

    public Contador2(int cont){
        this.cont = cont;
    }


    public void setCont2(int cont){
        this.cont = cont;
    }

    public int getCont2(){
        return cont;
    }

    public void incrementar(){
        cont++;
    }

    public void decrementar(){
        cont--;
    }

    public void mostrarDatos(){
        System.out.println("El incremento es: " + cont);
    }

    public void cargarDatos(){
        System.out.println("El decremento es: " + cont);
    }


 //fin del programa   
}
