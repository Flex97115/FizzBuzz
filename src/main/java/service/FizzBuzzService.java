package service;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzService {

    private final List<Integer> elements;

    public FizzBuzzService(List<Integer> elements) {
        this.elements = elements;
    }

    /**
     * Exécute le fizz buzzing
     *
     * @return
     */
    public String doFizzBuzzing(){
        return elements.stream()
                .map(this::isDivisible)
                .collect(Collectors.joining());
    }

    /**
     * Exécute la série de test suivante :
     * <ul>
     *     <li>Si le nombre est divisible par 3 retourner Fizz</li>
     *     <li>Si le nombre est divisible par 5 retourner Buzz</li>
     *     <li>Sinon retourner le nombre lui même</li>
     * </ul>
     *
     * @param number Nombre à tester
     * @return       Fizz ou Buzz ou Nombre
     */
    private String isDivisible(int number){
        if(number % 3 == 0) return "Fizz";
        if(number % 5 == 0) return "Buzz";
        return String.valueOf(number);
    }
}
