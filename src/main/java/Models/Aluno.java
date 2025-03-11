package Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Aluno {

    private Long id;
    private String nome;
    private Integer matricula;



    public Aluno( String nome, Matricula matricula){
        this.nome = nome;
        this.matricula = matricula.getNumeroMatricula();
    }

    public Aluno( String nome){
        this.nome = nome;
    }

    public Aluno() {

    }
// Esse metodo deve ficar no controller
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
