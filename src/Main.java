import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        int meuNum = Integer.parseInt(args[0]);

        for (int i=0; i<=meuNum; i++){
            lista.add(i);
        }
        System.out.println(lista);
    }

}
