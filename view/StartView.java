package view;

import controller.Controller;

public class StartView {
	public static void main(String[] args) {
		
		System.out.println("*** Encore ���ǻ� ***\n");
		Controller.reqRes("Encore");
		
		System.out.println();
		
		System.out.println("*** Playdata ���ǻ� ***\n");
		Controller.reqRes("Playdata");
		
		System.out.println();

		System.out.println("*** ������ ���ǻ� ***\n");
		Controller.reqRes("������");
		
	}
}
