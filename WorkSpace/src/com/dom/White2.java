package com.dom;

import java.util.*;

public class White2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Please enter English");
			Score english = new Score(scanner.nextLine());
			System.out.print("Please enter Math");
			Score math = new Score(scanner.nextLine());
			System.out.print((english.value+math.value)/2);
		    }catch( ScoreFormatException e){
		    	e.printStackTrace();
		}
		
  }
}
