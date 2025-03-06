package Models;

import Enums.StatusMatricula;
import Enums.TipoMatricula;

import java.util.ArrayList;
import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private int numeroMatricula;
    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();
    private Date dataMatricula;
    private TipoMatricula tipoMatricula;
    private StatusMatricula statusMatricula;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplina.add(disciplina);
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public TipoMatricula getTipoMatricula() {
        return tipoMatricula;
    }

    public void setTipoMatricula(TipoMatricula tipoMatricula) {
        this.tipoMatricula = tipoMatricula;
    }

    public StatusMatricula getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }
}
