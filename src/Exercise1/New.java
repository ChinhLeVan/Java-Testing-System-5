package Exercise1;

public class New implements INews{
	private int id;
	private String title;
	private String publicDate;
	private String author;
	private String content;
	private float averageRate;
	public int[] rates;
	
	public int[] getRates() {
		return rates;
	}
	public void setRates(int[] rates) {
		this.rates = rates;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublicDate() {
		return publicDate;
	}
	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getaverageRate() {
		return averageRate;
	}
	@Override
	public void Display() {
		System.out.println("Title: "+ this.title+ "; PublicDate: "+this.publicDate+"; Author: "+this.author+
							"; Content: "+this.content+"; AverageRate: "+this.averageRate);
		
	}
	@Override
	public float Calculate() {
		int sum = 0;
		for (int i = 0; i < this.rates.length; i++) {
			sum += this.rates[i];
		}
		this.averageRate = (float) sum/(this.rates.length);
		return this.averageRate;
	}
	
}
