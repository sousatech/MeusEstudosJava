package cursoJavaWeb.classes;

import java.util.ArrayList;
import java.util.List;

public class VendaDeMoto {
	private long id;
	private String descricaoVenda;
	private String nomeProduto;
	private String enderecoVenda;
	private double valorProduto;
	
	public VendaDeMoto() {
		
	}
	List<Moto> motocicleta = new ArrayList<Moto>();
	

	public List<Moto> getMotocicleta() {
		return motocicleta;
	}

	public void setMotocicleta(List<Moto> motocicleta) {
		this.motocicleta = motocicleta;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getEnderecoVenda() {
		return enderecoVenda;
	}

	public void setEnderecoVenda(String enderecoVenda) {
		this.enderecoVenda = enderecoVenda;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public double getVendaTotal() {
		double total = 0.0;
		for (Moto moto : motocicleta) {
			total += moto.getValorMoto();
			
		}
		return total;
	}
	

}
