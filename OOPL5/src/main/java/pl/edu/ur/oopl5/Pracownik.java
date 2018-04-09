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
public class Pracownik {

    public String imie;
    public String nazwisko;
    public String stanowisko;
    public int wiek;

    public Pracownik(String imie, String nazwisko, String stanowisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wiek = wiek;
    }
    
    public void show() {
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Stanowisko: " + this.stanowisko);
        System.out.println("Wiek: " + this.wiek);
    }
}
