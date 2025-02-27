package Models;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private Matricula matricula;

    Aluno(String nome, Matricula matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void adidirMatricula(Matricula matricula){
        this.matricula = matricula;
    }

    public void removerMatricula(){
        this.matricula = null;
    }

}
