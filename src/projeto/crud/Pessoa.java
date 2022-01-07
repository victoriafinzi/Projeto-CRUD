package projeto.crud;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class Pessoa {
    private String nome; 
    private String telefone; 
    private String dataNasc;
    //aparecer quando listar as pessoas cadastradas
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    
    public Pessoa(String nome, String telefone, String dataNasc, LocalDate dataCadastro, LocalDate dataAlteracao ){
        setNome(nome);
        setTelefone (telefone);
        setDataNasc (dataNasc);
        setDataCadastro (dataCadastro);
        setDataAlteracao (dataAlteracao);
        
    }
    
    public Pessoa() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate setDataCadastro(LocalDate dataCadastro) {
        return dataCadastro;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public LocalDate setDataAlteracao(LocalDate dataAlteracao) {
        return dataAlteracao;
    }

    //essa parada aqui é reconhecida pelo for e ai serve como o seu listarPessoa()
    public String toString(){
        return "Nome:" + getNome() + ", " + "Telefone:" + telefone + ", " + "Data de nascimento:" + dataNasc + ", " + "Data de cadastro:" + formatador.format(getDataCadastro()) + ", " + "Data da Última alteração:" + ", " + formatador.format(getDataAlteracao());
                //terminar amanhã, formatar isso daqui depois formatar lá no negocio do projeto etc
    }
    
}
