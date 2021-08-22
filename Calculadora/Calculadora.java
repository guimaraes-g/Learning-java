public class Calculadora {

    public static void main(String[] args) throws NaturalException {
        NumerosNaturais calc = new NumerosNaturais();
        System.out.println(calc.divisao(10, 2));
        System.out.println(calc.multiplicacao(10, 2));
        System.out.println(calc.soma(10, 10));
        System.out.println(calc.subtracao(1, 1));
        System.out.println(calc.divisao(16, 3));
    }
    
}
