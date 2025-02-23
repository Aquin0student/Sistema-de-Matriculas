package Models;

import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();


    public Universidade(String nome){
        this.nome = nome;
    }

    public Universidade(ArrayList<Aluno> alunos, ArrayList<Curso> cursos, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores, String nome) {
        this.alunos = alunos;
        this.cursos = cursos;
        this.disciplinas = disciplinas;
        this.professores = professores;
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

