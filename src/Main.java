import domain.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Poo");
        curso1.setCargaHoraria(2);
        curso1.setDescricao("Nesse curso você será capaz de criar aplicaçãoes com Poo");
        System.out.println(curso1);
    }
}
