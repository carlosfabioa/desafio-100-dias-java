package desafio100Dias;

import java.util.Scanner;

public class dia005 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Entradas
		System.out.println("Entre com o valor da hora: ");
		double valor_hora = entrada.nextDouble();
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		int horas_trabalhadas = entrada.nextInt();
		
		//Processamento
		double salario_bruto = valor_hora * horas_trabalhadas;
		double imposto_renda = calcular_IR(salario_bruto);
		double inss = calcular_INSS(salario_bruto);
		double sindicato = calcular_sindicato(salario_bruto);
		double fgts = calcular_fgts(salario_bruto);
		
		double total_descontos = imposto_renda + inss + sindicato;
		double salario_liquido = salario_bruto - total_descontos;
		
		//Saída
		System.out.printf(
		  "Salário bruto: (%.2f X %d)..................R$ %.2f \n (-) Imposto de Renda:......................R$ %.2f \n (-) INSS..................................R$ %.2f \n FGTS......................................R$ %.2f \n Total de descontos........................R$ %.2f \n Salário líquido...........................R$ %.2f",
			valor_hora, horas_trabalhadas, salario_bruto,imposto_renda, inss, fgts, total_descontos,
				salario_liquido
				);
	}
	
	
	//método para calculo do imposto de renda
	public static double calcular_IR(double salario) {
		//Constantes - Boa prática sempre declarar com letras maiúsculas
		//http://www.bosontreinamentos.com.br/java/como-declarar-e-usar-constantes-em-java/
		//Imposto de renda
		final double IR_FAIXA1 = 0;
		final double IR_FAIXA2 = 0.075; // 7,5 divido por 100
		final double IR_FAIXA3 = 0.15;
		final double IR_FAIXA4 = 0.225;
		final double IR_FAIXA5 = 0.275;
		
		double imposto_renda = 0;
				
		if(salario < 1903.98) {
			return imposto_renda;
		}else if(salario > 1903.98 && salario < 2826.65) {
			imposto_renda = salario * IR_FAIXA2;
		}else if(salario > 2826.65 && salario < 3751.05) {
			imposto_renda = salario * IR_FAIXA3;
		}else if(salario > 3751.05 && salario < 4664.68) {
			imposto_renda = salario * IR_FAIXA4;
		}else{
			imposto_renda = salario * IR_FAIXA5;
		}
		
		return imposto_renda;
	}
	
	//método para cálculo do INSS
	public static double calcular_INSS(double salario) {
		//INSS - constantes
		final double INSS_FAIXA1 = 0.075;
		final double INSS_FAIXA2 = 0.09;
		final double INSS_FAIXA3 = 0.12;
		final double INSS_FAIXA4 = 0.14;
		
		double inss = 0;
		
		if(salario < 1212) {
			inss = salario * INSS_FAIXA1;
		}else if(salario > 1212 && salario < 2427.35){
			inss = salario * INSS_FAIXA2;
		}else if(salario > 2427.35 && salario < 3641.03) {
			inss = salario * INSS_FAIXA3;
		}else if(salario > 3641.03 && salario < 7087.22) {
			inss = salario * INSS_FAIXA4;
		}
		
		return inss;
	}
	
	//método para calculo sindicato
	public static double calcular_sindicato(double salario) {
		//Sindicato
		final double DESC_SINDICATO = 0.03;
		double sindicato = salario * DESC_SINDICATO;
		return sindicato;
	}
	
	//método para calculo FGTS
	public static double calcular_fgts(double salario) {
		//FGTS
		final double FGTS = 0.08;
		double fgts = salario * FGTS;
		return fgts;
	}
}
