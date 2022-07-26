/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote.projeto01for;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class ProjetoFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor N: ");
        int N = sc.nextInt();
        int soma = 0;
        for (int i = 0; i<N; i = i +1) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        
        System.out.println(soma);
        sc.close();
    }
}
