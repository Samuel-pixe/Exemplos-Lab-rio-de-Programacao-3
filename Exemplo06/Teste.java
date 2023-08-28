//package exemplo06;
//
//public class Teste {
//
//    private double comprimento;
//    private double largura;
//
//    public Teste() {
//        this(0, 0);
//    }
//
//    public Teste(double comprimento) {
//        this(comprimento, 0);
//    }
//
//    public Teste(double comprimento, double largura) {
//        this.setComprimento(comprimento);
//        this.setLargura(largura);
//    }
//
//    public double getComprimento() {
//        return this.comprimento;
//    }
//
//    public void setComprimento(double comprimento) {
//        if (testeIntervalo(comprimento)) {
//            this.comprimento = comprimento;
//        } else {
//            System.err.println("Valor inválido");
//        }
//    }
//
//    public double getLargura() {
//        return this.largura;
//    }
//
//    public void setLargura(double largura) {
//        if (testeIntervalo(largura)) {
//            this.largura = largura;
//        } else {
//            System.err.println("Valor inválido");
//        }
//    }
//
//    private boolean testeIntervalo(double valor) {
//        return (valor > 0 && valor < 20);
//    }
//
//    public double getPerimetro() {
//        if (testeIntervalo(getComprimento())
//                && testeIntervalo(getLargura())) {
//            return (2 * (getComprimento() + getLargura()));
//        } else {
//            return -1;
//        }
//    }
//
//    public double getArea() {
//        if (testeIntervalo(getComprimento())
//                && testeIntervalo(getLargura())) {
//            return (getComprimento() * getLargura());
//        } else {
//            return -1;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return String.format(
//                "\nComprimento: %.2f\nLargura: %.2f\nPerímetro: %.2f\nÁrea: %.2f",
//                getComprimento(), getLargura(), getPerimetro(), getArea()
//        );
//    }
//
//}