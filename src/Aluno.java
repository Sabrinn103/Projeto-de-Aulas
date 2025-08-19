public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;

    void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("AV1: " + notaAv1);
        System.out.println("AV2: " + notaAv2);
    }

    double media() {
        return (notaAv1 + notaAv2) / 2;
    }

    void aprovado() {
        double m = media();
        if (m >= 7) {
            System.out.println(nome + " aprovado. Média: " + m);
        } else {
            System.out.println(nome + " reprovado. Média: " + m);
        }
    }
}
