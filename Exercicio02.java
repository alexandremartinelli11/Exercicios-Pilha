import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de participantes: ");
        int n = sc.nextInt();
        System.out.println("Digite o numero de batidas: ");
        int k = sc.nextInt();

        int vencedor = dancaDasCadeiras(n, k);
        System.out.println(vencedor);
    }

    public static int dancaDasCadeiras(int n, int k) {
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 1; i < n+1; i++) {
            fila.add(i);
        }

        while(fila.size() > 1) {
            for(int i = 0; i < k;i++){
                fila.add(fila.poll());
            }
            fila.poll();
        }

        return fila.poll();

    }
}
