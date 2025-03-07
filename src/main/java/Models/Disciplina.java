package Models;

import Enums.StatusDisciplina;
import Enums.TipoDisciplina;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int creditos;
    private Boolean ativo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoDisciplina tipoDisciplina;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusDisciplina statusDisciplina;

    @ManyToMany(mappedBy = "disciplina")
    private List<Professor> professores;

    @OneToMany(mappedBy = "disciplina")
    private List<Matricula> matriculas;

    public Disciplina() {
        this.ativo = true;
    }

    public Disciplina(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;
        this.ativo = true;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}
