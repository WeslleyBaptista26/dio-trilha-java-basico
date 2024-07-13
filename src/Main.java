import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Python");
        curso1.setDescricao("Descrição curso de Python");
        curso1.setCargaHoraria(10);
        curso1.setNivelDificuldade("Avançado");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de HTML e CSS");
        curso2.setDescricao("Descrição curso de HTML e CSS");
        curso2.setCargaHoraria(6);
        curso2.setNivelDificuldade("Intermediário");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Desenvolvimento Web");
        mentoria.setDescricao("Descrição mentoria de Desenvolvimento Web");
        mentoria.setData(LocalDate.now());
        mentoria.setMentor("Maria");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Full Stack Developer");
        bootcamp.setDescricao("Descrição Bootcamp Full Stack Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP Total da Ana: " + devAna.calcularTotalXp());

        System.out.println("-------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("XP Total do Carlos: " + devCarlos.calcularTotalXp());
    }
}
