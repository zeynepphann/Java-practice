package day25_Lists02;

import java.util.ArrayList;
import java.util.List;

import static day25_Lists02.C04_ListedenTekrarliElementleriSilme.terkarsizListeOlustur;

public class C05_ListiTekrarsizYap {
    public static void main(String[] args) {
        // verilen bir listeden tekrar eden sayilari sadece 1 kere yazdiran bir methodd olusturun
        //orn [1,3,5,3,5,6,1,7]
        //output [1,3,5,6,7]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar= terkarsizListOlustur(sayilar);




    }

    private static List<Integer> terkarsizListOlustur(List<Integer> sayilar) {

        List<Integer> tekrasizList = new ArrayList<>();

        for (int i = 0; i <sayilar.size(); i++) {
            if (!tekrasizList.contains(sayilar.get(i))){
                tekrasizList.add(sayilar.get(i));
            }

        }
        return tekrasizList;
    }
}
