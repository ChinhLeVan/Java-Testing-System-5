package Exercise1;
import java.util.ArrayList;
import java.util.Scanner;
import Exercise1.Candidates.Priority;

public class Admissions implements IAdmissions{
	private Scanner scanner = new Scanner(System.in);
	ArrayList<Candidates> listCandidates = new ArrayList<>();
	@Override
	public void addNewCandidate() {
		System.out.println("Add new candidates: \n" +"Add code...");
		String candidateNumber = scanner.nextLine();
		System.out.println("Add name...");
		String name = scanner.nextLine();
		System.out.println("Add adress...");
		String adress = scanner.nextLine();
		System.out.println("Add priority... \n" +"1: ONE \n"+"2: TWO \n"+"3: ONE \n");
		int flagPriority = Integer.parseInt(scanner.nextLine());
		Priority priority = null;
		switch (flagPriority) {
		case 1: {
			priority = Priority.ONE;
			break;
		}
		case 2: {
			priority = Priority.TWO;
			break;
		}
		case 3: {
			priority = Priority.THREE;
			break;
		}
		default:
			System.out.println("Chon sai level....");
			break;
		}
		System.out.println("Chon khoi thi cua thi sinh... \n"+"1: Khoi A \n"+"2: Khoi B \n"+"3: Khoi C \n");
		int flagExam = Integer.parseInt(scanner.nextLine());
		switch (flagExam) {
		case 1: {
			CandidateA candidateA = new CandidateA(candidateNumber, name, adress, priority);
			listCandidates.add(candidateA);
			break;
		}
		case 2: {
			CandidateA candidateB = new CandidateA(candidateNumber, name, adress, priority);
			listCandidates.add(candidateB);
			break;
		}
		case 3: {
			CandidateA candidateC = new CandidateA(candidateNumber, name, adress, priority);
			listCandidates.add(candidateC);
			break;
		}
		default:
			System.out.println("Chon sai level....");
			break;
		}
	}

	@Override
	public void showInfo() {
		System.out.println("Show info....");
		for (int i = 0; i < listCandidates.size(); i++) {
			System.out.println(listCandidates.get(i).toString());
		}
	}

	@Override
	public void searchWithCode() {
		System.out.println("Search with code... \n" + "nhap so bao danh cua thi sinh can tim...");
		String codeSearch = scanner.nextLine();
		boolean isHas = false;
		for (int i = 0; i < listCandidates.size(); i++) {
			if(listCandidates.get(i).getCandidateNumber().equals(codeSearch)) {
				System.out.println(listCandidates.get(i).toString());
				isHas = true;
			}
		}if (!isHas) {
			System.out.println("Khong tim thay so bao danh thi sinh....");
		}
	}
}
