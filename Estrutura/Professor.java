package Models;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Professor(String nome){
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public ArrayList<Aluno> verAlunosMatriculados(Disciplina disciplina){
       ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
       matriculas = disciplina.getMatriculas();
       ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        for (Matricula matricula : matriculas) {
            alunos.add(matricula.getAluno());
        }
       return alunos;
    }
}
