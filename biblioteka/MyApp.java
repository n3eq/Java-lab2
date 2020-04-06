package biblioteka;

public class MyApp {

	public static void main(String[] args) {

		Biblioteka biblioteka = new Biblioteka();

		Book book1 = new Book("20-943-221-33", "Wiedzmin", "Andrzej", "Sapkowski", 1986, "wydawnictwo", 20);
		Book book2 = new Book("20-943-221-33", "Wiedzmin", "Andrzej", "Sapkowski", 1986, "wydawnictwo", 20);
		Book book3 = new Book("980-943-221-33", "Inna ksiazka", "Andrzej", "Sapkowski", 1986, "wydawnictwo", 20);
		Book book4 = new Book("580-243-221-33", "Jeszcze inna ksiazka", "Andrzej", "Sapkowski", 1986, "wydawnictwo",
				20);

		biblioteka.addBook(book1);
		biblioteka.addBook(book2);
		biblioteka.addBook(book3);
		biblioteka.addBook(book4);

		biblioteka.findByAuthorName("Andrzej");
		biblioteka.findByAuthorSurName("Sapkowski");
		biblioteka.findById("980-943-221-33");
		biblioteka.findByTittle("Jeszcze inna ksiazka");

		biblioteka.show();
		biblioteka.deleteBookById("980-943-221-33");
		biblioteka.deleteBookByTittle("Wiedzmin");
		biblioteka.show();

	}

}
