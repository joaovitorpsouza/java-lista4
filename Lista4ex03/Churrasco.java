package Lista4ex03;

public class Churrasco {

    private int qtdHomens;
    private int qtdMulheres;
    private int qtdCriancas;

    public Churrasco(int qtdHomens, int qtdMulheres, int qtdCriancas) {
        this.qtdHomens = qtdHomens;
        this.qtdMulheres = qtdMulheres;
        this.qtdCriancas = qtdCriancas;
    }

    public double getTotalCarne() {
        double ConsumoCarne = (qtdHomens * 0.5) + (qtdMulheres * 0.3) + (qtdCriancas * 0.2);
        return ConsumoCarne;
    }

    public double getTotalCerveja() {
        double ConsumoCerveja = (qtdHomens * 0.75) + (qtdMulheres * 0.3);
        return ConsumoCerveja;
    }
}