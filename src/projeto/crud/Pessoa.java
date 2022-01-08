package projeto.crud;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;


public class Pessoa {
    private String nome; 
    private String telefone; 
    private String dataNasc;
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;
    DateTimeFormatter formatador =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
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

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDate dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    //essa parada aqui é reconhecida pelo for e ai serve como o seu listarPessoa()
    public String toString(){
        return "Nome:" + getNome() + ", " + "Telefone:" + getTelefone() + ", " + "Data de nascimento:" + getDataNasc() + ", " + "Data de cadastro:" + formatador.format(getDataCadastro()) + ", " + "Data da Última alteração:" + ", " + formatador.format(getDataAlteracao());
                
    }
    
}
