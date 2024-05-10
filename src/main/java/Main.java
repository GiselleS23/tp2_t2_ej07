/* 7.- Se ingresa nombre, sexo y edad de 3 personas. Se pide averiguar cuántos mujeres tienen entre 20 y 30 años y cuantos hombres son menores a 37 años. 
Sacchetti Maria Giselle C2*/

import java.util.Scanner;


    public class Main {
      public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contadorMujeres = 0;
        int contadorHombres = 0;

        for (int i = 1; i <= 3; i++) {
          System.out.println("Ingrese el nombre de la persona " + i + ":");
          String nombre = scanner.nextLine();

          System.out.println("Ingrese el sexo de la persona " + i + " (M/F):");
          String sexo = scanner.nextLine();

          System.out.println("Ingrese la edad de la persona " + i + ":");
          int edad = scanner.nextInt();
          scanner.nextLine(); 

          if (sexo.equalsIgnoreCase("F") && edad >= 20 && edad <= 30) {
            contadorMujeres++;
          } else if (sexo.equalsIgnoreCase("M") && edad < 37) {
            contadorHombres++;
          }
        }
        System.out.println("Cantidad de mujeres entre 20 y 30 años: " + contadorMujeres);
        System.out.println("Cantidad de hombres menores a 37 años: " + contadorHombres);
      
        scanner.close();
      }
}