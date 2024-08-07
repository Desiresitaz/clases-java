import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros= new ArrayList<>();

        numeros.add(3);
        numeros.add(5);
        numeros.addLast(9);

        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        for (Integer i: numeros){
            System.out.println(i);
        }

    }

}