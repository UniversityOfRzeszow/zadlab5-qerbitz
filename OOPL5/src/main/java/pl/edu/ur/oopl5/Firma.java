/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Krzys
 */
public class Firma {

    Pracownik[] pracownicy = new Pracownik[100];

    Scanner wczytaj = new Scanner(System.in);

    public void pobierz(int i) {
        System.out.println("Podaj imie pracownika: ");
        pracownicy[i].imie = wczytaj.next();

        System.out.println("Podaj nazwisko pracownika: ");
        pracownicy[i].nazwisko = wczytaj.next();

        System.out.println("Podaj stanowisko pracownika: ");
        pracownicy[i].stanowisko = wczytaj.next();

        System.out.println("Podaj wiek pracownika: ");
        pracownicy[i].wiek = wczytaj.nextInt();
        
        pracownicy[i] = new Pracownik(pracownicy[i].imie,pracownicy[i].nazwisko, pracownicy[i].stanowisko, pracownicy[i].wiek );
    }

    public void wypisz() {
        System.out.println("Aktualny spis pracownikow: ");
        for (int i = 0; i < 100; i++) {
            pracownicy[i].show();
        }
    }
}
