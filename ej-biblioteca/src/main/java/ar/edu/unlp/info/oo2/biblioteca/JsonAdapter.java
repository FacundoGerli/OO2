package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonAdapter extends VoorheesExporter {
	
	private Object convertirSocio(Socio socio) {
		JSONObject objetoJson = new JSONObject();
		objetoJson.put("Nombre", socio.getNombre());
		objetoJson.put("Legajo", socio.getLegajo());
		objetoJson.put("Email", socio.getEmail());
		return objetoJson;
	}
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray arregloJson = new JSONArray();
		for(Socio socio:socios) {
			arregloJson.add(this.convertirSocio(socio));
		}
		return arregloJson.toJSONString();
	}
	
}
