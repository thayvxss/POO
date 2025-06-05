public class Camisa extends Produto{

    private String cor;
    private int tamanho;
    private String material;

    public Camisa(String nome, Double preco, String cor, int tamanho, String material) {
        super(nome, preco);  // chama o construtor da classe Produto
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
    }


    @Override
    public void exibirInfo(){

        super.exibirInfo();
        System.out.println("Cor: "+ cor);
        System.out.println("Tamanho: "+ tamanho);
        System.out.println("Material: "+ material);

    }

}
