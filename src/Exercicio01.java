import java.util.Stack;
import java.lang.Integer;

public class Exercicio01 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(30);
        pilha.push(25);
        pilha.push(40);
        pilha.push(20);
        pilha.push(35);
        pilha.push(50);
        pilha.push(45);

        System.out.println(calculaDias(pilha));
    }

    public static int calculaDias(Stack<Integer> pilha){
        Stack<Integer> reserva =new Stack<>();
        int dia = 0;
        int a = 0;
        boolean removido = false;
        Stack<Integer> aux = new Stack<>();


        while(!removido){
            if (pilha.isEmpty()){
                a=reserva.size();
                for(int j = 0; j < a; j++){
                    pilha.push(reserva.pop());
                    aux.push(pilha.peek());
                }
                dia++;
                int k=0;
                for (int i =0; i < pilha.size()-1; i++){
                    int auxiliar = aux.pop();

                    if (aux.peek() != null && auxiliar < aux.peek()){
                        k++;

                    }
                }
                if (k==pilha.size()-1){
                    removido = true;
                }
            }
            else{
                reserva.push(pilha.pop());
                if (pilha.size() > 1){
                    if (pilha.peek() < reserva.peek()){
                        reserva.pop();
                    }
                }
            }
        }
        return dia;
    }

}