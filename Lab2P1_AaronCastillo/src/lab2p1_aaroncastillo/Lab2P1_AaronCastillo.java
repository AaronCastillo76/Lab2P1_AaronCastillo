
package lab2p1_aaroncastillo;

import java.util.Scanner;


public class Lab2P1_AaronCastillo {


    public static void main(String[] args) {
        int opcion;
        Scanner leer=new Scanner(System.in);
        System.out.println("1. Dibujando triángulos");
        System.out.println("2. Área de figuras");
        System.out.println("3. Evaluando números");
        System.out.println("4. Para salir");
        System.out.print("Ingrese su opcion: ");
        opcion=leer.nextInt();
        while (opcion<4&&opcion>0){
            if (opcion==1){
                int resultado, resultado2, resultado3;
                System.out.println("Dibujando triángulos.");
                System.out.println("Ingrese 3 numeros no negativos para determinar la longitud del triangulo: ");
                System.out.print("Ingrese a: ");
                int a=leer.nextInt();
                System.out.print("Ingrese b: ");
                int b=leer.nextInt();
                System.out.print("Ingrese c: ");
                int c=leer.nextInt();
                if (a>0&&b>0&&c>0){
                    resultado=a+b;
                    resultado2=a+c;
                    resultado3=b+c;
                    if (resultado>c){
                        System.out.println("Las longitudes ingresadas forman un triángulo.");
                    }else if(resultado2>b){
                        System.out.println("Las longitudes ingresadas forman un triángulo.");
                    }else if (resultado3>a){
                        System.out.println("Las longitudes ingresadas forman un triángulo.");
                    }else{
                        System.out.println("Las longitudes ingresadas no forman un triángulo.");
                    }
                }else{
                    System.out.println("Las longitudes no pueden ser negativas.");
                }
            }//fin opcion 1
            if (opcion==2){
                char respuesta='s';
                double area;
                while (respuesta=='s'||respuesta=='S'){
                    System.out.println("Área de figuras");
                    System.out.println("Ingrese la figura a la que desea calcularle el area: ");
                    System.out.println("1. Triangulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("3. Circulo");
                    System.out.print("Opcion: ");
                    opcion = leer.nextInt();
                    if (opcion==1){
                        System.out.print("Ingrese la base: ");
                        double base=leer.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double altura=leer.nextDouble();
                        area=0.5*base*altura;
                        System.out.println("El area del triangulo es: "+area);
                    }//fin opcion 1 ejercicio 2
                    if (opcion==2){
                        System.out.print("Ingrese la base: ");
                        double base=leer.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double altura=leer.nextDouble();
                        area=base*altura;
                        System.out.println("El area del rectangulo es: "+area);
                    }//fin opcion 2 ejercicio 2
                    if (opcion==3){
                        System.out.print("Ingrese el radio: ");
                        double radio=leer.nextDouble();
                        area=Math.PI*radio*radio;
                        System.out.println("El area del circulo es: "+area);
                    }
                    System.out.print("Desea calcular el area de otra figura? [s/n]: ");
                    respuesta=leer.next().charAt(0);
                }//fin while ejercicio 2
            }// fin opcion 2
            if (opcion==3){
                int c=1;
                int primo=0;
                int resultado;
                System.out.print("Ingrese el número que desea evaluar: ");
                int numero=leer.nextInt();
                if (numero%2==0){
                    System.out.println("El número ingresado es par");
                }else{
                    System.out.println("El número ingresado es impar");
                }
                while (c<=numero){
                    resultado=numero%c;
                    c=c+1;       
                    if (resultado==0){
                        primo=primo+1;
                    }
                }
                if (primo==2){
                    System.out.println("Es un numero primo.");
                }
            }//fin opcion 3
            System.out.println("1. Dibujando triángulos");
            System.out.println("2. Área de figuras");
            System.out.println("3. Evaluando números");
            System.out.println("4. Para salir");
            System.out.print("Ingrese su opcion: ");
            opcion=leer.nextInt();
        }
    }
    
}
