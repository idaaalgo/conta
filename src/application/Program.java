package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        System.out.print("Digite o número da conta: ");
        int number = sc.nextInt();
        System.out.print("Digite o nome do titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Há depósito inicial(y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y') {
            System.out.print("Digite o depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Informações da conta");
        System.out.println(account);
        System.out.println();
        System.out.print("Digite um valor pra depósito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Informações atualizadas da conta: ");
        System.out.println(account);
        System.out.println();
        System.out.print("Digite um valor pra saque: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Informações atualizadas da conta: ");
        System.out.println(account);
        sc.close();
    }
}
