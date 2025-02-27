package Controllers;
import java.util.Random;
import Models.Aluno;


import java.util.Scanner;

public class UniversidadeController {

    public void cadastrarAluno() {
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        new Aluno(nome);
    }

    private int gerarNumeroMatricula() {
        Random rand = new Random();
        return 1000000 + rand.nextInt(999999);
    }

    public void gerarMatricula() {
        Scanner scan = new Scanner(System.in);

    }
}
