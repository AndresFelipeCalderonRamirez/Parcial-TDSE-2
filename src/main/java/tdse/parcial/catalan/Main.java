package tdse.parcial.catalan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import tdse.parcial.catalan.service.Catalan;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Catalan.catalan(10));
    }
}