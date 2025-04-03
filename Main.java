package L06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o primeiro produto com apenas o código
        Produto produto1 = new Produto(1);

        // Usando o método inserir para adicionar os outros dados
        System.out.println("Informe os dados do produto 1:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade1 = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner
        System.out.print("Tipo: ");
        String tipo1 = scanner.nextLine();
        System.out.print("Valor: ");
        double valor1 = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        produto1.inserir(nome1, quantidade1, tipo1, valor1);

        // Criando o segundo produto com código e nome
        Produto produto2 = new Produto(2, "Jogo Batalha Naval");

        // Usando o método inserir para adicionar os outros dados
        System.out.println("\nInforme os dados do produto 2:");
        System.out.print("Quantidade: ");
        int quantidade2 = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner
        System.out.print("Tipo: ");
        String tipo2 = scanner.nextLine();
        System.out.print("Valor: ");
        double valor2 = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        produto2.inserir("Jogo Batalha Naval", quantidade2, tipo2, valor2);

        // Criando o terceiro produto com código, nome e quantidade
        Produto produto3 = new Produto(3, "Jogo Master", 20);

        // Usando o método inserir para adicionar o tipo e valor
        System.out.println("\nInforme os dados do produto 3:");
        System.out.print("Tipo: ");
        String tipo3 = scanner.nextLine();
        System.out.print("Valor: ");
        double valor3 = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        produto3.inserir("Jogo Master", 20, tipo3, valor3);

        // Criando o quarto produto com todos os dados
        Produto produto4 = new Produto(4, "Jogo Quebra-Cabeça", 30, "jogo", 50.00);

        // Exibindo os produtos criados
        System.out.println("\nProdutos criados:");
        System.out.println(produto1);  // Exibe produto1 com toString()
        System.out.println(produto2);  // Exibe produto2 com toString()
        System.out.println(produto3);  // Exibe produto3 com toString()
        System.out.println(produto4);  // Exibe produto4 com toString()

        // Realizando algumas operações com os produtos
        System.out.println("\nRealizando operações:");

        // Vender produtos
        System.out.print("\nInforme a quantidade a ser vendida do produto 1: ");
        int quantidadeVenda = scanner.nextInt();
        double valorVenda = produto1.vender(quantidadeVenda);
        System.out.println("Valor total da venda do produto 1: " + valorVenda);

        // Comprar mais produtos
        System.out.print("\nInforme a quantidade a ser comprada do produto 2: ");
        int quantidadeCompra = scanner.nextInt();
        produto2.comprar(quantidadeCompra);
        System.out.println("\nProduto 2 após compra: ");
        System.out.println(produto2);

        // Comparar dois produtos
        boolean saoIguais = produto2.igual(produto3);
        System.out.println("\nProduto 2 é igual ao produto 3? " + saoIguais);

        scanner.close();
    }
}