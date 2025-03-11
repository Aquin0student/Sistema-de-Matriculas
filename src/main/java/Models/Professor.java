package Models;

import java.io.Serializable;
import java.util.ArrayList;


public class Professor {

    private Long id;
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor() {}

    public Professor(String nome) {
        this.nome = nome;
    }

    // Esse metodo deve ficar no controller?
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    // Esse metodo deve ficar no controller?
    /*
    public List<Aluno> verAlunosMatriculados(@org.jetbrains.annotations.NotNull Disciplina disciplina) {
        return disciplina.getMatriculas().stream()
                .map(Matricula::getAluno)
                .toList();
    }
*/
    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
