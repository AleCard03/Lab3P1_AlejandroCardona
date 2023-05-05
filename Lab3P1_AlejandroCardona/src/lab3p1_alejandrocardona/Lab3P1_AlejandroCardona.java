/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_alejandrocardona;
import java.util.Scanner;
/**
 *
 * @author jets
 */
public class Lab3P1_AlejandroCardona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean continuar = true;
        while(continuar){
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola");
            System.out.println("3. ¡OK Boomer!");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción");
            int opcion = read.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("Puntos a ingresar");
                    int ptos = read.nextInt();
                    double acum = 0;
                    for(int i = 1; i<= ptos; i++){
                        System.out.println("Ingrese una coordenada X");
                        double x = read.nextInt();
                        System.out.println("Ingrese una coordenada Y");
                        double y = read.nextInt();
                        double maths =  x - y;
                        double maths2 = Math.pow(maths , 2);
                        acum += maths2;
                    }//fin for i
                    acum = Math.sqrt(acum);
                    System.out.println(acum);
                }//fin case 1
                break;
                case 2: {
                    System.out.println("Ingrese el tamaño de la Pokebola");
                    int n = read.nextInt();
                    for(int i = 1; i<= n; i++){
                        for ( int j = 1 ; j<= n*2-1; j++){
                            if((i==n/2 || i == n/2+2) && (j >= (n*2+1)/3) && (j < 2*(n*2+2)/3)){
                                System.out.print("#");
                            }
                            else if(i==n/2+1 && ((j<=(n*2-1)/3) || (j>2*(n*2-1)/3+1))&& (j>1 && j<n*2-1)){
                                System.out.print("#");
                            }
                            else{
                                if(i<n/2+1||i==n){
                                  System.out.print("*");  
                                }
                                else if(i>=n/2+1&&(j==1 || j==n*2-1)){
                                    System.out.print("*");
                                }
                                else{
                                    System.out.print(" ");
                                }
                                
                            }
                        }//fin for j
                        System.out.println(" ");
                    }//fin for i
                }//fin case 2
                break;
                case 3: {
                    System.out.println("Ingrese su año de nacimiento: ");
                    int año = read.nextInt();
                    if(año>=1946 && año<1960){
                        System.out.println("¡Felicidades, usted es de la Baby Boomer Gen");
                    }//fin if BBG
                    else if ( año >= 1960 && año <1975){
                        System.out.println("¡Felicidades, usted es de la eneración X!");
                    }//fin else if GenX
                    else if(año>=1975 && año <1980){
                        System.out.println("¡Felicidades, usted es de la generación Xennials!");
                    }//fin else if Xennials
                    else if ( año >= 1980 && año <1990){
                        System.out.println("¡Felicidades, usted es de la generación Millenials!");
                    }//fin else if Millenials
                    else if ( año >= 1990 && año <= 2012){
                        System.out.println("¡Felicidades, usted es de la generación Gen Z!");
                    }//Fin GenZ
                    else if (año >= 2013 && año <= 2025){
                        System.out.println("¡Felicidades, usted es de la generación Alpha!");
                    }//fin else if Gen Alpha
                }//fin case 3
                break;
                case 4:{
                    continuar = false;
                }//fin case 4
                break;
                default: {
                    System.out.println("El numero ingresado no es válido");                    
                }//fin default
                break;
            }//fin switch
        }//fin while continuar
// TODO code application logic here
    }//fin main
    
}//fin class
