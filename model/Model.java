package model;

public class Model {

	public static BookDTO[] getBookEncore() {
		BookDTO[] b1 = {new BookDTO("Java", "¹ÚÀºÁ¾", "Encore", 20180806, "1234-5678"),
						new BookDTO("Mysql", "¿ìÀç³²", "Encore", 20160610, "2345-6789")};
		
		return b1;
	}

	public static BookDTO[] getBookPlaydata() {
		BookDTO[] b2 = {new BookDTO("Spring", "±èÁ¾¿ø", "Playdata", 19950309, "7654-3210"),
						new BookDTO("Python", "È«µµÈñ", "Playdata", 19990728, "9876-5432")};

		return b2;
	}
}
