package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter extends VoorheesExporter {
	
	private Object exportar(Socio socio) {
		JSONObject objetoJson = new JSONObject();
		objetoJson.put("Nombre", socio.getNombre());
		objetoJson.put("Legajo", socio.getLegajo());
		objetoJson.put("Email", socio.getEmail());
		return objetoJson;
	}
	
	@Override
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String data = mapper.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
