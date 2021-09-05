package Tapiocaria;

public class Pedido {
	
	private String descricao; // novo ou ja cadastrado 
	private Integer tempo;
	
	public Pedido() {
		super();
	}
	
	public Pedido(String descricao, Integer tempo) {
		
		this.descricao = descricao;
		this.tempo = tempo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
	
}
