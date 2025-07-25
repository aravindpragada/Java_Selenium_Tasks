package com.java.task;

public class Task11Strings2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Aravind");
		sb.append("Pragada");
		System.out.println(sb);
		sb.insert(7,"h");
		System.out.println(sb);
		sb.delete(7,8);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);	
	}
}
