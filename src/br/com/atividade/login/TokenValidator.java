package br.com.atividade.login;

import java.util.Scanner;

public class TokenValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String token;

        do {
            System.out.print("Digite um Token de 4 dígitos: ");
            token = scanner.nextLine();
        } while (!isValidToken(token));

        System.out.println("Token Válido: " + token);
    }

    public static boolean isValidToken(String token) {
        if (token.length() != 4) {
            System.out.println("O Token deve conter exatamente 4 dígitos.");
            return false;
        }

        for (char c : token.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("O Token deve conter apenas números.");
                return false;
            }
        }

        return true;
    }
}
