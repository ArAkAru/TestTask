package com.arakaru;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class NumFreq {
	
	public static void main(String args[]) {
		List<Integer> mas=new ArrayList<>();
		int i=0;
		int count= 0;
		int N=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("�������������������� ����� N: ");
			N = scan.nextInt();
		}
		while(N<0);
		
		while(true){
			if(count==N)
				break;
			if(i%String.valueOf(i).length()==0){
				mas.add(i);
				count++;
			}
			i++;
		}
		System.out.println("������� ����� " + mas);
		System.out.println("������ " + mas.size());
		}
	}

