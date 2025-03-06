package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    @JsonProperty("nome")
    @Nonnull
    private String nome;

    @Column(name = "matricula_id")
    @JsonProperty("matricula_id")
    @Nonnull
    private Integer matricula;



    public Aluno(@Nonnull String nome, Matricula matricula){
        this.nome = nome;
        this.matricula = matricula.getNumeroMatricula();
    }

    public Aluno(@Nonnull String nome){
        this.nome = nome;
    }

    public Aluno() {

    }

    public void adicionarMatricula(Matricula matricula){
        this.matricula = matricula.getNumeroMatricula();
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
