package junit;

import java.util.Scanner;

import junit.Banco.SaldoInsuficiente;
import junit.Banco.ValorNegativo;

public class Main {
    public static void main(String[] args) throws SaldoInsuficiente, ValorNegativo {
        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();
        
        while(true) {
            System.out.println("1 - Saque\n2 - Deposito\n3 - Saldo");
            int op = input.nextInt();   
            double valor;
            switch(op) {
                case 1:
                    System.out.print("valor: ");
                    valor = input.nextDouble();
                    banco.saque(valor);
                    break;
                case 2:
                    System.out.print("valor: ");
                    valor = input.nextDouble();
                    banco.deposito(valor);
                    break;
                case 3:
                    System.out.println("Do you have: $"+banco.saldo()+ " moneys!!!");
                    break;
                default: 
                    System.out.println("num errado");
                    break;
            }
        }
    }
}
