package Store;

import java.util.LinkedHashMap;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import Store.validation.MyAnnotation;

public class BookStore {
	
	
	@Size(min=1,message="required")
	private String title;
	
	@Size(min=1,message="required")
	private String author;
	private int numberPage;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 chars/digits")
	private String postalCode;
	
	@MyAnnotation() 
	private String numberBook;
	
	private String country;
	private String [] cover;
	
	private LinkedHashMap<String,String> countryOptions;
	
	public BookStore() {
		countryOptions= new LinkedHashMap<>();
		countryOptions.put("PL", "Poland");
		countryOptions.put("DE", "German");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		countryOptions.put("CZ", "Czech Repulic");
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
	public int getNumberPage() {
		return numberPage;
	}
	public void setNumberPage(int numberPage) {
		this.numberPage = numberPage;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getCover() {
		return cover;
	}

	public void setCover(String[] cover) {
		this.cover = cover;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getNumberBook() {
		return numberBook;
	}

	public void setNumberBook(String numberBook) {
		this.numberBook = numberBook;
	}




	
	
	
	
}
