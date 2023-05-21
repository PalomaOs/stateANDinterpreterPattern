/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interpreterpattern;

/**
 *
 * @author Palom
 */
public class StringAExpresionBinaria implements IExpresion {

    private String valor;

    public StringAExpresionBinaria(String input) {
        valor = input;
    }

    @Override
    public void interpret(Contexto contexto) {
        contexto.getBinaryForm(valor);
    }

}  
    


