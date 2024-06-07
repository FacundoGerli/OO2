package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	private Boolean isLog;
	private DatabaseAccess database;
	
	public DatabaseProxy(DatabaseAccess database) {
		this.database = database;
		this.isLog = false;
	}
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!isLog) {
			throw new RuntimeException("Acceso denegado");
		}
		else return database.getSearchResults(queryString);
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(!isLog) {
			throw new RuntimeException("Acceso denegado");
		}
		else return database.insertNewRow(rowData);
	}
	public void logIn() {
		this.isLog = true;
	}
	public void logOut() {
		this.isLog = false;
	}

}
