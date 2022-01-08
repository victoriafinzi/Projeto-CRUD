package projeto.crud;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import projeto.crud.Aluno;
import projeto.crud.Pessoa;
import projeto.crud.ControleIndividuos;

public class ProjetoCRUD {

    public void Inicializar() {
        //inicialização da nossa classe Scanner
        int opcao;
        Scanner apresentacao;
        apresentacao = new Scanner(System.in);
        
        //atributos usados
        String nome, telefone, dataNasc;
        float notaFinal;
        LocalDate dataCadastro, dataAlteracao;
        
        //construtores
        Pessoa novaPessoa = new Pessoa();
        Aluno novoAluno = new Aluno();
        ControleIndividuos ci = new ControleIndividuos();
        
        
        
        do{
            //menu de interação com o usuário
            System.out.println("********************************************************");
            System.out.println("*   DIGITE O NÚMERO DE QUAL OPERAÇÃO DESEJA EFETUAR    *");
            System.out.println("********************************************************");
            System.out.println("*            1 - Cadastrar Pessoa ou Aluno             *");
            System.out.println("*            2 - Listar                                *");
            System.out.println("*            3 - Atualizar dados                       *");
            System.out.println("*            4 - Deletar                               *");
            System.out.println("*            5 - Encerrar programa                     *");
            System.out.println("********************************************************");
            System.out.print("Digite aqui a operação:");
        
            opcao = apresentacao.nextInt();
            
            //função que limpa o buffer
            apresentacao.nextLine();
            
            switch(opcao){
                
                case 1:
                    //apenas leitura de dados
                    System.out.println("Nome: ");
                    nome = apresentacao.nextLine();
                    System.out.println("Telefone: ");
                    telefone = apresentacao.nextLine();
                    System.out.println("Data de nascimento: ");
                    dataNasc = apresentacao.nextLine();
                    System.out.println("Nota final: ");
                    notaFinal = Integer.parseInt(apresentacao.nextLine());
                    
                    //construção de novo aluno e pessoa para inserção dos dados
                    dataCadastro = LocalDate.now();
                    dataAlteracao = LocalDate.now();
                    novoAluno = new Aluno(nome, telefone, dataNasc, notaFinal, dataCadastro, dataAlteracao);
                    novaPessoa = new Pessoa (nome, telefone, dataNasc, dataCadastro, dataAlteracao);
                    
                    //função que faz a diferenciação entre salvar Pessoa ou Aluno
                    if (notaFinal != 0){
                        ci.inserirAluno(novoAluno);
                    }else{
                        ci.inserirPessoa(novaPessoa);
                    }
                    break;
                    
                case 2:
                   //lista todos os individuos inseridos como Alunos ou Pessoas
                   ci.listarAluno();
                   ci.listarPessoa();                    
                    break;
                    
                case 3:
                   //primeiro lista os Alunos e Pessoas já criadas para o usuário saber qual destes ele deseja editar 
                   ci.listarAluno();
                   ci.listarPessoa();
                   //menu usuário escolhe se irá editar Aluno ou Pessoa
                   System.out.println("Você deseja alterar aluno ou pessoa: "); 
                   String altIndividuo = apresentacao.next();
                   //função que diferencia entre aluno ou pessoa
                   if (("aluno".equals(altIndividuo)) || ("Aluno".equals(altIndividuo) || ("ALUNO".equals(altIndividuo)))){
                        ci.listarAluno();
                   }else if(("pessoa".equals(altIndividuo)) || ("Pessoa".equals(altIndividuo)) || ("PESSOA".equals(altIndividuo))){
                       ci.listarPessoa();
                   }else{
                       opcao = 3;
                   }
                   //menu que mostra qual a opção que o usuário deseja efetuar
                   System.out.println("Informe com base na numeração, qual individuo você deseja alterar: ");
                   int numIndividuo = apresentacao.nextInt();
                   apresentacao.nextLine();
                   if ("aluno".equals(altIndividuo)){
                       Aluno aluno = (Aluno) ci.listaDeAlunos.get(numIndividuo - 1);
                        System.out.println("Informe com base na numeração, qual atributo deseja alterar: ");
                        System.out.println("**********************************");
                        System.out.println("* 1 - Alterar nome               *");
                        System.out.println("* 2 - Alterar telefone           *");
                        System.out.println("* 3 - Alterar data de nascimento *");
                        System.out.println("* 4 - Alterar nota final         *");
                        System.out.println("**********************************");
                    int alterarOpcao = apresentacao.nextInt();
                    apresentacao.nextLine();
                    //faz a diferenciação para a escolha de qual atributo que irá ser editado
                       if (alterarOpcao == 1){
                       System.out.println("Nome: ");
                       nome = apresentacao.nextLine();
                       aluno.setNome(nome);
                   }else if (alterarOpcao == 2){
                       System.out.println("Telefone: ");
                       telefone = apresentacao.nextLine();
                       aluno.setTelefone(telefone);
                   }else if (alterarOpcao == 3){
                       System.out.println("Data de nascimento: ");
                       dataNasc = apresentacao.nextLine();
                       aluno.setDataNasc(dataNasc);
                   }else if (alterarOpcao == 4){
                       System.out.println("Nota final: ");
                       notaFinal = apresentacao.nextFloat();
                       apresentacao.nextLine();
                       aluno.setnotaFinal(notaFinal);                          
                   }else{
                       System.out.println("Digite um numero válido");
                   }}else if("pessoa".equals(altIndividuo)){
                       Pessoa pessoa = (Pessoa) ci.listaDePessoas.get(numIndividuo - 1);
                        System.out.println("Informe com base na numeração, qual atributo deseja alterar: ");
                        System.out.println("**********************************");
                        System.out.println("* 1 - Alterar nome               *");
                        System.out.println("* 2 - Alterar telefone           *");
                        System.out.println("* 3 - Alterar data de nascimento *");
                        System.out.println("**********************************");
                    int alterarOpcao = apresentacao.nextInt();
                    apresentacao.nextLine();
                       if (alterarOpcao == 1){
                       System.out.println("Nome: ");
                       nome = apresentacao.nextLine();
                       pessoa.setNome(nome);
                   }else if (alterarOpcao == 2){
                       System.out.println("Telefone: ");
                       telefone = apresentacao.nextLine();
                       pessoa.setTelefone(telefone);
                   }else if (alterarOpcao == 3){
                       System.out.println("Data de nascimento: ");
                       dataNasc = apresentacao.nextLine();
                       pessoa.setDataNasc(dataNasc);
                   }}else{
                       System.out.println("Digite um numero válido");
                    }
                    break;
                    
                case 4:
                    //lista todos os individuos que existem no sistema
                    ci.listarAluno();
                    ci.listarPessoa();
                    //menu de escolha entre Aluno ou Pessoa para ser deletado 
                    System.out.println("Você deseja deletar um aluno ou pessoa: ");
                     String delIndividuo = apresentacao.next();
                   //função que diferencia entre aluno ou pessoa
                   if (("aluno".equals(delIndividuo)) || ("Aluno".equals(delIndividuo) || ("ALUNO".equals(delIndividuo)))){
                        ci.listarAluno();
                   }else if(("pessoa".equals(delIndividuo)) || ("Pessoa".equals(delIndividuo)) || ("PESSOA".equals(delIndividuo))){
                       ci.listarPessoa();
                   }else{
                       System.out.println("Digite um aluno ou pessoa");
                   }
                   //menu que mostra qual a opção que o usuário deseja efetuar
                   System.out.println("Informe com base na numeração, qual Aluno/Pessoa você deseja deletar: ");
                   int delNumIndividuo = apresentacao.nextInt();
                   apresentacao.nextLine();
                   //função que remove o individuo escolhido
                   if (("aluno".equals(delIndividuo)) || ("Aluno".equals(delIndividuo) || ("ALUNO".equals(delIndividuo)))){
                       ci.listaDeAlunos.remove(delNumIndividuo - 1);
                   }else if(("pessoa".equals(delIndividuo)) || ("Pessoa".equals(delIndividuo)) || ("PESSOA".equals(delIndividuo))){
                       ci.listaDePessoas.remove(delNumIndividuo - 1);}
                    break;
                case 5:
                    System.out.println("Seu programa está sendo encerrado!");
                    //o método System.exit encerra o processamento do JVM. Passamos o valor 0 para exit() para indicar que ele irá terminar sem nenhum erro. 
                    //se for passado um número diferente de 0 (como 1 ou -1) o compilador entende que irá terminar o programa com algum erro ou mensagem.
                    System.exit(0);
                    break;
                //o default é chamado caso adicionem um número que não existe
                default:
                    System.out.println("\nOpção inválida!Digite um dos números acima.");
            }
        }while(opcao != 0); //aqui ele sempre vai fazer o que estiver no "DO" automaticamente
    }
}
