/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Aldo
 */
public class TestLine {
    public static void main(String[] args) {
        Line x = new Line(25, 50, 45, 30);
        System.out.println(x.getLength());
        System.out.println(x.isGreater(x, x));
        System.out.println(x.isLess(x, x));
    }
}
