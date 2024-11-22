public class Aluno {

    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public Double gradeFinal(){
        return nota1 + nota2 + nota3;
    }

    public void statusFinal(){
        if (gradeFinal() >= 60.00){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60- gradeFinal());
        }
    }
}
