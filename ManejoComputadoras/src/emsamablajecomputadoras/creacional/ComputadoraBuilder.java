package emsamablajecomputadoras.creacional;

public abstract class ComputadoraBuilder {
	protected Computador c;
	
	public Computador getComputador() {
		return c;
	}
	
	public abstract void DefinirComputador();
	public abstract void InsertarRam();
	public abstract void InsertarDiscoDuro();
	public abstract void InstalarSistemaOperativo();
	public abstract void InstalarMainBoard();
	public abstract void DefinirExtras();
}
