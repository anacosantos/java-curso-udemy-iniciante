import java.util.Locale;
// este serve para importar ja da biblioteca do JDK, como visto foi usado para trocar vírgula por ponto.


public class Main {

	public static void main(String[] args) {
	
		System.out.println("Olá Marcus, amor da minha vida");
		// "%.2f", qd vc quer declarar duas casas decimais;  %.4f 4 casas decimais TODOS COM SYSOUTPRINTF
		// /n ou %n é uma quebra de linha
		
		double x = 10.35784;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		
		

	}

}
