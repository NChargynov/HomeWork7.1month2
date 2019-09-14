import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Супергерои против суперзлодеев. ");
        System.out.println("Добавьте супергероев в список A. ");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>(5);

        String phrase = sc.nextLine();
        listA.add(phrase);

        String phrase1 = sc.nextLine();
        listA.add(phrase1);

        String phrase2 = sc.nextLine();
        listA.add(phrase2);

        String phrase3 = sc.nextLine();
        listA.add(phrase3);

        String phrase4 = sc.nextLine();
        listA.add(phrase4);

        System.out.println("Список А. Супергерои.");
        System.out.println(listA.size() + " " + listA);

        System.out.println("Добавьте суперзлодеев в список Б. ");

        ArrayList<String> listB = new ArrayList<>(5);
        String phrase5 = sc.nextLine();
        listB.add(phrase5);

        String phrase6 = sc.nextLine();
        listB.add(phrase6);

        String phrase7 = sc.nextLine();
        listB.add(phrase7);

        String phrase8 = sc.nextLine();
        listB.add(phrase8);

        String phrase9 = sc.nextLine();
        listB.add(phrase9);

        System.out.println("Список Б. Cуперзлодеи.");
        System.out.println(listB.size() + " " + listB);

        ArrayList<String> listC = new ArrayList<>();

        listC.addAll(listA);
        listC.add(1, listB.get(4));
        listC.add(3, listB.get(3));
        listC.add(5, listB.get(2));
        listC.add(7, listB.get(1));
        listC.add(9, listB.get(0));
        System.out.println("________________________________________");
        System.out.println("Список С. Супергерои против суперзлодеев. ");
        System.out.println(listC);

        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String s, String s1) {
                if (s.length() > s1.length()) {
                    return 1;
                } else if (s.length() < s1.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("___________________________");
        System.out.println("Сортировка имен по длине слов. По возрастанию");
        System.out.println(listC);
    }
}
