/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_foryswitch_linsyposso;

import java.util.Scanner;

/**
 *
 * @author 29164
 */
public class Ejercicios_forYswitch_LinsyPosso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner balerion = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu");
            System.out.println("1. Cuantos numeros pares e impares hay entre este rango?");
            System.out.println("2. Triangulos y mas triangulos");
            System.out.println("3. Anita lava la tina ");
            System.out.println("4. Codigos secretos");
            System.out.println("5. Salida");
            System.out.print("Ingrese una opcion: ");
            int opcion = balerion.nextInt();
            balerion.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero para el rango: ");
                    int numero_rango = balerion.nextInt();

                    System.out.println("Entre 0 y " + numero_rango + " existen los siguientes numeros:");
                    int contadorPares = 0;
                    int contadorImpares = 0;
                    System.out.print("Numeros Pares: ");
                    for (int drogon = 0; drogon <= numero_rango; drogon++) {
                        if (drogon % 2 == 0) {
                            System.out.print(drogon + " ");
                            contadorPares++;
                        }
                    }
                    System.out.println("siendo un total de: " + contadorPares + " pares");

                    System.out.print("Numeros Impares: ");
                    for (int drogon = 0; drogon <= numero_rango; drogon++) {
                        if (drogon % 2 != 0) {
                            System.out.print(drogon + " ");
                            contadorImpares++;
                        }
                    }
                    System.out.println("siendo un total de: " + contadorImpares + " impares");
                    break;
                case 2:
                    System.out.println("Seleccione el tipo de triángulo que desea");
                    System.out.println("1. Triángulo rectángulo");
                    System.out.println("2. Triángulo equilátero");
                    System.out.print("Opcion: ");
                    int triangulo = balerion.nextInt();

                    System.out.println("Ingrese la altura del triángulo");
                    int altura = balerion.nextInt();

                    for (int i = 0; i < altura; i++) {
                        if (triangulo == 1) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("* ");
                            }
                        } else if (triangulo == 2) {
                            for (int j = 0; j < altura - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k <= i; k++) {
                                System.out.print("* ");
                            }
                        } else {
                            System.out.println("Opción invalida");
                            break;
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Ingresa una palabra: ");
                    String palabra = balerion.nextLine().toLowerCase().replaceAll("\\s+", "");
                    boolean esPalindroma = true;
                    for (int i = 0; i < palabra.length() / 2; i++) {
                        if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                            esPalindroma = false;
                            break;
                        }
                    }
                    if (esPalindroma) {
                        System.out.println("La palabra " + palabra + " es palíndroma.");
                    } else {
                        System.out.println("La palabra " + palabra + " no es palíndroma.");
                    }
                    break;
                case 4:
                    System.out.print("Ingresa una cadena de texto: ");
                    String cadenaOriginal = balerion.nextLine();
                    String resultadoDecadena = "";
                    for (int i = 0; i < cadenaOriginal.length(); i += 2) {
                        char letter = cadenaOriginal.charAt(i);
                        int count = cadenaOriginal.charAt(i + 1) - '0';
                        for (int j = 0; j < count; j++) {
                            resultadoDecadena += letter;
                        }
                    }
                    System.out.println("La cadena resultante es: " + resultadoDecadena);
                    break;
                case 5:
                default:
                    System.out.println("Byee:)");
                    break;
            }

        }

    }
}