package Tapiocaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pedido> listaPedido = new ArrayList<Pedido>(); 
		
		String resposta = "Sim";
		while(resposta.equals("Sim")) {
			Pedido pedido = new Pedido();
		
			pedido.setDescricao(JOptionPane.showInputDialog("Qual a descricao? "));
			pedido.setTempo(Integer.parseInt(JOptionPane.showInputDialog("Qual o tempo? ")));
			
			SaborTapioca s = new SaborTapioca(null);
			
			s.setSabor(Integer.parseInt(JOptionPane.showInputDialog("Qual o Sabor (1; 2; 3; 4; ou 5) ")));

			
			Bebidas b = new Bebidas(null);
			b.setTipo(Integer.parseInt(JOptionPane.showInputDialog("Qual a bebida (1; 2; 3; 4; ou 5) ")));
			
//			s.totalvalormesa();
//			b.totalvalormesa();
		
			listaPedido.add(pedido);
			resposta  = JOptionPane.showInputDialog("Deseja cadastrar outro pedido? Sim ou Não ");
		}
	
		System.out.println("qtd de tapioca(as) e bebida(as) pedida(as): " + listaPedido.size());
	
	}
	
}
