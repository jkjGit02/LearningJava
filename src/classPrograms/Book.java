package classPrograms;

public class Book {

	String author;
	String title;
	int page;

	Book() {
	}
	
	Book(String nameAuthor, String nameBook, int pageNo){
		author=nameAuthor;
		title=nameBook;
		page=pageNo;
	}

	String getAuthor() {
		return author;
	}

	String getName() {
		return title;
	}

	int getPages() {
		return page;
	}
}
