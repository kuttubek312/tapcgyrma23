import java.util.*;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        int[] array = new int[20];
        List<Integer> integerArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(2);
            integerArrayList.add(random.nextInt(2));
            integerLinkedList.add(random.nextInt(2));
 
        }

        System.out.println(" раньше LinkedList " + Arrays.toString(array));
        Arrays.sort(array);
        sortInt(array);
        System.out.println(" раньше ArrayList " + integerArrayList);
        Collections.sort(integerArrayList);
        System.out.println(" последующий LinkedList " + integerArrayList);
        Collections.sort(integerLinkedList);
        System.out.println("раньше LinkedList " + integerLinkedList);
        System.out.println("последующий LinkedList " + integerLinkedList);

    }

    public  static void sortInt (int[] array){
        Arrays.sort(array);

    }

}