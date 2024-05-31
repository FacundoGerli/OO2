package ar.edu.info.unlp.ejercicioTopografia;

import java.util.ArrayList;

public class Mixta extends Topografia {
	private ArrayList<Topografia>composicion;
	
	public Mixta(ArrayList<Topografia>composicion) {
		this.composicion = composicion;
	}

	@Override
	public double cantidadAgua() {
		return(composicion.stream().mapToDouble(composicion -> composicion.cantidadAgua()).sum())/4;
	}
	public void agregarComposicion(Topografia topo) {
		this.composicion.add(topo);
	}

	@Override
	public Boolean esIgual(Topografia topo) {
		return topo.igualMixta(this);
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
		return ((this.composicion.get(0)).esIgual(topo.getComposicion().get(0)) && (this.composicion.get(1)).esIgual(topo.getComposicion().get(1)) &&
				(this.composicion.get(2)).esIgual(topo.getComposicion().get(2)) && (this.composicion.get(3)).esIgual(topo.getComposicion().get(3)));
	}

	public ArrayList<Topografia> getComposicion() {
		return composicion;
	}

	public void setComposicion(ArrayList<Topografia> composicion) {
		this.composicion = composicion;
	}

	@Override
	public Boolean igualPantano() {
		return false;
	}

	
}
