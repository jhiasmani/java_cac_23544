package ar.com.codoacodo.repository;

//pertenece java collection framework :spring
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public interface OradorRepository {
	public void save(Orador orador);
	public Orador getByID(Long id);
	public void  update(Orador orador);
	public void delete(Long id);
	public List<Orador> findAll();
	
	

}
