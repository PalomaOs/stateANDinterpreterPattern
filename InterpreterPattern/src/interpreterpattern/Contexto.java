/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreterpattern;

/**
 *
 * @author Palom
 */
public class Contexto {

    public String input;

    public Contexto(String input) {
        this.input = input;
    }

    public void printInWords(String input) {
        this.input = input;
        System.out.println("Imprimir la entrada en palabras:");
        char numero[] = input.toCharArray();
        for (int i = 0; i < numero.length; i++) {
            switch (numero[i]) {
                case '1':
                    System.out.print("Uno ");
                    break;
                case '2':
                    System.out.print("Dos ");
                    break;
                case '3':
                    System.out.print("Tres ");
                    break;
                case '4':
                    System.out.print("Cuatro ");
                    break;
                case '5':
                    System.out.print("Cinco ");
                    break;
                case '6':
                    System.out.print("Seis ");
                    break;
                case '7':
                    System.out.print("Siete ");
                    break;
                case '8':
                    System.out.print("Ocho ");
                    break;
                case '9':
                    System.out.print("Nueve ");
                    break;
                case '0':
                    System.out.print("Cero ");
                    break;
                default:
                    System.out.print("* ");
                    break;
            }
        }
    }
    
    public void getBinaryForm(String input) {
        int binary = Integer.parseInt(input);
        String binaryString = Integer.toBinaryString(binary);
        System.out.println("El equivalente binario de " + input + " es " + binaryString);
    }

}


