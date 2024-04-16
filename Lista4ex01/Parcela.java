package Lista4ex01;

public class Parcela {

    private double ValorEmprestado;
    private double TaxaJuros;
    private int QtdParcelas;

    public Parcela(double ValorEmprestado, double TaxaJuros, int QtdParcelas){
        this.ValorEmprestado = ValorEmprestado;
        this.TaxaJuros = TaxaJuros;
        this.QtdParcelas = QtdParcelas;
    }

    public double getCalcularParcela() {
        double ValorParcela = (ValorEmprestado * (1 + (TaxaJuros / 100 * QtdParcelas))) / QtdParcelas;
        return ValorParcela;
    }
}