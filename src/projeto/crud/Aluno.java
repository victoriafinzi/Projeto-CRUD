package projeto.crud;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa {
    private float notaFinal = 0;
    Aluno aluno;

    public Aluno() {

    }

    public Aluno(String nome, String telefone, String dataNasc, float notaFinal, LocalDate dataCadastro, LocalDate dataAlteracao) {
        setNome(nome);
        setTelefone (telefone);
        setDataNasc (dataNasc);
        setnotaFinal (notaFinal);
        setDataCadastro (dataCadastro);
        setDataAlteracao (dataAlteracao);
    }


    public float getnotaFinal() {
        return notaFinal;
    }

    public void setnotaFinal(float NotaFinal) {
        this.notaFinal = NotaFinal;
    }
    

    public String toString(){
        return "Nome:" + this.getNome() + ", " + "Telefone:" + this.getTelefone() + ", " + "Data de nascimento:" + this.getDataNasc() + ", " + "Nota final:" + notaFinal + ", " + "Data de cadastro:" + formatador.format(this.getDataCadastro()) + ", " + "Data da Última alteração:" + formatador.format(this.getDataAlteracao());
    }

}
