/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interpreterpattern;

import java.util.Scanner;

/**
 *
 * @author Palom
 */
public class InterpreterPattern {

    public Contexto clientContext = null;
    public IExpresion expresion = null;

    public InterpreterPattern(Contexto client) {
        clientContext = client;
    }

    public void interpret(String input) {
        for (int i = 0; i < 2; i++) {
            System.out.println("\nIngresa una opcion (1 o 2)");
            Scanner in = new Scanner(System.in);
            String c = in.nextLine();
            if (c.equals("1")) {
                expresion = new intAPalabras(input);
                expresion.interpret(clientContext);
            } else {
                expresion = new StringAExpresionBinaria(input);
                expresion.interpret(clientContext);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n***Interpreter Pattern Demo***\n");
        System.out.println("Ingresa un numero  :");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Contexto context = new Contexto(input);
        InterpreterPattern client = new InterpreterPattern(context);
        client.interpret(input);
    }

}
