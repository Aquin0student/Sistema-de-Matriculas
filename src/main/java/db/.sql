CREATE DATABASE IF NOT EXISTS sistema_de_matriculas;

USE sistema_de_matriculas;


CREATE TABLE Professor(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255)
);

CREATE TABLE Disciplina(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(60),
    creditos INT,
    ativa BOOLEAN
);

CREATE TABLE Universidade(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255)

);

CREATE TABLE Aluno(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    matricula_id INT
);

CREATE TABLE Curso(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    numCreditos INT

);

CREATE TABLE Matricula(
    id INT AUTO_INCREMENT PRIMARY KEY,
    aluno_id INT,
    curso_id INT,
    numero_matricula INT,
    data_matricula DATE,
    status ENUM('ATIVA', 'CANCELADA') NOT NULL,
    tipo ENUM('OBRIGATORIA', 'OPTATIVA') NOT NULL,
    FOREIGN KEY (aluno_id) REFERENCES aluno(id),
    FOREIGN KEY (curso_id) REFERENCES curso(id)
);

CREATE TABLE curso_disciplina (
    curso_id INT,
    disciplina_id INT,
    PRIMARY KEY (curso_id, disciplina_id),
    FOREIGN KEY (curso_id) REFERENCES curso(id) ON DELETE CASCADE,
    FOREIGN KEY (disciplina_id) REFERENCES disciplina(id) ON DELETE CASCADE
);

CREATE TABLE disciplina_matricula(
    disciplina_id INT,
    matricula_id INT,
    PRIMARY KEY (disciplina_id, matricula_id),
    FOREIGN KEY (disciplina_id) REFERENCES disciplina(id) ON DELETE CASCADE,
    FOREIGN KEY (matricula_id) REFERENCES Matricula(id) ON DELETE CASCADE
);

CREATE TABLE professor_disciplina(
    professor_id INT,
    disciplina_id INT,
    PRIMARY KEY (professor_id, disciplina_id),
    FOREIGN KEY (professor_id) REFERENCES professor(id) ON DELETE CASCADE,
    FOREIGN KEY (disciplina_id) REFERENCES disciplina(id) ON DELETE CASCADE
);

CREATE TABLE aluno_disciplina(
    aluno_id INT,
    disciplina_id INT,
    creditos int,
    PRIMARY KEY (aluno_id, disciplina_id),
    FOREIGN KEY (aluno_id) REFERENCES Aluno(id) ON DELETE CASCADE,
    FOREIGN KEY (disciplina_id) REFERENCES disciplina(id) ON DELETE CASCADE
);

CREATE TABLE universidade_curso(
    universidade_id INT,
    curso_id INT,
    PRIMARY KEY (universidade_id, curso_id),
    FOREIGN KEY (curso_id) REFERENCES curso(id) ON DELETE CASCADE,
    FOREIGN KEY (universidade_id) REFERENCES Universidade(id) ON DELETE CASCADE
);

CREATE TABLE universidade_disciplina(
    universidade_id INT,
    disciplina_id INT,
    PRIMARY KEY (universidade_id, disciplina_id),
    FOREIGN KEY (disciplina_id) REFERENCES disciplina(id) ON DELETE CASCADE,
    FOREIGN KEY (universidade_id) REFERENCES Universidade(id) ON DELETE CASCADE
);

CREATE TABLE universidade_professor(
    universidade_id INT,
    professor_id INT,
    PRIMARY KEY (universidade_id, professor_id),
    FOREIGN KEY (professor_id) REFERENCES professor(id) ON DELETE CASCADE,
    FOREIGN KEY (universidade_id) REFERENCES Universidade(id) ON DELETE CASCADE
);

CREATE TABLE universidade_aluno(
    universidade_id INT,
    aluno_id INT,
    PRIMARY KEY (universidade_id, aluno_id),
    FOREIGN KEY (aluno_id) REFERENCES aluno(id) ON DELETE CASCADE,
    FOREIGN KEY (universidade_id) REFERENCES Universidade(id) ON DELETE CASCADE
);