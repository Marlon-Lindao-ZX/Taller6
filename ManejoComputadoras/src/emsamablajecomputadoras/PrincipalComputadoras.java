/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
		ComputadoraDirector c1 = new ComputadoraDirector(new AsusROGEBuilder());
		c1.construirComputadora();
		// AsusROGE
		Computador roge = c1.getComputadora();
		
		ComputadoraDirector c2 = new ComputadoraDirector(new AsusZenbookBuilder());
		c2.construirComputadora();
		// AsusZenbook
		Computador zenbook = c2.getComputadora();
		
		//Mostrar las caracteristicas de ambas computadoras 
		roge.toString();
		zenbook.toString();

	}

}
