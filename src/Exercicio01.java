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

        while(!removido){
            if (pilha.isEmpty()){
                for(int j = 0; j < a; j++){
                    pilha.push(reserva.pop());
                }
                dia++;
            }

            else if (a == pilha.size()){
                removido = true;
            }

            else{
                reserva.push(pilha.pop());
                if (pilha.size() > 1){
                    if (pilha.peek() < reserva.peek()){
                        reserva.pop();
                    }
                    a = pilha.size();


                }
            }
        }


        return dia;
    }

}