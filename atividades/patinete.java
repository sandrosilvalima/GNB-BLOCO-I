package atividades;
public class patinete {

	public static void main(String[] args) {
	}

	private String modelo;
	private String potencia;
	private String colora��o;
	private String peso;

	public patinete(String mod, String power, String cor, String KG) {
		modelo = mod;
		potencia = power;
		colora��o = cor;
		peso = KG;
	}

	public String getTransporte() {
		String transporte = modelo + potencia + colora��o + peso;
		return transporte;
	}
}
