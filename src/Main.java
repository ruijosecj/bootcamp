import ruijosecj.desafio.dominio.Bootcamp;
import ruijosecj.desafio.dominio.Curso;
import ruijosecj.desafio.dominio.Dev;
import ruijosecj.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso JS");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("+++++++++++++++++++");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Xp: " + devCamila.calcularTotalXp());


        System.out.println("_____________________________________");
        Dev devRui = new Dev();
        devRui.setNome("Rui");
        devRui.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Rui: " + devRui.getConteudosInscritos());
        devRui.progredir();
        System.out.println("++++++++++++++++++");
        System.out.println("Conteudos inscritos Rui: " + devRui.getConteudosInscritos());
        System.out.println("Conteudos concluidos Rui: " + devRui.getConteudosConcluidos());
        System.out.println("Xp: " + devRui.calcularTotalXp());
    }
}
