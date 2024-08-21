package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		Set<Students> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int nA = sc.nextInt();
		for(int i = 0; i < nA; i++) {
			System.out.print("Student #" + (i+1) + " id: " );
			int code = sc.nextInt();
			set.add(new Students(code));
		}
		System.out.println("");
		
		System.out.print("How many students for course B? ");
		int nB = sc.nextInt();
		for(int i = 0; i < nB; i++) {
			System.out.print("Student #" + (i+1) + " id: " );
			int code = sc.nextInt();
			set.add(new Students(code));
		}
		System.out.println("");
		
		System.out.print("How many students for course C? ");
		int nC = sc.nextInt();
		for(int i = 0; i < nC; i++) {
			System.out.print("Student #" + (i+1) + " id: " );
			int code = sc.nextInt();
			set.add(new Students(code));
		}
		System.out.println("");

		System.out.println("Total students: " + set.size());

		sc.close();
	}

}
