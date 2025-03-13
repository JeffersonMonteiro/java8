package java8pratico.example;

public class Capitulo3 {
    public static void main(String[] args) {
        ValidadorCEP<String> validadorCEP = new ValidadorCEP<String>() {
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        ValidadorCEP<String> validadorCEP2 =
                valor -> {
                    return valor.matches("[0-9]{5}-[0-9]{3}");
                };

        ValidadorCEP<String> validadorCEP3 =
                valor -> valor.matches("[0-9]{5}-[0-9]{3}");


        System.out.println(validadorCEP3.valida("04101-300"));


        Runnable o = () ->{
            System.out.println("O que sou eu? Que lambda?");
        };
        System.out.println(o);
        System.out.println(o.getClass());




        final int numero = 5; //tem que ser final
        new Thread(() ->{
            System.out.println(numero);
        }).start();


       /* int numero2 = 5; //** ERRADO tem que ser final
        new Thread(() ->{
            System.out.println(numero2);
        }).start();

        numero2 = 10; // por causa dessa linha!*/
    }
}
