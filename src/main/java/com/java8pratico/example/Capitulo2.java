package com.java8pratico.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

    public static void main(String[] args) {
        //Mostrador mostrador = new Mostrador();

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario u : usuarios) {
            System.out.println(u.getNome());

        }

        //usuarios.forEach(mostrador);
        /*Sabemos que é uma prática comum utilizar classes anônimas para essas tarefas
        mais simples. Em vez de criar uma classe Mostrador só pra isso, podemos fazer
        tudo de uma tacada só:*/
        Consumer<Usuario> mostrador = new Consumer<Usuario>() {
            public void accept(Usuario u){
                System.out.println(u.getNome());
            }
        };
        usuarios.forEach(mostrador);



        /*O código ainda está grande. Parece que o for de maneira antiga era mais sucinto.
        Podemos reduzir um pouco mais esse código, evitando a criação da variável
        local mostrador:*/
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u){
                System.out.println(u.getNome());
            }
        });


        Consumer<Usuario> mostrador2=
                (Usuario u) -> {System.out.println(u.getNome());};
    }

}
