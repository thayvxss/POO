public class Main{
    public static void main(String[] args){
        Livro livro = new Livro("Thay", 30.15, "Thaynara Peron",15, true);
        livro.exibirInfo();
        Camisa camisa = new Camisa("T-shirt", (double) 50.0, "Vermelho", 40,"Algodão");
        camisa.exibirInfo();

    }
}