package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dto.Empleado;

/**
 * @author Jose
 *
 */
public interface EmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//Listar clientes or campo nombre
	public List<Empleado> findByNombre(String nombre);
	
}