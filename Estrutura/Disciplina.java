package Models;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int creditos;
    private Professor professor;
    private ArrayList<Matricula> matriculas;
    private Boolean ativo;

    public Disciplina() {
        ativo = true;
    }
    public Disciplina(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
}
