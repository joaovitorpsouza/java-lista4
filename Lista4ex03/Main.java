package Lista4ex03;

public class Main {

    public static void main(String[] args) {
        Churrasco churrasco = new Churrasco(3, 3, 6);

        System.out.println("O total de carne que será consumido, em quilogramas, será de: " + churrasco.getTotalCarne());
        System.out.println("O total de cerveja que será consumida, em litros, será de: " + churrasco.getTotalCerveja());
    }
}