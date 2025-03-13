package java8pratico.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Capitulo6 {

    public static void main(String[] args) {

//        Usuario user1 = new Usuario("Paulo Silveira", 150);
//        Usuario user2 = new Usuario("Rodrigo Turini", 120);
//        Usuario user3 = new Usuario("Guilherme Silveira", 190);
//
//        List<Usuario> usuarios = new ArrayList<>();
//        usuarios.add(user1);
//        usuarios.add(user2);
//        usuarios.add(user3);
//
//        Comparator<Usuario> c = Comparator.comparingInt(Usuario::getPontos)
//                .thenComparing(Usuario::getNome);
//        System.out.println("\n");
//        usuarios.forEach(System.out::println);
//
//
//        usuarios.sort(Comparator.nullsLast(
//                Comparator.comparing(Usuario::getNome)));
//
//        System.out.println("\n");
//        usuarios.forEach(System.out::println);
//
//        usuarios.sort(Comparator.nullsFirst(
//                Comparator.comparing(Usuario::getNome)));
//
//        System.out.println("\n");
//        usuarios.forEach(System.out::println);
//
//
//        Usuario rodrigo = new Usuario("Rodrigo Turini", 50);
//        Consumer<Usuario> consumer = Usuario::tornaModerador;
//        consumer.accept(rodrigo);


        Supplier<Usuario> criadorDeUsuarios = Usuario::new;
        Usuario rodrigoA = criadorDeUsuarios.get();
        Usuario pauloA = criadorDeUsuarios.get();
        List<Usuario> usuariosA = new ArrayList<>();
        usuariosA.add(rodrigoA);
        usuariosA.add(pauloA);
        System.out.println("\n");
        usuariosA.forEach(System.out::println);


        Function<String,Usuario> criadorDeUsuarios2 = Usuario::new;
        Usuario rodrigo2 = criadorDeUsuarios2.apply("Rodrigo Turini");
        Usuario paulo2 = criadorDeUsuarios2.apply("Paulo Silveira");
        List<Usuario> usuarios2 = new ArrayList<>();
        usuarios2.add(rodrigo2);
        usuarios2.add(paulo2);
        System.out.println("\n");
        usuarios2.forEach(System.out::println);


        BiFunction<String, Integer, Usuario> criadorDeUsuariosBI =
                Usuario::new;
        Usuario rodrigoB = criadorDeUsuariosBI.apply("Rodrigo Turini", 50);
        Usuario pauloB = criadorDeUsuariosBI.apply("Paulo Silveira", 300);
        List<Usuario> usuariosB = new ArrayList<>();
        usuariosB.add(rodrigoB);
        usuariosB.add(pauloB);
        System.out.println("\n");
        usuariosB.forEach(System.out::println);


    }
}
