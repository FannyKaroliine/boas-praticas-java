package ExerciciosBoasPraticas;

public class ExerciciosBoasPraticasJava {

    public static void main(String[] args) {

        int i;
        //int i; variavel de mesmo nome
        int I;
        //int 1a;  variavel iniciada em numero
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; j definida como final n pode ser alterada
        int asrn24678md;
        //int asrn246 78md; espaco em nome de variavel
        int asrn2$4678_md = 10;
        //int asrn2$46%78_md = 10; caracter invalido %

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; nao segue boas praticas - inicio maiusculo
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; nao segue boas praticas - final
        int QUANTIDADE_OPCOES = 25;
        //int qtdProd;

        //linhas 11 12 23 nao seguem boas praticas - _ e $ na variavel
        //linha 33 segue padrao final para variavel nao final

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}
