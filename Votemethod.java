import java.util.*;
public class Votemethod {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[][] id = new String[6][3];	
	int[] voteid = new int[6];			
	input (id);
	vote (id,voteid);
	win(voteid,id);
	}
	
public static void input (String[][]id){
	Scanner sc = new Scanner(System.in);
	for (int p = 1; p <= 5; p++) {
		System.out.print("Minister ID: ");  
		id[p][1] = sc.nextLine();
 
		System.out.print("Minister name: ");	
		id[p][2] = sc.nextLine();
		}
	}
public static void vote (String[][]id,int[]voteid){	
	Scanner sc = new Scanner(System.in);	
	for (int j = 1; j <= 10; j++) {
		System.out.print("Vote ID: ");		
		String vote = sc.nextLine();
	for (int k = 1; k <= 5; k++) {
		if (vote.equals(id[k][1])) {		
		voteid[k]++;
		System.out.println("You Vote : " + id[k][2]);		
		}
		}
	}
	}
public static void win (int[]voteid,String [][]id){ 
	int max = voteid[1];
	int winner = 1;
	for (int l = 2; l <= 5; l++) {
		if (max < voteid[l]) {			
			max = voteid[l];
			winner = l;
		}
		}
	
  
  System.out.println("-------------------------------------------");
  System.out.println("Minister winner>>>  " + max + " Vote.   Name : " + id[winner][2]); 
 }
}