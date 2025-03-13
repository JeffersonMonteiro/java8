package java8pratico.example;

import java.util.*;
import java.util.function.BiFunction;


public class Grupo {
    private Set<Usuario> usuarios = new HashSet<>();

    public void add(Usuario u) {
        usuarios.add(u);
    }

    public Set<Usuario> getUsuarios() {
        return Collections.unmodifiableSet(this.usuarios);
    }

    public static void main(String[] args) {
        BiFunction<String, Integer, Usuario> criadorDeUsuariosBI =
                Usuario::new;

        Grupo englishSpeakers = new Grupo();
        englishSpeakers.add(criadorDeUsuariosBI.apply("Rodrigo Turini", 5));
        englishSpeakers.add(criadorDeUsuariosBI.apply("Rodrigo B", 13));

        Grupo spanishSpeakers = new Grupo();
        spanishSpeakers.add(criadorDeUsuariosBI.apply("Jose Turini", 25));
        spanishSpeakers.add(criadorDeUsuariosBI.apply("Turini Anselmo", 43));

        List<Grupo> groups = Arrays.asList(englishSpeakers, spanishSpeakers);

        groups.stream()
                .flatMap(g -> g.getUsuarios().stream())
                .distinct()
                .forEach(System.out::println);
    }

}
