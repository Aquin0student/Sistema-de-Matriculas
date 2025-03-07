package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Universidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name =  "nome")
    @JsonProperty("nome")
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "universidade_aluno",
            joinColumns = @JoinColumn(name = "universidade_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private List<Aluno> alunos;

    @ManyToMany
    @JoinTable(
            name = "universidade_curso",
            joinColumns = @JoinColumn(name = "universidade_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> cursos;

    @ManyToMany
    @JoinTable(
            name = "universidade_disciplina",
            joinColumns = @JoinColumn(name = "universidade_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas;

    @ManyToMany
    @JoinTable(
            name = "universidade_professor",
            joinColumns = @JoinColumn(name = "universidade_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
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

