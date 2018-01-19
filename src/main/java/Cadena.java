
public class Cadena {

	public Cadena() {

		
	}

	public boolean verificar(String string) {
		// TODO Auto-generated method stub
		
		if(string.isEmpty()) {
			return false;
		}
		
		return true;
	}

	public boolean encontrarNumeral(String string) {

		if(string.indexOf("#") == 0) {
			return true;
		}
		
		return false;
	}

	public boolean encontrarEspacio(String string) {

		if(string.indexOf(" ") > 0) {
			return true;
		}
		
		return false;
	}

	public boolean IsTodoNumeral(String string) {
		
		String [] split= string.split("");
		
		for(String item : split) {
			if(!item.toString().equals("#")){
				return false;
			}
		}
		
		return true;
	}
	
	public String imprimirStringEntrada(String string)
	{
		Cadena cadena = new Cadena();
		
		String substring = string.substring(0, string.indexOf(" "));
		
		if(cadena.verificar(string) && cadena.encontrarNumeral(string) && cadena.encontrarEspacio(string) 
				&& (substring.length() < 7) && cadena.IsTodoNumeral(substring)) {
			return imprimirConEtiqueta(string, substring.length());
		}
		else {
			return string;
		}
			
	}

	public String imprimirConEtiqueta(String string, int i) {
		
		return "<H" + i + ">" + string.substring(i+1, string.length()) + "</H" + i + ">";
	}
	

}
