import domain.Bootcamp;
import domain.Curso;
import domain.Dev;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, senha,cargaHoraria;
        String titulo, descricao, nome;
        Curso aux = new Curso();
        Bootcamp bootcamp = new Bootcamp();
        List<Dev> devs = new LinkedList<>();
        Dev aux2 = new Dev();
        Dev aux3 = new Dev();

        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Aprenda a ser java developer");

        do{
            Menu();
            op=in.nextInt();in.nextLine();
            switch (op){
                case 1:
                    System.out.println("Digite a senha de acesso: ");
                    senha = in.nextInt();in.nextLine();
                    if(senha==2012){
                        System.out.println("Se desejar criar um curso digite 1, caso não digite qualquer outro número: ");
                        op = in.nextInt();in.nextLine();
                        if (op == 1){
                            System.out.println("Digite o título do curso: ");
                            titulo = in.nextLine();
                            aux.setTitulo(titulo);
                            System.out.println("Digite a descrição: ");
                            descricao = in.nextLine();
                            aux.setDescricao(descricao);
                            System.out.println("Digite a carga horária: ");
                            cargaHoraria = in.nextInt();in.nextLine();
                            aux.setCargaHoraria(cargaHoraria);
                            bootcamp.getConteudos().add(aux);
                        }
                    }else System.out.println("senha errada, acesso negado");
                    break;
                case 2:
                    System.out.println("É novo dev? caso sim digite 1, caso deseje prosseguir qualquer outro número: ");
                    op=in.nextInt();in.nextLine();
                    if (op==1){
                        System.out.println("digite o username: ");
                        nome = in.nextLine();
                        aux2.setNome(nome);
                        aux2.inscreverBootcamp(bootcamp);
                        devs.add(aux2);
                        System.out.println("Senha da entrada: "+ devs.indexOf(aux2));
                    }else{
                        System.out.println("digite a entrada: ");
                        senha = in.nextInt();in.nextLine();
                        aux3 = devs.get(senha);
                        aux3.progredir();
                        System.out.println(aux3.getConteudosInscritos());
                        System.out.println(aux3.getConteudosConcluidos());
                        System.out.println(aux3.calcularTotalXP());
                    }
                    break;
                default:
                    System.out.println("Ação inexistente");
            }
        }while(true);

    }
    public static void Menu(){
        System.out.println("Menu administrador bootcamp - digite 1");
        System.out.println("Menu dev aluno - digite 2");
    }
}

