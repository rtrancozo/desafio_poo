package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descrição da Mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao(" Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        System.out.println("Conteúdos inscritos Rodrigo: "+ devRodrigo.getConteudosInscritos());
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rodrigo: "+ devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("Conteúdos Concluídos Rodrigo: "+ devRodrigo.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Rodrigo: "+ devRodrigo.getConteudosInscritos());
        System.out.println("XP: "+devRodrigo.calcularTotalXP());



        Dev devJoao = new Dev();
        devJoao.setNome("João");
        System.out.println("Conteúdos inscritos João: "+ devJoao.getConteudosInscritos());
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos João: "+ devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("XP: "+devJoao.calcularTotalXP());











    }
}
