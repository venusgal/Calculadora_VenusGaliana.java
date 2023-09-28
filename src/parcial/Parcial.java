
package parcial;

import java.util.Scanner;

public class Parcial {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //le pido al usuario que ingrese una ocion y declaro las variables
        int opcion=1;
        System.out.println("Ingrese una opcion");
        System.out.println("ingrese 1 para suma, 2 para resta, 3 para multiplicacion, 4 para division, 5 para realizar una secuencia de operciones y 6 para salir");
        do{
            System.out.println("OPcion incorrecta, ingresela nuevamente");
            opcion=sc.nextInt();
        }while(opcion<=1 && opcion>=6);
        int num1;
        int num2;
        int resultado=0;
        int opcion2;
        int num_para_secuencia;
        //creo un bucle para verificar la opcion ingresada sea correcta, de lo contrario se le pedira la opcion nuevamente
        
        //creo la calculadora, si ingresa 6 finaliza
        while(opcion!=6){
            System.out.println("ingrese 1 para suma, 2 para resta, 3 para multiplicacion, 4 para division, 5 para realizar una secuencia de operciones y 6 para salir");
            opcion=sc.nextInt();
            //dependiendo de la opcion ingresada realiza una operacion
            switch(opcion){
                case 1:
                    System.out.println("Selecciono suma");
                    System.out.println("Ingrese el primer numero: ");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2=sc.nextInt();
                    resultado=num1+num2;
                    System.out.println("El resultado es: "+ resultado);
                    break;
                case 2:
                    
                    System.out.println("Selecciono resta");
                    System.out.println("Ingrese el primer numero: ");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2=sc.nextInt();
                    resultado=num1-num2;
                    System.out.println("El resultado es: "+ resultado);
                    break;
                case 3:
                    System.out.println("Selecciono multiplicacion");
                    System.out.println("Ingrese el primer numero: ");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2=sc.nextInt();
                    resultado=num1*num2;
                    System.out.println("El resultado es: "+ resultado);
                    break;
                case 4:
                    System.out.println("Selecciono division");
                    System.out.println("Ingrese el primer numero: ");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2=sc.nextInt();
                    if (num1==0 || num2==0) {
                        System.out.println("No se puede hacer una division por 0");
                    }else{
                        resultado=num1/num2;
                        System.out.println("El resultado es: "+ resultado);
                    }
                    break;
                case 5:
                    System.out.println("Selecciono secuencia de operaciones");
                    System.out.println("La seccuencia se realizara con el resultado de la anterior operacion ("+ resultado+")");
                    System.out.println("Ingrese la opercion a realizar, 1 para suma, 2 para resta, 3 para multiplicacion, 4 para division y 5 para salir");
                    opcion2=sc.nextInt();
                    num_para_secuencia=resultado;
                    //verifico que la opcion sea correcta, sino se le pedira nuevamente la opcion hasta que sea correcta
                    if (opcion<=1 && opcion>=5) {
                        while(opcion<=1 && opcion>=5){
                            System.out.println("La opcion ingresada no es correcta, porfavor ingrese nuevamente la opcion");
                            opcion2=sc.nextInt();
                        }
                    }
                     
                    while(opcion2!=5){
                        switch(opcion2){
                            case 1:
                                System.out.println("Selecciono suma");
                                System.out.println("Ingrese otro numero para sumarlo");
                                num2=sc.nextInt();
                                num_para_secuencia+=num2;
                                break;
                            case 2:
                                System.out.println("Selecciono resta");
                                System.out.println("Ingrese otro numero para restarlo");
                                num2=sc.nextInt();
                                num_para_secuencia-=num2;
                                break;
                            case 3:
                                System.out.println("Selecciono multiplicacion");
                                System.out.println("Ingrese otro numero para multiplicarlo");
                                num2=sc.nextInt();
                                num_para_secuencia*=num2;
                                break;
                            case 4:
                                System.out.println("Selecciono suma");
                                System.out.println("Ingrese otro numero para dividirlo");
                                num2=sc.nextInt();
                                if (num2==0) {
                                    System.out.println("no se puede dividir por 0");
                                }else{
                                    num_para_secuencia/=num2;
                                }
                                break;
                            case 5:
                                break;
                        }
                    }
            }
            
        }
    }
    
}
