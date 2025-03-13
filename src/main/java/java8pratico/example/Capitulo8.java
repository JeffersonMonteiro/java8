package java8pratico.example;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Capitulo8 {

    public static void main(String[] args) {

        //Para filtrar os10 usuários com mais pontos e torná-los moderadores, podemos agora
        //fazer o seguinte código
        BiFunction<String, Integer, Usuario> criadorDeUsuariosBI =
                Usuario::new;
        List<Usuario> usuariosB = new ArrayList<>();

        for(int i= 0; i<15;i++){
            usuariosB.add(criadorDeUsuariosBI.apply("Rodrigo Turini"+i, i));
        }

//        usuariosB.stream()
//                .filter(u -> u.getPontos() > 10 )
//                .sorted(Comparator.comparing(Usuario::getNome))
//                .forEach(System.out::println);


//        List<Usuario> filtradosOrdenados = usuariosB.stream()
//                .filter(u -> u.getPontos() > 5)
//                .sorted(Comparator.comparing(Usuario::getNome))
//                .collect(Collectors.toList());
//        filtradosOrdenados.forEach(System.out::println);

//        Optional<Usuario> usuarioOptional = usuariosB.stream()
//                .filter(u -> u.getPontos() > 7)
//                .findAny();
//        System.out.println(usuarioOptional.isPresent()? usuarioOptional.get(): 0);

//        usuariosB.stream()
//                .sorted(Comparator.comparing(Usuario::getNome))
//                .peek(System.out::println)
//                .findAny();

//        double pontuacaoMedia = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .average()
//                .getAsDouble();

//        int valorInicial = 0;
//        IntBinaryOperator operacao = (a, b) -> a + b;
//        int total = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .reduce(valorInicial, operacao);
//
//
//        int total2 = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .reduce(0, (a, b) -> a + b);
//
//        int total3 = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .reduce(0, Integer::sum);
//
//        int multiplicacao = usuariosB.stream()
//                .mapToInt(Usuario::getPontos)
//                .reduce(1, (a,b) -> a * b);


        //Streams infinitos
//        Random random = new Random(0);
//        IntStream stream = IntStream.generate(() -> random.nextInt());
//
//
//        List<Integer> list = stream
//                .limit(10)
//                .boxed()
//                .peek(System.out::println)
//                .collect(Collectors.toList());


        Random random2 = new Random(0);
        List<Integer> list2 = IntStream
                .generate(() -> random2.nextInt())
                .limit(100)
                .boxed()
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
