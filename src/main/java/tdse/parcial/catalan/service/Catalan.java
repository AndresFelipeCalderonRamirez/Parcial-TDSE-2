package tdse.parcial.catalan.service;

import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
public class Catalan {

    public static LinkedList<Long> catalan(int n) {
        LinkedList<Long> numbersCatalan = new LinkedList<>();
        long[] catalan = new long[n + 1];
        catalan[0] = 1;
        numbersCatalan.add(catalan[0]);

        if (n > 0) {
            catalan[1] = 1;
            numbersCatalan.add(catalan[1]);
        }

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
            numbersCatalan.add(catalan[i]);
        }

        return numbersCatalan;
    }
}