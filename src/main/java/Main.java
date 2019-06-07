import service.FizzBuzzService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // Créer une liste comprenant des entiers de 1 à 10
        List<Integer> elements = IntStream.range(1,11)
                .boxed()
                .collect(Collectors.toList());

        // Appeler FizzBuzzService
        FizzBuzzService service = new FizzBuzzService(elements);
        String result = service.doFizzBuzzing();

        // Afficher le résultat
        System.out.print(result);
    }
}
