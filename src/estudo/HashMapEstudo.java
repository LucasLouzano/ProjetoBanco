package estudo;

import java.util.HashMap;
import java.util.Map;

public class HashMapEstudo {
    public static void main(String[] args) {
        Map<String, Integer> idades = new HashMap<>();
        idades.put("Lucas", 33);
        idades.put("Antonio", 28);

        for (int idade : idades.values()) {
            System.out.println(idade);
        }

        idades.forEach((k, v) -> {
            System.out.println(k + " com a idade: " + v);
        });

        Map<String, String> usuarios = new HashMap<>();
        usuarios.put("12345678912", "Lucas");
        usuarios.put("45678912345", "Antonio");

        System.out.println(usuarios.get("45678912345"));

        System.out.println(usuarios.containsKey("456789"));

        usuarios.remove("45678912345");

        idades.forEach((k, v) -> {
            System.out.println(k + " com a idade: " + v);
        });
    }
}
