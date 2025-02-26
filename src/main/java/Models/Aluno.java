package Models;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Matricula> matricula = new ArrayList<Matricula>();

    Aluno(String nome, Matricula matricula){
        this.nome = nome;
    //    this.matricula = matricula;
    }

    public void adicionarMatricula(){

    }

    public void removerMatricula(){

    }

}
