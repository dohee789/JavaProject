package view;

import controller.Controller;

public class StartView {
	public static void main(String[] args) {
		
		System.out.println("*** Encore 출판사 ***\n");
		Controller.reqRes("Encore");
		
		System.out.println();
		
		System.out.println("*** Playdata 출판사 ***\n");
		Controller.reqRes("Playdata");
		
		System.out.println();

		System.out.println("*** 민음사 출판사 ***\n");
		Controller.reqRes("민음사");
		
	}
}
