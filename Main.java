import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Smartphone celular = new Smartphone();
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n========  MENU  ========");
            System.out.println("1 - Fazer Ligação");
            System.out.println("2 - Atender ligação ");
            System.out.println("3 - Iniciar correio de voz");
            System.out.println("4 - Selecionar música");
            System.out.println("5 - Tocar música");
            System.out.println("6 - Pausar música");
            System.out.println("7 - Exibir página web");
            System.out.println("8 - Adicionar nova aba");
            System.out.println("9 - Atualizar página");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitura.nextInt();
            leitura.nextLine(); // limpar o buffer


            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para ligar: ");
                    String numero = leitura.nextLine();
                    System.out.println(celular.ligar(numero));
                    break;
                case 2:
                    System.out.println(celular.atender());
                    break;
                case 3:
                    System.out.println(celular.correioVoz());
                    break;
                case 4:
                    System.out.print("Digite o nome da música: ");
                    String musica = leitura.nextLine();
                    System.out.println(celular.selecionarMusica(musica));
                    break;
                case 5:
                    System.out.println(celular.tocar());
                    break;
                case 6:
                    System.out.println(celular.pausar());
                    break;
                case 7:
                        System.out.print("Digite a URL: ");
                        String url = leitura.nextLine();
                        System.out.println(celular.exibirPagina(url));
                    break;
                case 8:
                    System.out.println(celular.novaAba());
                    break;
                case 9:
                        System.out.println(celular.atualizarPagina());
                    break;
                case 0:
                        System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}
