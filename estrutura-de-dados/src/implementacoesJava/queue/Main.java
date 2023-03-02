package src.implementacoesJava.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println("add " + queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println("offer " + queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println("peek " + queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println("poll "+ queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());


    }
}
