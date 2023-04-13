package dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="empleado")//en caso que la tabla sea diferente


public class Empleado {
	public enum Trabajo {
	    programador(2500),
	    diseno(2300),
	    jardinero(2000);
			
			private int salario;
			Trabajo(int salary){
				this.salario=salary;
			}
			public int getSalary()
			{
				return salario;
			}
				
		}
	
	@Id
	@Column(name = "id")//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private String trabajo;
	@Column(name = "salario")//no hace falta si se llama igual
	private int salario;
	
	//Constructores
	public Empleado() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param dni
	 * @param fecha
	 */
	public Empleado(int id, String nameEmp, String work, int  salary) {
		//super();
		this.id = id;
		this.nombre = nameEmp;
		this.trabajo = work;
		this.salario = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	

}
 
