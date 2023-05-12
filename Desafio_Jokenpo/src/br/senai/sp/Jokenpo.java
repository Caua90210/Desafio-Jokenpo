package br.senai.sp;

import javax.swing.JOptionPane;
import java.util.Random;

public class Jokenpo {
    public static void main(String[] args) {
        Random rand = new Random();

        int userChoice, pcChoice;
        String[] choices = {"Pedra", "Papel", "Tesoura"};

        String input = JOptionPane.showInputDialog(null, 
                "*************************************\n" +
                "              J  O  K  E  N  P  Ô\n" +
                "*************************************\n" +
                "1 - Pedra\n" +
                "2 - Papel\n" +
                "3 - Tesoura\n" +
                "----------------------------"
                + "\n" +
                "Faça a sua escolha (1 à 3)?");

        try {
            userChoice = Integer.parseInt(input);

            if (userChoice < 1 || userChoice > 3) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
            }

            pcChoice = rand.nextInt(3) + 1;

            String message = "Você escolheu ----> " + choices[userChoice - 1] + "!\n" +
                              "O PC escolheu ----> " + choices[pcChoice - 1] + "!\n\n";

            if (userChoice == pcChoice) {
                message += "****************************\n" +
                           "******    EMPATE!!    ******\n" +
                           "****************************";
            } else if (userChoice == 1 && pcChoice == 3 || userChoice == 2 && pcChoice == 1 || userChoice == 3 && pcChoice == 2) {
                message += "****************************\n" +
                           "******    PARABÉNS!!   ******\n" +
                           "******  VOCÊ VENCEU!!! ******\n" +
                           "****************************";
            } else {
                message += "****************************\n" +
                           "******    QUE PENA!!   ******\n" +
                           "******  O PC VENCEU!!! ******\n" +
                           "****************************";
            }

            JOptionPane.showMessageDialog(null, message);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}
