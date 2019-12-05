package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends ComputadoraBuilder{
	
	@Override
	public void DefinirComputador() {
		c = new Computador();
		c.setMarca("Asus");
		c.setModelo("Zenbook");
		
	}
	

	@Override
	public void InsertarRam() {
		c.setRam(16);
		c.setTipoRam("ddr3");
		
	}

	@Override
	public void InsertarDiscoDuro() {
		c.setAlmacenamiento(500);
		c.setTipoAlmacenamiento("SSD");
		
	}

	@Override
	public void InstalarSistemaOperativo() {
		SistemaOperativo so = new SistemaOperativo("Windows 10",64,"HOME");
		c.setOs(so);
	}

	@Override
	public void InstalarMainBoard() {
		Mainboard mb = new Mainboard("Prime","Z370");
		c.setPlaca(mb);
		
	}


	@Override
	public void DefinirExtras() {
		c.setCoolerExterno(false);
		
	}
}
