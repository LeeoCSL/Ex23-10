
public class Carro {

	String equipe;
	int pontos;
	
	
	
	public Carro(String equipe) {
		this.pontos = 500;
		if(equipe.equalsIgnoreCase("alfa") || equipe.equalsIgnoreCase("beta")) {
		this.equipe = equipe.substring(0,1).toUpperCase() + equipe.substring(1).toLowerCase();
		carroCriado();
		}else {
			System.out.println("Equipe desconhecida");
			
		}
		
	}
	
	private void verificaCondicao() {
		if(pontos <100) {
			System.out.println("Carro da equipe " + equipe + " deve se dirigir ao box");
		}else if(pontos >= 100 && pontos <=500) {
			System.out.println("Carro da equipe " + equipe + " funcionando corretamente");
		}
	}
	
	private void carroCriado() {
		System.out.println("Carro da equipe '" + equipe + "' criado");
		
	}
	
	public void alteraPontos(int pontos) {
		this.pontos = pontos;
	}
	

	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		if(pontos < 0) {
			pontos = 0;
		} else if(pontos > 500) {
			pontos = 500;
		}
		this.pontos = pontos;
		verificaCondicao();
	}
	public String getEquipe() {
		return equipe;
	}
	
}
