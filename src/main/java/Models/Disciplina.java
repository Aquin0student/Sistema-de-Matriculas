package Models;

import java.util.List;

public class Disciplina {

    private Long id;
    private String nome;
    private int creditos;
    private Boolean ativo;
    //private TipoDisciplina tipoDisciplina;
    //private StatusDisciplina statusDisciplina;
    private List<Professor> professores;
    private List<Matricula> matriculas;

    public Disciplina() {
        this.ativo = true;
    }

    public Disciplina(String nome, int creditos) {
        this.nome = nome;
        this.creditos = creditos;
        this.ativo = true;
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

    public TipoDisciplina getTipoDisciplina() {
        return tipoDisciplina;
    }

    public void setTipoDisciplina(TipoDisciplina tipoDisciplina) {
        this.tipoDisciplina = tipoDisciplina;
    }

    public StatusDisciplina getStatusDisciplina() {
        return statusDisciplina;
    }

    public void setStatusDisciplina(StatusDisciplina statusDisciplina) {
        this.statusDisciplina = statusDisciplina;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
