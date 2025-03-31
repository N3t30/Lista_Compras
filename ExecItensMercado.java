// Progra,a para gerar listas de compra de supermecado 
/*
 * 1) Crie um vetor para receber até 20 itens 
 * 2) solicite o nome de um item para comprar no mercado 
 * 3) verifique se o item já está na lista, se já estiver rejeite
 * 4) senão insira o item da lista na ordem 
 * 5) Exiba a lista ordenada 
 * 6) Depois de 10 itens digitados, a cada novo item pergunte se deseja acresentar
 * um novo item, se sim continue rodando o programa
 * 7) se chegar a 20 itens ou for informado que deseja parar, encerre o programa exibindo a lista final 
 */

 import java.util.Scanner;
 import java.util.Arrays;

 public class ExecItensMercado {
     public static void main(String[] args) {
        // 1. criando o vetor para receber 20 itens 
         Scanner sc = new Scanner(System.in);
         String[] itens = new String[20];
         int count = 0;
         
         System.out.println("Digite os itens:");
         
         while (count < 20) {
             System.out.print("Item " + (count + 1) + ": ");
             String entrada = sc.nextLine();
             
             if (entrada.equalsIgnoreCase("fim")) {
                 break;
             }
             
             boolean jaExiste = false;
             for (int i = 0; i < count; i++) {
                 if (itens[i].equalsIgnoreCase(entrada)) {
                     jaExiste = true;
                     System.out.println("Item já existe! Digite outro.");
                     break;
                 }
             }
             
             if (!jaExiste) {
                 itens[count] = entrada;
                 count++;
                 
                 // Ordena somente o que está na lista 
                 Arrays.sort(itens , 0, count);

                 System.out.println("\nlista atual");
                 for (int i = 0; i < count; i++){
                    System.out.println((i + 1) + ". " + itens[i]);
                 }
                 System.out.println();

                 if (count >= 10){
                    System.out.println(" Deseja adicionar mais um item? (s/n): ");
                    String resposta = sc.nextLine();
                    if (!resposta.equals("s")) {
                        break;
                    }
                 }
             }
         }
         
         System.out.println("\nItens digitados:");
         for (int i = 0; i < count; i++) {
             System.out.println((i + 1) + ". " + itens[i]);
         }
     }
 }