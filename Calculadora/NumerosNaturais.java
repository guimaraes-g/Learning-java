public class NumerosNaturais {
    public int soma(int a, int b){
        return a + b;
    }
    public int subtracao (int a, int b){
        return a - b;
    }
    public int divisao (int a, int b) throws NaturalException {
        if (a%b == 0) {
        return a/b;
        } else {
            NaturalException e = new NaturalException();
            throw e;
        }
    }
    public int multiplicacao (int a, int b){
        return a*b;
    }
    public int raiz (double a) throws NaturalException {
        if (Math.sqrt(a)% (int)Math.sqrt(a) == 0){
        return (int) Math.sqrt(a);
        } else {
            NaturalException e = new NaturalException();
            throw e;
        }
    }
}
