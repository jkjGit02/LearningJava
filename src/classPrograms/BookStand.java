package classPrograms;

public class BookStand {

	public static void main(String[] args) {

		Book book1 = new Book("Prof. Jordan Peterson", "Beyond Order", 150);

		System.out.println(book1.getAuthor());

		System.out.println(book1.getName());

		System.out.println(book1.getPages());
	}

}
