import java.util.Scanner;

public class Main {

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tDigite um número de 0 a 10\n" +
                        "2\t\t=>\t\tPega nome e senha e verifica se não são iguais\n" +
                        "3\t\t=>\t\tLê valor do produto, aplica impostos e retorna o produto com imposto e lucro de 40%\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 3) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }


            } catch (Exception e) {
                System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static void main(String[] args) {
        System.out.println("Atividade SENAI 27/4/2022 - Exercício 1 Sistemas de Loop Básicos - Curso: Desenvolvedor Java Vespertino\n\n");

        int num1,num2,num3,num4;
        Double num1_double;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    while(true){
                        System.out.println("\nDigite um número:");
                        num1 = new Scanner(System.in).nextInt();
                        if(Funcoes.ValorEntre0e10(num1)){
                            System.out.println("O número é válido!");
                            break;
                        }else{
                            System.out.println("NÚMERO INVÁLIDO TENTE NOVAMENTE!");
                        }
                    }
                    continue;

                case 2:
                    Funcoes.Login();

                    continue;

                case 3:
                    System.out.println(Funcoes.LerInfos());
                    continue;

                case 0:
                    run = false;
                    break;
            }

        }
    }
}
