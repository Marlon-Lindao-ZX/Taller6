package emsamablajecomputadoras.creacional;

public class AsusROGEBuilder extends ComputadoraBuilder {

	@Override
	public void DefinirComputador() {
		c = new Computador();
		c.setMarca("Asus");
		c.setModelo("ROGE");
		
	}
	

	@Override
	public void InsertarRam() {
		c.setRam(32);
		c.setTipoRam("ddr4");
		
	}

	@Override
	public void InsertarDiscoDuro() {
		c.setAlmacenamiento(1000);
		c.setTipoAlmacenamiento("HDD");
		
	}

	@Override
	public void InstalarSistemaOperativo() {
		SistemaOperativo so = new SistemaOperativo("Windows 10",64,"PRO");
		c.setOs(so);
	}

	@Override
	public void InstalarMainBoard() {
		Mainboard mb = new Mainboard("Strix","x99");
		c.setPlaca(mb);
		
	}


	@Override
	public void DefinirExtras() {
		c.setCoolerExterno(false);
		
	}


}
