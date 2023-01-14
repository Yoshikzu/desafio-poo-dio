import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargoHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso de JS");
        curso2.setCargoHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria Java");
        mentoria.setData(LocalDate.now());

        Desafio desafio = new Desafio(NivelDesafio.BASICO);
        desafio.setTitulo("Desafio: Cálculo da Mesada");
        desafio.setDescricao("Escreve um programa em Java que tenha como entrada o número de meses e o valor e calcule a quantidade de dinheiro ganhado.");

        /*System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafio);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        devMarcelo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Marcelo: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP: " + devMarcelo.calcularTotalXp());
        System.out.println("-----------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println(bootcamp.getDevsIncritos().toString());
    }
}
