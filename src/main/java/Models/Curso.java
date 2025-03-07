package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    @JsonProperty("nome")
    private String nome;

    @Column(name = "numCreditos")
    @JsonProperty("creditos")
    @Nonnull
    private Integer creditos;

    @ManyToMany(mappedBy = "disciplina")
    @JoinTable(
            name = "curso_disciplina",
            joinColumns = @JoinColumn(name = "disciplina_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;

    }

    public Curso() {

    }

    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }
}
