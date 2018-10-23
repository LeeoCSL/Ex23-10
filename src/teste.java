
public class teste {

	public static void main(String[] args) {
		
		Carro carroAlpha = new Carro("alfa");
		Carro carroBeta = new Carro("beta");
		Carro carroGama = new Carro("Gama");
		
		System.out.println("");
		
		System.out.println("pontos da equipe Alpha: " + carroAlpha.getPontos());
		System.out.println("pontos da equipe Beta: " + carroBeta.getPontos());
		
		carroAlpha.setPontos(300);
		carroBeta.setPontos(80);
		
		System.out.println("");
		
		System.out.println("pontos da equipe Alpha: " + carroAlpha.getPontos());
		System.out.println("pontos da equipe Beta: " + carroBeta.getPontos());
		
		System.out.println("");

		
		carroAlpha.setPontos(800);
		carroBeta.setPontos(-100);
		
		System.out.println("");
		
		System.out.println("pontos da equipe Alpha: " + carroAlpha.getPontos());
		System.out.println("pontos da equipe Beta: " + carroBeta.getPontos());
	}
}
