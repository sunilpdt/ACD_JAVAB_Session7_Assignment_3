package com.acadgild;

public class StrBufferCpcty {

	public static void main(String[] args) {
		
		StringBuffer strbuffer=new StringBuffer("Hello Sunil.");
		System.out.println("String buffer capacity::"+strbuffer.capacity());
		
		strbuffer.append("Have a nice day.How are you.Its been long time");
		System.out.println("String buffer capacity after append::"+strbuffer.capacity());

	}

}
