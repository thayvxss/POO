public class Produto {

    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {

        this.nome = nome;
        this.preco = preco;

    }

    public void exibirInfo(){

        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);

    }
}


