import java.util.Locale;
import java.util.Scanner;

public class Funcoes {
    public static Boolean ValorEntre0e10(int valor){
        if(valor <= 0 || valor > 10){
            return false;
        }else{
            return true;
        }
    }

    public static void Login(){
        while(true){
            System.out.print("Digite o seu nome: ");
            String nome = new Scanner(System.in).nextLine();
            System.out.print("\nDigite sua senha: ");
            String senha = new Scanner(System.in).nextLine();

            if(nome.equals(senha)){
                System.out.println("SENHA INVÁLIDA, IGUAL AO NOME!");
            }else{
                System.out.println("SENHA VÁLIDA!");
                break;
            }
        }
    }

    public static String LerInfos(){
        String nome;
        int idade;
        String sexo;
        Double salario;
        String estado_civil;

        while(true){
            System.out.print("Digite o seu nome: ");
            nome = new Scanner(System.in).nextLine();
            if(nome.length() > 3){
                break;
            }else{
                System.out.println("Nome inválido, menor que 3 caracteres!\n");
            }
        }

        while(true){
            try {
                System.out.print("\n\nDigite sua idade: ");
                idade = new Scanner(System.in).nextInt();

                if(idade < 0 || idade > 150){
                    System.out.println("Idade inválida, menor que 0 ou maior que 150");
                }else{
                    break;
                }

            }catch(Exception e) {
                System.out.println("\nDIGITE UM NÚMERO INTEIRO!");
            }

        }

        while(true){
            try{
                System.out.println("\n\nDigite seu salário: ");
                salario = new Scanner(System.in).nextDouble();

                if(salario <= 0){
                    System.out.println("\nDIGITE UM SALÁRIO MAIOR QUE 0!");
                }else{
                    break;
                }

            }catch(Exception e){
                System.out.println("\nDIGITE UM SALÁRIO EM NÚMERO INTEIRO OU DOUBLE!");
            }
        }

        while(true){
            System.out.print("Digite o seu sexo (M/F): ");
            sexo = new Scanner(System.in).nextLine();
            sexo = sexo.toUpperCase();

            if(sexo.equals("M") || sexo.equals("F")){
                break;
            }else{
                System.out.println("\nDIGITE M OU F!");
            }
        }

        while(true){
            System.out.print("Digite o seu estado civil\ns = solteiro(a)\nc = casado(a)\nv = viuvo(a)\nd = divorciado(a)\n\n");
            estado_civil = new Scanner(System.in).nextLine();
            estado_civil = estado_civil.toUpperCase();

            if(estado_civil.equals("S") || estado_civil.equals("C") || estado_civil.equals("V") || estado_civil.equals("D")){
                break;
            }else{
                System.out.println("\nDIGITE S,C,V OU D!");
            }
        }

        return "Seu nome = "+nome+" Sua idade = "+idade+" Seu salário = "+salario+" Seu sexo = "+sexo+" Seu estado civil = "+estado_civil;
    }

}
