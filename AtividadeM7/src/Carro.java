public class Carro {

    String marca;
    String modelo;
    int ano;
    double velocidade;

    void acelerar(double incremento) {
        velocidade += incremento;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h\n");
    }
    void frear(double decremento) {
        velocidade -= decremento;
        if (velocidade < 0) velocidade = 0;
        System.out.println("O carro freiou. Velocidade atual: " + velocidade + " km/h\n");
    }
    void exibirInformacoes() {
        System.out.println("===============================");
        System.out.println("         FICHA DO CARRO        ");
        System.out.println("===============================");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("velocidade atual: " + velocidade + " km/h");
        System.out.println("===============================");
    }
}
