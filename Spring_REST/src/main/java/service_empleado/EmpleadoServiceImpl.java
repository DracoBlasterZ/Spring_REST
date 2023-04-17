package service_empleado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmpleadoDAO;
import dto.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	//Utilizamos los metodos de la interface IEmpleadoDAO, es como si instaciaramos.
	@Autowired
	EmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado Empleado) {
		
		return iEmpleadoDAO.save(Empleado);
	}

	@Override
	public Empleado EmpleadoXID(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}
	

	@Override
	public Empleado actualizarEmpleado(Empleado Empleado) {
		
		return iEmpleadoDAO.save(Empleado);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}


	@Override
	public List<Empleado> listarEmpleadoNomnbre(String nombre) {
		
		return iEmpleadoDAO.findByNombre(nombre);
	}

}

