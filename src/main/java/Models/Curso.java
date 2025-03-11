package Models;

import java.util.ArrayList;


public class Curso {

    private Long id;
    private String nome;
    private Integer creditos;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;

    }

    public Curso() {

    }

    // esses metodos devem estar no controller
    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }
}
