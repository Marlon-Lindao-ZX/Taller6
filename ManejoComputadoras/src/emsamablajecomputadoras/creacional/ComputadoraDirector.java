package emsamablajecomputadoras.creacional;

public class ComputadoraDirector {
	
	private ComputadoraBuilder builder;
	
	public ComputadoraDirector(ComputadoraBuilder builder) {
		this.builder = builder;
	}
	
	public void construirComputadora() {
		builder.DefinirComputador();
		builder.InsertarRam();
		builder.InsertarDiscoDuro();
		builder.InstalarSistemaOperativo();
		builder.InstalarMainBoard();
		builder.DefinirExtras();
		
	}
	
	public Computador getComputadora() {
		return builder.getComputador();
	}
}
