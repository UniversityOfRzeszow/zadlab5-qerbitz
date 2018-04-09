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
public class Stos {

    private int wskaznik;
    private int rozmiar;
    int tab[] = new int[rozmiar];

    public Stos(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public void push(int n) {
        if (wskaznik >= rozmiar) {
            System.out.println("Stos jest pelny");
        } else {
            wskaznik = 0;
            tab[wskaznik] = n;
            wskaznik++;
        }
    }

    public void pop() {
        if (wskaznik == 0) {
            System.out.println("Stos jest pusty");
        } else {
            System.out.println("Element usuniety " + tab[wskaznik]);
            wskaznik--;
        }
    }

}
