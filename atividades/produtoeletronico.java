package atividades;
public class produtoeletronico {
	

	public static void main(String[] args) {
	}
		 private String fabricante;
		 private String modelo;
		 private String armazenamento;
		 private String memoriaRAM;
		 private String processador;
		 private String bateria;
		 private String camera;					
					
		public produtoeletronico (String fabr, String mod, String armaz,String ram, String process, String bat, String cam)
		{
			fabricante = fabr;
			modelo = mod;
			armazenamento = armaz;
			memoriaRAM = ram;
			processador = process;
			bateria = bat;
			camera = cam;
		}
		
		public String getSmartphone()
		{
			String smartphone = fabricante + modelo + armazenamento + memoriaRAM +  processador + bateria + camera;
		return smartphone;
		}
}
		
		