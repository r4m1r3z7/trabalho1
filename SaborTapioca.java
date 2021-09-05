package Tapiocaria;

public class SaborTapioca extends MesadoCliente {
	private Integer sabor = 1; // escala de 1 a 5 (1 == sabor de carne seca, 2 == sabor de pizza, 3 == sabor de frango, 4 == sabor beijinho, 5 sabor brigadeiro)
	
	public SaborTapioca(Integer sabor) {
		super();
		this.sabor = sabor;
	}

	public Integer getSabor() {
		return sabor;
	}

	public void setSabor(Integer sabor) {
		this.sabor = sabor;
	}
	
	public void totalvalormesa() {
		if(sabor.equals(1))
			super.setTotal(super.getTotal()+ 10.00);
		else
			if(sabor.equals(2))
				super.setTotal(super.getTotal()+6.00);
			else
				if(sabor.equals(3))
					super.setTotal(super.getTotal()+8.00);
				else
					if(sabor.equals(4))
						super.setTotal(super.getTotal()+5.00);
					else super.setTotal(super.getTotal()+5.00);
		System.out.println("\nTotal valor pedidos de Tapioca(as) : " + super.getTotal());
	}

}
