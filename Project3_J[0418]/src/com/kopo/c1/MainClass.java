package com.kopo.c1;
import java.util.Random;
import com.kopo.c2.C20;

public class MainClass {
	public static void main(String[] args) {
		C1 c = new C1();
		c.doPrint();
		
		C20 c2 = new C20();
		c2.testRun();
		
		Random r = new Random();
		
		com.kopo.c2.C1 d = new com.kopo.c2.C1();
	}
}
