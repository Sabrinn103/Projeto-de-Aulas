public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Maria";
        a1.matricula = 123;
        a1.notaAv1 = 8;
        a1.notaAv2 = 7.5;

        Aluno a2 = new Aluno();
        a2.nome = "Joao";
        a2.matricula = 456;
        a2.notaAv1 = 5;
        a2.notaAv2 = 6;

        a1.mostrar();
        a1.aprovado();

        a2.mostrar();
        a2.aprovado();

        a2.notaAv2 = 8; // atualizando nota
        a2.mostrar();
        a2.aprovado();
    }
}
