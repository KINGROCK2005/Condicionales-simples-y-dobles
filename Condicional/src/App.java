import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //Sentencia condicional simple
       Scanner lector = new Scanner(System.in);
        System.out.println("Edad: ");
        byte edad = lector.nextByte();
        System.out.println("f/m?: ");
        char sexo = lector.next() .charAt(0);
       if((edad == 5 || sexo == 'f') && (edad == 10 && sexo == 'm')){
        System.out.println("Dentro del if");
        System.out.println("Dentro del if");

       } else{
       System.out.println("Dentro del if");
            }
    }
}
