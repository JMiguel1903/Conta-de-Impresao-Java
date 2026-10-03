public class ContaImpressao {
    public String Nome;
    private short Matricula;
    private double Saldo = 0;
    public static double PaginaPreco = 0.50;

    public static void ConsultarPaginaPreco(double Novopreco) {
        System.out.println("O preço atual das paginas é "+ PaginaPreco);
    }
    public  void ConsultarSaldo(){
        System.out.println("esse é o saldo de "+this.Saldo);
    }
    public double adicionarsaldo ( double ADD){
            if (ADD > 0)
                Saldo += ADD;
            return Saldo;
        }
        public static void Menu () {
            System.out.println("1 - Adicionar créditos");
            System.out.println("2 - Solicitar impressão");
            System.out.println("3 - Consultar uma conta");
            System.out.println("4 - Alterar o preço por página");
            System.out.println("5 - Consultar o preço por página");
            System.out.println("6 - Consultar o total de páginas impressas");
            System.out.println("0 - Sair");
        }
      public void verificarConta(){
          System.out.println("o Saldo de "+this.Nome+ " é "+this.Saldo+"R$");
      }
    }




