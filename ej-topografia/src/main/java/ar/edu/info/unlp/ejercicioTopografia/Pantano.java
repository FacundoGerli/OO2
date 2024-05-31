package ar.edu.info.unlp.ejercicioTopografia;

public class Pantano extends Topografia {

	@Override
	public double cantidadAgua() {
		return 0.7;
	}

	@Override
	public Boolean esIgual(Topografia topo) {
		return topo.igualPantano();
	}

	@Override
	public Boolean igualTierra() {
		return false;
	}

	@Override
	public Boolean igualAgua() {
		return false;
	}

	@Override
	public Boolean igualMixta(Mixta topo) {
		return false;
	}

	@Override
	public Boolean igualPantano() {
		return true;
	}

}
