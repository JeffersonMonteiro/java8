package java8pratico.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Capitulo5 {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

       /* Comparator<Usuario> comparator = new Comparator<Usuario>() {
            public int compare(Usuario u1, Usuario u2) {
                return u1.getNome().compareTo(u2.getNome());
            }
        };
        Collections.sort(usuarios, comparator);*/

        //OR

      /*  Comparator<Usuario> comparator = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
        Collections.sort(usuarios, comparator);*/

        //OR

        /*Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));*/

        //OR

        //usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));


        //OR

       /* usuarios.sort(Comparator.comparing(u -> u.getNome()));

        Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

        usuarios.forEach(imprimeNome);*/


        List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");

        //Collections.sort(palavras);

        //palavras.sort(Comparator.naturalOrder());

        palavras.sort(Comparator.reverseOrder());

        for (int i = 0; i < palavras.size(); i++) {
            System.out.println(palavras.get(i).toString());
        }

    }
}
