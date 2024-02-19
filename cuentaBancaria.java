import java.util.Scanner;

public class Cuenta {
    
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    //CONSTRUCTOR

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual){

        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    public Cuenta(){};

    
    // Métodos getters y setters para numeroCuenta
    public int getNumeroCuenta() {
           return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
          this.numeroCuenta = numeroCuenta;
    }


    // Métodos getters y setters para dniCliente
    public long getDniCliente() {
        return dniCliente;
    }
    
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    
    // Métodos getters y setters para saldoActual
    public double getSaldoActual() {
        return saldoActual;
    }
    
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Método para crear un objeto Cuenta pidiendo los datos al usuario
   
    public static Cuenta crearCuentaDesdeConsola() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();
        
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();
        
        System.out.println("Ingrese el saldo actual:");
        double saldoActual = scanner.nextDouble();
        
        return new Cuenta(numeroCuenta, dniCliente, saldoActual);
    }

    //Metodo para ingresar saldo

    public void ingresar(double ingreso){

        saldoActual+=ingreso;
        System.out.println("Se ingreso $"+ ingreso + "a la cuenta bancaria nro. :"+ numeroCuenta);
    }

    //Metodo para retirar dinero

    public void retirar(double retiro){

        if (saldoActual>=retiro){

            saldoActual-=retiro;
            System.out.println("Se han retirado $"+ retiro + "de la cuenta" + numeroCuenta);
        }
        else{
            saldoActual=0;
           System.out.println("Saldo infuciente para realizar la operación, su saldo actual es "+ saldoActual);
        }

    }

    //Metodo Extraccion Rapida

    public void extraccionRapida(){

        double extraccionPermitida=saldoActual*0.20;
        if (extraccionPermitida>0){

            saldoActual-=extraccionPermitida;
            System.out.println("Se realizo una extraccion rapida con monto de $" + extraccionPermitida + "de la cuenta nro. "+ numeroCuenta);
        }
        else{

            System.out.println("Saldo infuciente para realizar la operacción.");
        }

    public double saldoDisponible(){
            System.out.println("El saldo disponible es "+ saldoDisponible+ "correspondiente a la cuenta nro. "+ numeroCuenta);

}


    }













}
