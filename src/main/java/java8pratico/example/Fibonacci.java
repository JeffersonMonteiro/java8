package java8pratico.example;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Fibonacci implements IntSupplier {

    private int anterior = 0;
    private int proximo = 1;

    @Override
    public int getAsInt() {
        proximo = proximo + anterior;
        anterior = proximo - anterior;
        return anterior;
    }

    public static void main(String[] args) {
//        IntStream.generate(new Fibonacci())
//                .limit(10)
//                .forEach(System.out::println);


        int maiorQue100 = IntStream
                .generate(new Fibonacci())
                .filter(f -> f > 100)
                .findFirst()
                .getAsInt();
        System.out.println(maiorQue100);
    }
}
