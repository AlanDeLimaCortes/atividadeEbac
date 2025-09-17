public class Main {
    public static void main(String[] args) {
        // Objeto do mundo real
        Carro meuCarro = new Carro();

        // Definindo os atributos
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2013;
        meuCarro.velocidade = 0;

        // Exibindo informações iniciais
        meuCarro.exibirInformacoes();

        // Usando métodos
        meuCarro.acelerar(50);
        meuCarro.frear(20);

        // Exibindo informações depois de acelerar e frear
        meuCarro.exibirInformacoes();
    }
}
