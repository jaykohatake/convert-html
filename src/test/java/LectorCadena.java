import org.junit.Assert;
import org.junit.Test;

public class LectorCadena {
	
	@Test
	public void siNoEstaVacia() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		

		//Assert - Verificación
		Assert.assertTrue(cadena.verificar("Hola"));
		
	
	}
	
	@Test
	public void siEsVacia() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		

		//Assert - Verificación
		Assert.assertFalse(cadena.verificar(""));
		
	
	}
	
	@Test
	public void comienzaPorNumeral() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		

		//Assert - Verificación
		Assert.assertTrue(cadena.encontrarNumeral("#Tech and Solve"));
		
	
	}
	
	@Test
	public void noComienzaPorNumeral() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		

		//Assert - Verificación
		Assert.assertFalse(cadena.encontrarNumeral("Tech and Solve"));
		
	
	}
	
	@Test
	public void siTieneEspacio() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		

		//Assert - Verificación
		Assert.assertTrue(cadena.encontrarEspacio("Tech and Solve"));
		
	
	}
	
	@Test
	public void siNoTieneEspacio() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		

		//Assert - Verificación
		Assert.assertFalse(cadena.encontrarEspacio("TechandSolve"));
		
	
	}
	
	@Test
	public void siSubstringTieneMasDe6() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		
		String string = "Techasssss Solve";
		String substring = string.substring(0, string.indexOf(" "));

		//Assert - Verificación
		Assert.assertTrue(6 < substring.length());
		
	
	}
	
	@Test
	public void siSubstringTieneMenosDe7() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		String string = "Techand Solve";
		String substring = string.substring(0, string.indexOf(" "));

		//Assert - Verificación
		Assert.assertTrue(7 >= substring.length());
		
	
	}
	
	@Test
	public void TodosSonNumeralEnElSubstring() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		String string = "####";

		//Assert - Verificación
		Assert.assertTrue(cadena.IsTodoNumeral(string));
		
	
	}
	
	@Test
	public void NotodosSonNumeralEnElSubstring() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		String string = "#p##";

		//Assert - Verificación
		Assert.assertFalse(cadena.IsTodoNumeral(string));
		
	
	}
	
	@Test
	public void verificarTest1() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		String string = "# Hola";
		String substring = string.substring(0, string.indexOf(" "));

		//Assert - Verificación
		Assert.assertFalse("<H1>Hola</H1>" == cadena.imprimirConEtiqueta(string, substring.length()));
		
	
	}
	
	@Test
	public void verificarTest2() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		String string = "## Hackaton";
		String substring = string.substring(0, string.indexOf(" "));

		//Assert - Verificación
		Assert.assertFalse("<H2>Hackaton</H2>" == cadena.imprimirConEtiqueta(string, substring.length()));
		
	
	}
	
	@Test
	public void verificarTest3() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		String string = "#Tech And Solve";
		String substring = string.substring(0, string.indexOf(" "));

		//Assert - Verificación
		Assert.assertFalse("#Tech And Solve" == cadena.imprimirConEtiqueta(string, substring.length()));
		
	
	}
	
	@Test
	public void verificarTest4() {
		//Arrange - Condiciones iniciales para la prueba
		Cadena cadena = new Cadena();
		String string = "####### Mal";
		String substring = string.substring(0, string.indexOf(" "));

		//Assert - Verificación
		Assert.assertFalse("####### Mal" == cadena.imprimirConEtiqueta(string, substring.length()));
		
	
	}
}
