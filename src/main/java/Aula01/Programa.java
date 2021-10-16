package Aula01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String [] args) {


        Scanner scanner = new Scanner(System.in);


        Cachorro thor = new Cachorro("Thor", 9,"grave");
        Cachorro bela = new Cachorro();

        System.out.println("Informe a idade da Belinha");
        bela.setIdade(scanner.nextInt());
        scanner.nextLine();

        thor.latir();
        thor.setNome("Thor");
        thor.setIdade(9);
        thor.setLatido("Grave");
        System.out.println(thor.getNome()+"\n"+thor.getIdade()+"\n" +thor.getLatido());
        System.out.println(thor.toString());

        bela.setNome("Belinha");
        System.out.println(bela.getNome().toUpperCase());
        System.out.println(bela.getNome().substring(0,4));
        System.out.println("Idade da belinha é "+bela.getIdade());

    }
}
