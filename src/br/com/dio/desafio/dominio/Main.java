package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        Curso curso2 = new Curso();


        curso.setTitulo("JavaScript");
        curso.setDescricao("descrição curso javaScript");
        curso.setCargaHoraria(4);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria");
        mentoria.setDescicao("Descrição da Mentoria");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);





    }
}
