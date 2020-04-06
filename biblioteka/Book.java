package biblioteka;

public class Book {

	final private String isbn;
	final private String tittle;
	final private String authorName;
	final private String authorSurname;
	private int year;
	final private String publishing;
	private int amount;

	public Book(String isbn, String tittle, String authorName, String authorSurname, int year, String publishing,
			int amount) {

		this.isbn = isbn;
		this.tittle = tittle;
		this.authorName = authorName;
		this.authorSurname = authorSurname;
		this.year = year;
		this.publishing = publishing;
		this.amount = amount;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTittle() {
		return tittle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public int getYear() {
		return year;
	}

	public String getPublishing() {
		return publishing;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount() {
		amount += 1;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Book book = (Book) o;
		return isbn.equals(book.isbn) && tittle.equals(book.tittle) && authorName.equals(book.authorName)
				&& authorSurname.equals(book.authorSurname) && year == book.year && publishing.equals(book.publishing)
				&& amount == book.amount;
	}

}
