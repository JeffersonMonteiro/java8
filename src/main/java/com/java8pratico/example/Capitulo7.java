package com.java8pratico.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Capitulo7 {

    public static void main(String[] args) {

        //Para filtrar os10 usuários com mais pontos e torná-los moderadores, podemos agora
        //fazer o seguinte código
        BiFunction<String, Integer, Usuario> criadorDeUsuariosBI =
                Usuario::new;
        List<Usuario> usuariosB = new ArrayList<>();

        for(int i= 0; i<15;i++){
            usuariosB.add(criadorDeUsuariosBI.apply("Rodrigo Turini"+i, i));
        }

        usuariosB.sort(Comparator.comparing(Usuario::getPontos).reversed());
        usuariosB
                .subList(0,10)
                .forEach(Usuario::tornaModerador);

        usuariosB.forEach(System.out::println);
    }
}
