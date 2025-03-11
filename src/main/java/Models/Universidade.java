package Models;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

    private Long id;
    private String nome;
    private List<Aluno> alunos;
    private List<Curso> cursos;
    private List<Disciplina> disciplinas;
    private List<Professor> professores;

    public Universidade() {}


    public Universidade(String nome){
        this.nome = nome;
    }


    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    
}

