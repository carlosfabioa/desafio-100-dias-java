package desafio100Dias;

import java.time.LocalDate;

public class dia011 {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now(); //pegando a data atual 
		//https://www.w3schools.com/java/java_date.asp 
		//https://www.w3schools.com/jsref/jsref_obj_date.asp

		System.out.println("A data atual: " + hoje);
		System.out.println("10 dias antes de hoje: " + hoje.plusDays(-10));
		System.out.println("10 dias depois de hoje: " + hoje.plusDays(10));
		//https://www.w3schools.blog/java-8-localdatetime-class
		//https://www.tutorialspoint.com/period-plusdays-method-in-java
	}

}
