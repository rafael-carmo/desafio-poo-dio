import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java SpringBoot");
        curso1.setDescricao("descrição curso Java SpringBoot");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("PostgreSQL");
        curso2.setDescricao("Banco de dados com PostgreSQL");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("MongoDB");
        curso3.setDescricao("Banco de dados com MongoDB");
        curso3.setCargaHoraria(4);
        
        Curso curso4 = new Curso();
        curso4.setTitulo("NodeJs");
        curso4.setDescricao("NodeJs");
        curso4.setCargaHoraria(3);
        
        Curso curso5 = new Curso();
        curso5.setTitulo("Express");
        curso5.setDescricao("Express");
        curso5.setCargaHoraria(2);
        
        Curso curso6 = new Curso();
        curso6.setTitulo("TypeScript");
        curso6.setDescricao("Curso de TypeScript");
        curso6.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java SpringBoot");
        mentoria.setDescricao("Mentoria de Java SpringBoot");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(curso3);
        bootcampJava.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        
        
        Bootcamp bootcampJavaScript = new Bootcamp();
        bootcampJava.setNome("Bootcamp JavaScript Developer");
        bootcampJava.setDescricao("Descrição Bootcamp JavaScript Developer");
        bootcampJava.getConteudos().add(curso4);
        bootcampJava.getConteudos().add(curso5);
        bootcampJava.getConteudos().add(curso6);
        bootcampJava.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcampJavaScript);
        System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafael:" + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

    }

}
