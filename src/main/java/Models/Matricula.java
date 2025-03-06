package Models;

import Enums.StatusMatricula;
import Enums.TipoMatricula;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @Column(name = "numero_matricula", unique = true)
    @JsonProperty("numero_matricula")
    private int numeroMatricula;

    @ManyToMany(mappedBy = "matricula", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "disciplina_matricula",
            joinColumns = @JoinColumn(name = "matricula_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas;

    @Column(name = "data_matricula", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataMatricula;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoMatricula tipoMatricula;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusMatricula statusMatricula;


    public Matricula() {}


    public Matricula(Aluno aluno, int numeroMatricula, List<Disciplina> disciplinas, Date dataMatricula, TipoMatricula tipoMatricula, StatusMatricula statusMatricula) {
        this.aluno = aluno;
        this.numeroMatricula = numeroMatricula;
        this.disciplinas = disciplinas;
        this.dataMatricula = dataMatricula;
        this.tipoMatricula = tipoMatricula;
        this.statusMatricula = statusMatricula;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public int getNumeroMatricula() { return numeroMatricula; }
    public void setNumeroMatricula(int numeroMatricula) { this.numeroMatricula = numeroMatricula; }

    public List<Disciplina> getDisciplinas() { return disciplinas; }
    public void setDisciplinas(List<Disciplina> disciplinas) { this.disciplinas = disciplinas; }

    public Date getDataMatricula() { return dataMatricula; }
    public void setDataMatricula(Date dataMatricula) { this.dataMatricula = dataMatricula; }

    public TipoMatricula getTipoMatricula() { return tipoMatricula; }
    public void setTipoMatricula(TipoMatricula tipoMatricula) { this.tipoMatricula = tipoMatricula; }

    public StatusMatricula getStatusMatricula() { return statusMatricula; }
    public void setStatusMatricula(StatusMatricula statusMatricula) { this.statusMatricula = statusMatricula; }
}
