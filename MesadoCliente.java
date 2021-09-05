package Tapiocaria;

public  abstract class MesadoCliente {
	
	private Integer mesa;
	private Double total;
	
	public MesadoCliente() {
		super();
	}
	
	public MesadoCliente(Integer mesa, Double total) {
		super();
		this.mesa = mesa;
		this.total = total;		
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	public abstract void totalvalormesa();

}
