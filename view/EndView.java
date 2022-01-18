package view;

import model.BookDTO;

public class EndView {
	public static void printEncore(BookDTO[] e) {
		for (BookDTO v : e) {
			System.out.println(v); 
		}
	}

	public static void printPlaydata(BookDTO[] p) {
		for (BookDTO v : p) {
			System.out.println(v); 
		}
	}

	public static void printMsg(String msg) {
		System.out.println(msg);
	}
}
