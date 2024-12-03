import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int choice1,choice2,choice3,choice4;
        String order;
        Scanner sc = new Scanner(System.in);
        System.out.println("====MENU DO CINEMA====");
        System.out.println("1. Filme");
        System.out.println("2. Genero");
        System.out.println("3. Ator");
        System.out.println("4. Sala");
        System.out.println("5. Sessao");
        System.out.println("6. Ingresso");
        System.out.println("7. Assentos");
        
        System.out.println("Escolha uma da opções para acessar:(1-7) ");
        choice1 = sc.nextInt();
        sc.nextLine();

        switch(choice1){
            case 1:// filmes
            order="Filmes";
            System.out.println("a opção escolhida foi: "+ order);
            System.out.println("Escolha uma ação:");
            System.out.println("1- cadastrar filme");
            System.out.println("2- editar filme");
            System.out.println("3- consultar filme");
            System.out.println("4- listar filme");
            choice2= sc.nextInt();

            switch(choice2){
                case 1:
                    // inserir as informações para cadastrar o filme
                    System.out.println("a opção escolhida foi cadastrar");
                    System.out.println("Digite o titulo do filme");
                    String titulo = sc.next();
                    
                    System.out.println("Digite o id do filme");
                    int idFilme = sc.nextInt();
                    
                    System.out.println("Digite a classificacao do filme: ");
                    int classificacao = sc.nextInt();
                    
                    System.out.println("Digite o status do filme disponivel/indisponivel");
                    String status = sc.next();

                    System.out.println("Digite o genero do filme");
                    Genero genero = new Genero(sc.next());

                    Filme f = new Filme(idFilme,titulo,classificacao,status,genero);
                    f.cadastrar(f);
                    sc.close();

                    break;
                case 2:
                    System.out.println(" a opção escolhida foi editar filme");
                    break;
                case 3:
                    System.out.println("a opção escolhida foi consultar filmes");
                    break;
                case 4:
                    System.out.println("a opção escolhida foi listar os filmes que já existem.");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }
            break;
            case 2:
                order= "Genero";
                System.out.println("a opção escolhida foi: "+ order);
                System.out.println("Escolha uma açao para genero: ");
                System.out.println("1-Cadastrar um novo genero");
                System.out.println("2-Buscar um genero existente");
                System.out.println("3-");
                System.out.println("1-Cadastrar um novo genero");

            case 3:
                order = "Sala";
                System.out.println("a opção escolhida foi: "+ order);
            default:
                System.out.println("Opção invalida");;
        }
        
    }
}