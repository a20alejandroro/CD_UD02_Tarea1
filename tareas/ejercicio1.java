/*
 * Signo del zodíaco
 * Crea que al introducir el año que naciste te devuelva
tu signo del zodíaco chino.
Para conocer el signo del horóscopo chino, debemos
dividir el año de nacimiento entre 12. El resto, entre
0 y 11, está asociado a un signo según la siguiente
tabla:

0 -Mono
1- Gallo
2 -Perro
2 - Cerdo
4 -Rata 
5- Buey 
6 - Tigre
7 - Conejo
8 - Dragón
9 -Serepiente
10- Caballo
11 - Cabra 

 */

 import java.util.Scanner;
 public class ejercicio1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu año de nacimiento: ");
        int ano=sc.nextInt();
        int zodiaco=ano%12;
        System.out.println("Tu horoscopo chino es: "+zodiaco);
    }
 }

