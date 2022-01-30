import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp(); // instaciar
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos André:" + devAndre.getConteudosInscritos());

        devAndre.progredir();
        devAndre.progredir();
        System.out.println("-");
        System.out.println("Cinteúdos Inscritos André:" + devAndre.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos André:" + devAndre.getConteudosConcluidos());
        System.out.println("XP: " + devAndre.calcularTotalXp());


        System.out.println("---------");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Luiz:" + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devAndre.calcularTotalXp());


    }

}
