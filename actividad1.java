import java.util.Scanner;

public class actividad1 {
    

    public class MiClase {
    //ATRIBUTOS 
     private int numero1;
     private int numero2;

    //METODOS

    //CONSTRUCTORES

    public MiClase(int numero1, int numero2){

        this.numero1=numero1;
        this.numero2=numero2;
    }

    public MiClase(){}

    //GET Y SET

    public int getNumero1(){
        return numero1;
    }

    public int getNumero2(){
        return numero2;
    }

    public void setNumero1(int numero1){
        this.numero1=numero1;
    }

    public void setNumero2(int numero2){
        this.numero2=numero2;
    }


    //METODO PARA CREAR OPERACION

    public void crearOperacion(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        numero1=scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        numero2=scanner.nextInt();
    }

    public int sumar(){

        return (numero1+numero2);
    }

    public int restar(){
    
        return (numero1-numero2);
    }

    public int multiplicar(){

        if(numero1==0 || numero2==0){
            System.out.println("ERROR: Multiplicacion por cero. El resultado es 0.");
            return 0;
        }
        else{
        return numero1*numero2;
        }
    }
}
