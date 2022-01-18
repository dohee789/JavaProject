package controller;

import model.Model;
import view.EndView;

public class Controller {

	public static void reqRes(String publisher) {
		if(publisher.equals("Encore")) {
			EndView.printEncore(Model.getBookEncore());
		} else if(publisher.equals("Playdata")) {
			EndView.printPlaydata(Model.getBookPlaydata());
		} else {
			EndView.printMsg("존재하지 않는 출판사입니다.");
		}
	}
}
