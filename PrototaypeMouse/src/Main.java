
public class Main {

	public static void main(String[] args) {
		Mousepositivo prototaype = new Mousepositivo();
		MouseMultilaiser prototaype2 = new MouseMultilaiser();
		
		Mouse clone = prototaype.clonar();
		prototaype.setValorCompra(20);
		prototaype.setcor("azul");
		prototaype.settipo("normal");
        System.out.println(prototaype.informaçao());
        
       Mouse clone2 = prototaype2.clonar();
	   prototaype2.setValorCompra(200);
	   prototaype2.setcor("azul");
	   prototaype2.settipo("normal");
       System.out.println(prototaype2.informaçao());
	}

}
