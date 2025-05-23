import java.util.LinkedList;
import java.lang.Integer;

public class Exercicio03 {
    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<Integer> lista2 = new LinkedList<>();

        lista1.add(2);
        lista1.add(5);
        lista1.add(6);
        lista2.add(1);
        lista2.add(3);
        lista2.add(4);

        System.out.println(listaIntercalada(lista1, lista2));

    }


    public static LinkedList<Integer> listaIntercalada (LinkedList<Integer> lista1, LinkedList<Integer> lista2){
        LinkedList<Integer> listaIntercalada = new LinkedList<>();


        while(!lista1.isEmpty() & !lista2.isEmpty()){
            int i=0, j=0;
            if (lista1.get(i) < (lista2.get(j))){
                listaIntercalada.add(lista1.get(i));
                lista1.remove(i);
                i++;
            }
            else if (lista2.get(j) < (lista1.get(i))){
                listaIntercalada.add(lista2.get(j));
                lista2.remove(j);
            }

            j++;
            if (j == lista2.size()){
                i++;
                j=0;
            }
            if (i == lista1.size()){
                j++;
                i=0;
            }
            if(lista1.size() == 0){
                listaIntercalada.addAll(lista2);
            }
            else if(lista2.size() == 0){
                listaIntercalada.addAll(lista1);
            }
        }

        return listaIntercalada;
    }

}