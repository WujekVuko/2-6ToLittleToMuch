package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	double a = Math.random();
	a *= 100;
	a = Math.round(a);
	int c;
	Scanner in = new Scanner(System.in);
	do  {
	    System.out.println("Podaj liczbę: ");
	    c = in.nextInt();
	    if(c < a){System.out.println("Podałeś za małą wartość");}
	    else if(c > a){System.out.println("Podałeś za dużą wartość");}

	    }
	    while(a != c);

		System.out.println("Gratulacje");

    }

}
