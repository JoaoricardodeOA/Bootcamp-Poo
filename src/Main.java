import domain.Bootcamp;
import domain.Curso;
import domain.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Poo");
        curso1.setCargaHoraria(2);
        curso1.setDescricao("Nesse curso você será capaz de criar aplicaçãoes com Poo");
        System.out.println(curso1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Aprenda a ser java developer");
        bootcamp.getConteudos().add(curso1);

        Dev camila= new Dev();
        camila.setNome("cami");
        System.out.println("Conteudos inscritos cami "+camila.getConteudosInscritos());
        camila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos cami "+camila.getConteudosInscritos());
        camila.progredir();
        System.out.println("Conteudos concluidos cami "+camila.getConteudosConcluidos());
        System.out.println(camila.calcularTotalXP());

    }
}
