import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        ContaImpressao AnaSilva = new ContaImpressao();
        ContaImpressao BrunoLopes = new ContaImpressao();
        AnaSilva.Nome="ANA SILVA";
        BrunoLopes.Nome="BRUNO LOPES";
        do{
        ContaImpressao.Menu();
        System.out.println("Escolha");
         escolha =sc.nextInt();
         if(escolha==1) {
             AnaSilva.adicionarsaldo(20);
             BrunoLopes.adicionarsaldo(100);
             System.out.println("saldo adicionado com sucesso!");
         } else if (escolha==2) {

         } else if (escolha==3) {
             AnaSilva.verificarConta();
             BrunoLopes.verificarConta();
         }else if (escolha==4) {

         }else if (escolha==5) {

         }else if (escolha==6) {

         } else if (escolha>=7) {
             System.out.println("numero invalido, tente novamente");

         } else if (escolha==0) {
             System.out.println("saindo...");
         }

        }while(escolha!=0);
    }
}