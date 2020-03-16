
public class MouseMultilaiser extends Mouse {

	 public MouseMultilaiser(MouseMultilaiser mouseMulti) {
		this.valor= mouseMulti.getvalor();
	}
	
	 public MouseMultilaiser() {
		 valor=0;
		 cor=null;
		 tipo=null;
	 }
	
	
	@Override
	public Mouse clonar() {
		return new MouseMultilaiser(this);
		
	}

	@Override
	public String informaçao() {
		return "Marca:Multilaser "+"\nvalor:"+getvalor()+"\nCor:"+this.cor+"\nTipo: "+this.tipo;
		
	}

}
