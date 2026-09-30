package com.mycompany.exercicio_for_5;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        for(int i=1; i <= 4 ;i ++){
            System.out.println("tabela do " + i);
            for(int j = 0; j <= 10; j++){
                int resultado = i *j;
                System.out.println("i" + "*" + "j" + "=" + resultado);
            }
            System.out.println();
        }
    }
}