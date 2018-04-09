/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Krzys
 */
public class Liczba {

    public int liczba;
    int[] tab = new int[rozmiar(liczba)];

    public Liczba(int liczba) {
        this.liczba = liczba;
    }

    public int rozmiar(int liczba) {
        int size = 0;
        while (liczba / 10 != 0) {
            liczba = liczba / 10;
            size++;
        }
        return size;
    }

    public void silnia(int n) {
        int wynik = 1;
        for (int i = 1; i <=n; i++) {
            wynik = wynik * i;
        }
        System.out.println(wynik);
    }

    public void tablica(int liczba) {
        for (int i = 0; i <= rozmiar(liczba); i++) {
            tab[i] = liczba % 10;
            liczba = liczba / 10;
        }
    }

    public void show() {
        System.out.println("Liczba: " + this.liczba);
    }
}
