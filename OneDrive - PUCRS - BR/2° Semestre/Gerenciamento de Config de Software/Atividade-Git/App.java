import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        int quant, count = 0;

        System.out.println("Digite quantos elementos deseja adicionar no array: ");
        quant = in.nextInt();

        count = ocorrencia(lista, quant);
        System.out.println("Numero de ocorrências: " + count);


        System.out.println("O item se repete na lista? " + itemRepetido(lista));
    }

    public static int ocorrencia(ArrayList<Double> lista, int quant) {
        double elemento, num;
        int count = 0;

        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o valor do elemento " + i + 1);
            elemento = in.nextDouble();

            lista.add(elemento);
        }

        System.out.println("Digite o elemento que deseja procurar: ");
        num = in.nextDouble();

        for (Double elementoLista : lista) {
            if (num == elementoLista) {
                count++;
            }
        }
        return count;
    }

    public static boolean itemRepetido(ArrayList<Double> lista) {
        int num;

        System.out.println("Digite o numero que deseja verificar a repetição: ");
        num = in.nextInt();

        for (Double numero : lista) {
            if (numero == num) {
                return true;
            }
        }
        return false;
    }
}

