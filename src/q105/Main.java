package q105;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%15s%15s%15s\n", "Seoul","10,312,545","+91,375");
		System.out.printf("%15s%15s%15s\n", "Pusan","3,567,910","+5,868");
		System.out.printf("%15s%15s%15s\n", "Incheon","2,758,296","+64,888");
		System.out.printf("%15s%15s%15s\n", "Daegu","2,511,676","+17,230");
		System.out.printf("%15s%15s%15s\n", "Gwangju","1,454,636","+29,774");
		
		// ver2 2차원 배열		
		String[][] ar = {
				{ "Seoul", "10,312,545", " +91,375" },
				{ "Pusan", "3,567,910", "+5,868" },
				{ "Incheon", "2,758,296", "+64,888" },
				{ "Daegu", "2,511,676", "+17,230" },
				{ "Gwangju", "1,454,636", "+29,774" }
			};

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%15s", ar[i][j]);
			}
			System.out.println();
		
		// ver3  
			  DecimalFormat a = new DecimalFormat("###,###");
		      String str = a.format(1454636);
		      String str1 = a.format(2511676);
		      String str2 = a.format(2758296);
		      String str3 = a.format(3567910);
		      String str4 = a.format(10312545);
		      
		      System.out.printf("%15s%15s%15s\n","Seoul",str4,"+91,375");
		      System.out.printf("%15s%15s%15s\n","Pusan",str3,"+5,868");
		      System.out.printf("%15s%15s%15s\n","Incheon",str2,"+64,888");
		      System.out.printf("%15s%15s%15s\n","Daegu",str1,"+17,230");
		      System.out.printf("%15s%15s%15s","Gwangju",str,"+29,774");

			
		}
	}
}
