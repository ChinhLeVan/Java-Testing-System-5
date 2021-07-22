package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
	public static Scanner scanner = new Scanner(System.in);
	private ArrayList<New> arrListNews = new ArrayList<>();
	
	public static void main(String[] args) {
		MyNews news = new MyNews();
		while(true) {
		System.out.println("Chon mot trong cac muc sau: \n" + "1: Insert news \n"+"2: View list News \n"
							+ "3: Average rate \n"+"4: Exit programe");
		int sc = Integer.parseInt(scanner.nextLine());
		switch (sc) {
		case 1: {
			New newObj = new New();
			System.out.println("1: Insert news");
			System.out.println("Nhap title: ");
			newObj.setTitle(scanner.nextLine());
			
			System.out.println("Nhap publishDate: ");
			newObj.setPublicDate(scanner.nextLine());
			
			System.out.println("Nhap Author: ");
			newObj.setAuthor(scanner.nextLine());
			
			System.out.println("Nhap Content: ");
			newObj.setContent(scanner.nextLine());
			
			System.out.println("nhap vao 3 danh gia");
			int[] rates = {0,0,0};
			newObj.setRates(rates);
			for (int i = 0; i < 3; i++) {
				System.out.println("nhap vao danh gia thu "+(i+1));
				newObj.rates[i]= Integer.parseInt(scanner.nextLine());
			}
			news.arrListNews.add(newObj);
			break;
		}
		case 2: {
			System.out.println("2: View list News");
			for (int i = 0; i < news.arrListNews.size(); i++) {
				news.arrListNews.get(i).Display();
			}
			break;
		}
		case 3: {
			System.out.println("3: Average rate");
			for (int i = 0; i < news.arrListNews.size(); i++) {
				news.arrListNews.get(i).Calculate();
			}
			break;
		}
		case 4: {
			System.out.println("4: Exit programe");
			System.exit(1);
			break;
		}
		default:
			System.out.println("Ban chon sai chuc nang....");
			break;
		}
	}}
}
