import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        Conversor calculo = new Conversor();
        OpcaoMenu opcaoMenu = new OpcaoMenu();
        int opcao = 0;
        float resposta = 0.0f;
        String menu = "Digite o número da conversão que gostaria de fazer: \n" +
                "1: Real BRL  --> Dolar Americano USD; \n" +
                "2: Real BRL  --> Euro EUR\n" +
                "3: Dolar USD --> Real BRL\n" +
                "4: Dolar USD --> Euro EUR\n" +
                "5: Euro EUR --> Real BRL\n" +
                "6: Euro EUR --> Dolar Americano USD\n" +
                "7: Sair\n";

        while (opcao != 7) {
            System.out.println(menu);
            try{
                opcao = Integer.parseInt(leitura.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("valor digitado inválido, tente novamente");
            }
            if(0 < opcao && opcao < 7){
                System.out.println("Digite o valor da moeda que gostaria de converter?");
                float valorMoedaBase = Float.parseFloat(leitura.nextLine());
                try {
                    Moeda novaMoeda = consultaMoeda.buscaMoeda(opcaoMenu.codigo(opcao).substring(0,3), opcaoMenu.codigo(opcao).substring(3,6));
                    resposta = calculo.calularConversao(valorMoedaBase,novaMoeda.conversion_rate());
                    System.out.println("O valor convertido é de: " + resposta + " " +opcaoMenu.codigo(opcao).substring(3,6));
                } catch (RuntimeException e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            } else if (opcao == 7) {
                System.out.println("Saindo do programa");
                continue;
            }else{
                System.out.println("Valor de opção inválido, tente novamente.");
            }
            ;
        }


    }
}