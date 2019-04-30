package com.dom;
import java.util.*;

public class White {

public static void main(String[] args) {
		Map<Integer, Float> map = new HashMap<>();
		try {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Math Grade:");
		 float a= scanner.nextInt();
		
		if(a/100>1)
				throw new IndexOutOfBoundsException("TOO BIG");
		if(a/100<0)
				throw new IndexOutOfBoundsException("TOO SMALL");
		
		map.put(0, a);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("成績應為0~100");
			return;
		}
		catch(Exception e) {
			System.out.println("格式錯誤");
			return;
		}
		try {
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Chinese Grade:");
			 float b= scanner.nextInt();
			if(b/100>1)
					throw new IndexOutOfBoundsException("TOO BIG");
			if(b/100<0)
					throw new IndexOutOfBoundsException("TOO SMALL");
			map.put(1, b);
			float c = (map.get(0)+ map.get(1))/2 ;
			System.out.println(c);
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("成績應為0~100");
				return;
			}
			catch(Exception e) {
				System.out.println("格式錯誤");
				
			}
		
	}
}