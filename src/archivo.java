 public class archivo {
	private String nomArchivo;
	private String contenido;
	private String nomUsuario;
	private String fechaCrea;
	private String formato;
	private String tamaño;
	private int ordenDePrioridad; //Atributo que nos ayudara a mantener en orden la cola  
	//Orden de prioridad: 1-Si el archvio es urgente ,2-Si el archivo es importante pero no tan urgente ,3- Programado para una fecha en especifica

	
	public archivo(String nomArchivo, String contenido, String nomUsuario, String fechaCrea, String formato, String tamaño, int ordenDePrioridad) {
		this.nomArchivo = nomArchivo;
		this.contenido = contenido;
		this.nomUsuario = nomUsuario;
		this.fechaCrea = fechaCrea;
		this.formato = formato;
		this.tamaño = tamaño;

	}
	
	// TODO Auto-generated constructor stub

	public String getNomArchivo() {
	return nomArchivo;
	}
	public void setNomArchivo(String nomArchivo) {
	this.nomArchivo = nomArchivo;
	}
	public String getContenido() {
	return contenido;
	}
	public void setContenido(String contenido) {
	this.contenido = contenido;
	}
	public String getNomUsuario() {
	return nomUsuario;
	}
	public void setNomUsuario(String nomUsuario) {
	this.nomUsuario = nomUsuario;
	}
	public String getFechaCrea() {
	return fechaCrea;
	}
	public void setFechaCrea(String fechaCrea) {
	this.fechaCrea = fechaCrea;
	}
	public String getFormato() {
	return formato;
	}
	public void setFormato(String formato) {
	this.formato = formato;
	}
	public String getTamaño() {
	return tamaño;
	}
	public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
	}
	public int getOrdenPrioridad() {
		return ordenDePrioridad;
    }
	public void  setOrdenPrioridad(int ordenPrioridad) {
	this.ordenDePrioridad=ordenPrioridad;
	}

	public int getOrdenDePrioridad() {
				return ordenDePrioridad;
    }
	public void  setOrdenDePrioridad(int ordenPrioridad) {
				this.ordenDePrioridad=ordenPrioridad;

	
	 }

}
