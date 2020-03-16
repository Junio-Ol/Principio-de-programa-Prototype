
public class Mousepositivo extends Mouse {

	 public Mousepositivo(Mousepositivo mousePosi) {
		this.valor= mousePosi.getvalor();
	}
	
	 public Mousepositivo() {
		 valor=0;
		 cor=null;
		 tipo=null;
	 }
	
	@Override
	public Mouse clonar() {
		return new Mousepositivo(this);
		
	}

	@Override
	public String informaçao() {
	  return "Marca:Positivo"+"\nvalor:"+getvalor()+"\nCor:"+this.cor+"\nTipo: "+this.tipo;
		
	}

}
