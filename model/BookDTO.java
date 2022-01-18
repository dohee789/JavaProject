package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDTO {
	private String name;
	private String author;
	private String publisher;
	private int date;
	private String ISBN;
	
	// Encor & Playdata 책인 경우에만 
	public void setPublisher(String publisher) {
		if(publisher == "Encore" || publisher == "Playdata") {
			this.publisher = publisher;
		} else {
			System.out.println("해당 출판사의 책이 아닙니다.");
		}
	}
}
