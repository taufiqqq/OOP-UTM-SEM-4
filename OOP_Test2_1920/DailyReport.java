import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DailyReport {
	public static void main(String[] args) throws FileNotFoundException {
		//penting untuk file input
		File inputFile = new File("InputSB.txt");
		Scanner s = new Scanner(inputFile);

		ArrayList<Person> pList = new ArrayList<>();

		while (s.hasNextLine()) { //cek nextline punya data
			String gender = s.next(); //nak input variable dari column ke column dalam file
			int age = s.nextInt(); //
			String c = s.next();
			CaseList tempCase = CaseList.valueOf(c);
			Person tempPerson = new Person(gender, age, tempCase.getBackground(), tempCase.getStatus());
			pList.add(tempPerson);
		}


		System.out.println("Covid 19 Cases and Action Required");
		//print every scenario of enum
		for (CaseList c : CaseList.values()) { //values tu all scenario dalam enum la , 1-5
			System.out.println(c.name() + ": " + c.getBackground() + "     " + c.status);
		}

		int totalQuarantine = 0;
		int totalICU = 0;
		int totalWarded = 0;
		int totalRecovered = 0;

		System.out.println("               COVID 19 DAILY REPORT");
		System.out.println("Case     Gender  Age      Background          Status");
		for (int i = 0; i < pList.size(); i++) {
			System.out.printf("%-10d%-8s%-8d%-18s%s\n", (i + 1), pList.get(i).getGender(), pList.get(i).getAge(),
					pList.get(i).getBackground(), pList.get(i).getStatus());
			//printf ni untuk format, boleh cek kat https://www.baeldung.com/java-printstream-printf
			if(pList.get(i).getStatus().equals("QUARANTINE")) totalQuarantine++; //guna equals kalau nak compare string
			if(pList.get(i).getStatus().equals("ICU")) totalICU++;
			if(pList.get(i).getStatus().equals("WARDED")) totalWarded++;
			if(pList.get(i).getStatus().equals("DISCHARGED")) totalRecovered++;
		}
		System.out.println("Total in quarantine = " + totalQuarantine);
		System.out.println("Total in ICU = " + totalICU);
		System.out.println("Total in Warded = " + totalWarded);
		System.out.println("Total Recovered = " + totalRecovered);
		System.out.println("Total Cases = " + pList.size());

		s.close();
	}
}