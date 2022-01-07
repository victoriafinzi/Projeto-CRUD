package projeto.crud;

import java.util.ArrayList;
import projeto.crud.Aluno;
import projeto.crud.Pessoa;

public class ControleIndividuos {
    String nome, telefone, dataNasc;
    float notaFinal;
    
    Pessoa novaPessoa = new Pessoa();
    Aluno novoAluno = new Aluno();
    
    ArrayList<Pessoa> listaDePessoas;
    ArrayList<Aluno> listaDeAlunos;

    
    public ControleIndividuos(){
        this.listaDePessoas = new ArrayList<>();
        this.listaDeAlunos = new ArrayList<>();  
    }
    
    public void inserirPessoa(Pessoa novaPessoa){
        listaDePessoas.add(novaPessoa);
        }
    
    public void inserirAluno(Aluno novoAluno){
        listaDeAlunos.add(novoAluno);
        }
    
    public void listarPessoa(){
        System.out.println("Lista de Pessoas");
        //aqui a primeira pessoa adicionada será a 1
        int incremento = 1;
        for (Pessoa pessoaNaLista : listaDePessoas){
            System.out.print(incremento + "-");
            System.out.println(pessoaNaLista);
            //pessoaNaLista.listarPessoa();
            incremento ++; //sempre que adicionar uma nova pessoa essa irá receber um número diferente
        }
    }
    public void listarAluno(){
        System.out.println("Lista de Alunos:");
        //aqui o primeiro aluno adicionado será a 1
        int incremento = 1;
        for (Aluno alunoNaLista : listaDeAlunos){
            System.out.print(incremento + "-");
            //alunoNaLista.listarAluno();
            System.out.println(alunoNaLista);
            incremento ++; //sempre que adicionar um novo aluno esse irá receber um número diferente
            //for percorre toda a classe e pega o toString
        }
    }
    }

