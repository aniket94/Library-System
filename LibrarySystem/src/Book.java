
public class Book {
 
private String ISBN;
private String title;
private String author;
private int edition;
private String categories;

public Book(String iSBN, String title, String author, int edition, String categories) {
	
	
	ISBN = iSBN;
	this.title = title;
	this.author = author;
	this.edition = edition;
	this.categories = categories; 
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getEdition() {
	return edition;
	
	
}

public void setEdition(int edition) {
	this.edition = edition;
}

public String getCategories() {
	return categories;
}

public void setCategories(String categories) {
	this.categories = categories;
}
//create a display method

public void displayInfo()
{
	System.out.println("ISBN: "+ISBN);
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("Edition: "+edition);
	System.out.println("Categories:"+categories);
	
}
 
}
