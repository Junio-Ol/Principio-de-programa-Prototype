
public abstract  class Mouse {

	protected double valor;
	protected String tipo;
	protected String cor;
	
	public abstract Mouse  clonar();
	public abstract String informaçao();
	
	public double getvalor() {
		return this.valor;
		
	};
	public String setcor(String cor) {
		return this.cor=cor;
		
	};
	public String settipo(String tipo) {
		return this.tipo=tipo;
		
	};
	public void setValorCompra(double valorCompra){
		this.valor = valorCompra;
	
	}
		
	
	
	
	
	
	
	
	
	
}
