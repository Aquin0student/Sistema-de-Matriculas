package Models;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private Matricula matricula;

    public Aluno(String nome, Matricula matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome){
        this.nome = nome;
    }

    public void adicionarMatricula(Matricula matricula){
        this.matricula = matricula;
    }

    public void removerMatricula(){
        this.matricula = null;
    }

}
