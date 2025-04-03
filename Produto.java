package L06;

public class Produto {

    int codigo;
    String nome;
    int quantidade;
    String tipo;
    double valor;

    // Construtores

    Produto(int codigo) {
        this.codigo = codigo;
    }

    Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Vender: verifica quantidade e retorna o valor total da venda
    public double vender(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("Quantidade Insuficiente em Estoque\n");
            return 0;
        } else {
            this.quantidade -= quantidade;
        }
        return (quantidade * valor);
    }

    // Comprar: acrescenta quantidade no estoque
    public void comprar(int quantidade) {
        this.quantidade += quantidade;
    }

    // Comprar com novo valor do produto
    public void comprar(int quantidade, double valor) {
        this.quantidade += quantidade;
        this.valor = valor;
    }

    // Inserir: altera nome, quantidade, tipo e valor
    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Método toString sobrescrito para representar o objeto em forma de string
    @Override
    public String toString() {
        return "Dados do produto:\n" +
                "Código: " + this.codigo + "\n" +
                "Nome: " + this.nome + "\n" +
                "Quantidade: " + this.quantidade + "\n" +
                "Tipo: " + this.tipo + "\n" +
                "Valor do Produto: " + this.valor + "\n";
    }

    // Método para comparar se dois produtos são iguais por nome e tipo
    public boolean igual(Produto outroProduto) {
        return this.nome.equals(outroProduto.nome) && this.tipo.equals(outroProduto.tipo);
    }
}