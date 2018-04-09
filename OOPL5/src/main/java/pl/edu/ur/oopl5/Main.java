package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        Scanner wczytaj = new Scanner(System.in);

        System.out.println("Podaj nr zadania 3, 5 lub 6");
        int wybor = wczytaj.nextInt();

        switch (wybor) {
            case 3:
                Stos stos = new Stos(100);
                System.out.println("Co zrobic ze stosem?");
                System.out.println("1 - Dodac liczbe");
                System.out.println("1 - Usunac liczbe");
                int wybor3 = wczytaj.nextInt();
                switch (wybor3) {
                    case 1:
                        System.out.println("Podaj liczbe: ");
                        int n = wczytaj.nextInt();
                        stos.push(n);
                        break;
                    case 2:
                        stos.pop();
                        break;
                }
                break;

            case 5:
                int n,
                 b;
                Firma firma = new Firma();

                System.out.println("1 - Dodawanie");
                System.out.println("2 - Wyswietlanie");

                int wybor5 = wczytaj.nextInt();
                switch (wybor5) {

                    case 1:
                        System.out.println("Ilu pracownikow dodac: ");
                        int ilu = wczytaj.nextInt();
                        for (int i = 0; i < ilu; i++) {
                            firma.pobierz(i);
                        }
                        break;
                    case 2:
                        firma.wypisz();
                        break;
                }
                break;

            case 6:
                //System.out.println("Podaj liczbe: ");
                //int x = wczytaj.nextInt();
                
                //Liczba liczba1 = new Liczba(x);
               // System.out.println("Podaj liczbe do mnozenia oraz do silni: ");
                //int y = wczytaj.nextInt();
                
 
                //liczba1.silnia(5);
                break;
        }
    }
}
