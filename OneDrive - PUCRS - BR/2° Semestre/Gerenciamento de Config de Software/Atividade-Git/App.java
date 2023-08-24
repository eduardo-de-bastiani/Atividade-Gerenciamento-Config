import java.util.*;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int quant, count, quant2;
        int num;

        System.out.println("Digite quantos elementos deseja adicionar no array l1: ");
        quant = in.nextInt();

        System.out.println("Digite os elementos que deseja inserir em l1:");
        for (int i = 0; i < quant; i++) {
            num = in.nextInt();
            l1.add(num);
        }
        System.out.println("Elementos inseridos em l1: " + l1);

        System.out.println("Digite quantos elementos deseja adicionar no array l2: ");
        quant2 = in.nextInt();

        System.out.println("Digite os elementos que deseja inserir em l2:");
        for (int i = 0; i < quant2; i++) {
            num = in.nextInt();
            l2.add(num);
        }
        System.out.println("Elementos inseridos em l2: " + l2);

        count = nOcorrencias(l1);
        System.out.println("Numero de ocorrências em l1: " + count);

        boolean hasRepeated = hasRepeat(l1);
        System.out.println("A lista l1 tem elementos repetidos? " + hasRepeated);

        int cont = nroRepeat(l1);
        System.out.println("Número de elementos repetidos em l1: " + cont);

        ArrayList<Integer> intersection = intersect(l1, l2);
        System.out.println("Interseção: " + intersection);
    }

    public static int nOcorrencias(ArrayList<Integer> l1) {
        int num;
        int count = 0;

        System.out.println("Digite o elemento que deseja procurar em l1: ");
        num = in.nextInt();

        for (Integer elementoL1 : l1) {
            if (num == elementoL1) {
                count++;
            }
        }
        return count;
    }

    public static boolean hasRepeat(ArrayList<Integer> l1) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer num : l1) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
    public static int nroRepeat(ArrayList<Integer> l1) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : l1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int totalRepeated = 0;

        for (Integer count : countMap.values()) {
            if (count > 1) {
                totalRepeated += count - 1;
            }
        }

        return totalRepeated;
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        HashSet<Integer> set1 = new HashSet<>(l1);
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (Integer num : l2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }
        return new ArrayList<>(intersectionSet);
    }
}

