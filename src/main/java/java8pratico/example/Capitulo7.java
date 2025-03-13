package java8pratico.example;

import java.util.*;
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
//
//        usuariosB.sort(Comparator.comparing(Usuario::getPontos).reversed());
//        usuariosB
//                .subList(0,10)
//                .forEach(Usuario::tornaModerador);
//
//        usuariosB.forEach(System.out::println);


//        usuariosB.stream()
//                .filter(u -> u.getPontos() > 5);

//        Stream<Usuario> stream = usuariosB
//                .stream()
//                .filter(u -> u.getPontos() > 10);
//
//        stream.forEach(System.out::println);


//        usuariosB.stream()
//                .filter(u -> u.getPontos() > 11)
//                .forEach(Usuario::tornaModerador);



//        List<Usuario> maisQue100 = usuariosB.stream()
//                .filter(u -> u.getPontos() > 100)
//                .collect(toList());
//        maisQue100.forEach(System.out::println);

//// extrair uma lista com a pontuação de todos os usuários:
//        List<Integer> pontos = usuariosB.stream()
//                .map(Usuario::getPontos)
//                .collect(toList());
//        pontos.forEach(System.out::println);

////Observe como ficou mais simples obter a média de pontos dos usuários
//        double pontuacaoMedia = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .average()
//                .getAsDouble();
//        System.out.println(pontuacaoMedia);


//        Pronto. Se a lista for vazia, o valor de pontuacaoMedia será 0.0. Sem o uso
//        do orElse, ao invocar o get você receberia um NoSuchElementException,
//                indicando que o Optional não possui valor definido
//        OptionalDouble media = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .average();
//        double pontuacaoMedia = media.orElse(0.0);


//        double pontuacaoMedia = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .average()
//                .orElse(0.0);
//        System.out.println(pontuacaoMedia);

//        Ou ir ainda além, como lançar uma exception utilizando o método
//        orElseThrow. Ele recebe um Supplier de exceptions, aquela interface funcional
//        que parece bastante uma factory. Podemos então fazer
//        double pontuacaoMedia = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .average()
//                .orElseThrow(IllegalStateException::new);
//                System.out.println(pontuacaoMedia);


//        Podemos verificar o contrário: se realmente existe um valor dentro do opcional.
//                E, no caso de existir, passamos um Consumer como argumento:
//        usuarios.stream()
//                .mapToInt(Usuario::getPontos)
//                .average()
//                .ifPresent(valor -> janela.atualiza(valor))


////        Por exemplo: queremos o usuário com maior quantidade de pontos. Podemos
////        usar o método max para tal, que recebe um Comparator:
//        Optional<Usuario> max = usuariosB
//                .stream()
//                .max(Comparator.comparingInt(Usuario::getPontos));
//        System.out.println(max.get().getNome());

        Optional<String> maxNome = usuariosB
                .stream()
                .max(Comparator.comparingInt(Usuario::getPontos))
                .map(u -> u.getNome());

        System.out.println(maxNome);
    }
}
