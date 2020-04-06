package biblioteka;

import java.util.Scanner;

public class Biblioteka {

	private Book[] books;
	private int size;
	private static int index = 0;

	public Biblioteka() {

		Scanner input = new Scanner(System.in);

		System.out.println("Podaj rozmiar tablicy: ");
		size = input.nextInt();

		books = new Book[size];

		input.close();
	}

	public int addBook(Book book) {

		for (Book b : books) {
			if (b != null)
				if (b.equals(book)) {
					b.setAmount();
					return 0;
				}
		}

		books[index] = new Book(book.getIsbn(), book.getTittle(), book.getAuthorName(), book.getAuthorSurname(),
				book.getYear(), book.getPublishing(), book.getAmount());
		index++;

		return 0;
	}

	public int deleteBookById(String id) {

		int i = -1;

		for (Book b : books) {
			i++;
			if (b != null) {
				if (b.getIsbn().equals(id)) {
					books[i] = null;
					System.out.println("---------------Usunieto.---------------");
					return 1;
				}
			}
		}

		System.out.println("---------------Nie znaleziono.---------------");
		return 0;
	}

	public int deleteBookByTittle(String tittle) {

		int i = -1;

		for (Book b : books) {
			i++;
			if (b != null) {
				if (b.getTittle().equals(tittle)) {
					books[i] = null;
					System.out.println("---------------Usunieto.---------------");
					return 1;
				}
			}
		}

		System.out.println("---------------Nie znaleziono.---------------");
		return 0;
	}

	public int findByAuthorName(String name) {

		for (Book b : books) {
			if (b != null) {
				if (b.getAuthorName().equals(name)) {
					System.out.println("Finded by author name");
					System.out.println(b.getIsbn());
					System.out.println(b.getTittle());
					System.out.println(b.getAuthorName());
					System.out.println(b.getAuthorSurname());
					System.out.println(b.getYear());
					System.out.println(b.getPublishing());
					System.out.println(b.getAmount());
					System.out.println("********************************************");
					return 1;
				}
			}
		}

		System.out.println("---------------Nie znaleziono.---------------");
		return 0;
	}

	public int findByAuthorSurName(String surname) {

		for (Book b : books) {
			if (b != null) {
				if (b.getAuthorSurname().equals(surname)) {
					System.out.println("Finded by author surname");
					System.out.println(b.getIsbn());
					System.out.println(b.getTittle());
					System.out.println(b.getAuthorName());
					System.out.println(b.getAuthorSurname());
					System.out.println(b.getYear());
					System.out.println(b.getPublishing());
					System.out.println(b.getAmount());
					System.out.println("********************************************");
					return 1;
				}
			}
		}

		System.out.println("---------------Nie znaleziono.---------------");
		return 0;
	}

	public int findByTittle(String tittle) {

		for (Book b : books) {
			if (b != null) {
				if (b.getTittle().equals(tittle)) {
					System.out.println("Finded by tittle");
					System.out.println(b.getIsbn());
					System.out.println(b.getTittle());
					System.out.println(b.getAuthorName());
					System.out.println(b.getAuthorSurname());
					System.out.println(b.getYear());
					System.out.println(b.getPublishing());
					System.out.println(b.getAmount());
					System.out.println("********************************************");
					return 1;
				}
			}
		}

		System.out.println("---------------Nie znaleziono.---------------");
		return 0;
	}

	public int findById(String id) {

		for (Book b : books) {
			if (b != null) {
				if (b.getIsbn().equals(id)) {
					System.out.println("Finded by id");
					System.out.println(b.getIsbn());
					System.out.println(b.getTittle());
					System.out.println(b.getAuthorName());
					System.out.println(b.getAuthorSurname());
					System.out.println(b.getYear());
					System.out.println(b.getPublishing());
					System.out.println(b.getAmount());
					System.out.println("********************************************");
					return 1;
				}
			}
		}

		System.out.println("---------------Nie znaleziono.---------------");
		return 0;
	}

	public void show() {
		for (Book book : books) {
			if (book != null) {
				System.out.println(book.getIsbn());
				System.out.println(book.getTittle());
				System.out.println(book.getAuthorName());
				System.out.println(book.getAuthorSurname());
				System.out.println(book.getYear());
				System.out.println(book.getPublishing());
				System.out.println(book.getAmount());
				System.out.println("********************************************");
			}

		}
	}

}
