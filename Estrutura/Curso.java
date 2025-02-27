package Models;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private int creditos;
    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();

    public Curso(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;

    }
    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplina.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina){
        this.disciplina.remove(disciplina);
    }
}
