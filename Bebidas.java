package Tapiocaria;

public class Bebidas extends MesadoCliente {
	private Integer tipo = 1; // escala de 1 a 5 (1 == Coca cola lata, 2 == Coca cola KS, 3 == Coca cola 1 litro, 4 == Coca cola 2 litro, 5 não pediu bebida)
	
	public Bebidas(Integer tipo) {
		super();
		this.tipo = tipo;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	public void totalvalormesa() {
		if(tipo.equals(1))
			super.setTotal(super.getTotal()+ 3.00);
		else
			if(tipo.equals(2))
				super.setTotal(super.getTotal()+4.00);
			else
				if(tipo.equals(3))
					super.setTotal(super.getTotal()+8.00);
				else
					if(tipo.equals(4))
						super.setTotal(super.getTotal()+10.00);
					else super.setTotal(super.getTotal()+00.00);
		System.out.println("\nTotal valor pedidos de Tapioca(as) : " + super.getTotal());
	}

}