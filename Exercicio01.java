import java.util.Stack;
import java.lang.Integer;

public class Exercicio01 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        int dias = 7;

        pilha.push(30);
        pilha.push(25);
        pilha.push(40);
        pilha.push(20);
        pilha.push(35);
        pilha.push(50);
        pilha.push(45);

        System.out.println(calculaDias(pilha,dias));
    }

    public static Stack<Integer> calculaDias(Stack<Integer> pilha, int dias){
        Stack<Integer> reserva =new Stack<>();
        int dia = 0;

        for (int i = 0; i < dias; i++){
            if (pilha.isEmpty()){
                for(int j : reserva){
                    pilha.push(j);
                }
                reserva.clear();
                return pilha;
            }
            else{
                reserva.push(pilha.pop());
                boolean removido = false;
                if (pilha.size() > 1){
                    if (pilha.peek() > reserva.peek()){
                        removido = true;
                        pilha.pop();
                    }
                    reserva.push(pilha.pop());
                    if (pilha.peek() < reserva.peek()){
                        reserva.pop();
                        removido= true;
                    }
                    if (removido){

                        for(int j =0; j <= reserva.size(); j++) {
                            if (pilha.peek() < reserva.peek()) {
                                reserva.pop();
                            }
                        }
                    }
                }
                if (!removido){
                    pilha.push(99999);
                    return pilha;
                }
                dia++;
            }
        }

        return reserva;
    }

}