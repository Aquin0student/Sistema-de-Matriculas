package Controllers;
import java.util.Random;
import Models.Aluno;
import Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.Scanner;

@Controller
public class UniversidadeController {

    @Autowired
    private AlunoRepository alunoRepository;
//ajustar essa parte, precisa criar uma matricula e entao atribuir ao aluno
    public void adicionarAluno() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scan.nextLine();

        int matricula = gerarNumeroMatricula();
        Aluno aluno = new Aluno(nome, matricula);
    }

    private int gerarNumeroMatricula() {
        Random rand = new Random();
        return 1000000 + rand.nextInt(999999);
    }

    public void gerarMatricula() {
        Scanner scan = new Scanner(System.in);

    }
}
