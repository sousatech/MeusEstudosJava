package cursoJavaWeb.Executaveis;

import cursoJavaWeb.classes.Moto;
import cursoJavaWeb.classes.VendaDeMoto;

public class ExecutavelVenda {
	public static void main(String[] args) {
		VendaDeMoto venda = new VendaDeMoto();
		venda.setId(001L);
		venda.setDescricaoVenda("venda de moto de segunda mão ");
		venda.setEnderecoVenda("rua durvalino couto ");
		venda.setNomeProduto("moto");
		venda.setValorProduto(7000.00);
		
		Moto moto1 = new Moto();
		moto1.setId(01L);
		moto1.setMarca("Honda");
		moto1.setAno("2015");
		moto1.setCor("vermelha");
		moto1.setValorMoto(8000.00);
		
		
		Moto moto2 = new Moto();
		moto2.setId(02L);
		moto2.setMarca("Yamaha");
		moto2.setAno("2019");
		moto2.setCor("Preta");
		moto2.setValorMoto(8500.00);
		
		
		
		Moto moto3 = new Moto();
		moto3.setId(01L);
		moto3.setMarca("Honda");
		moto3.setAno("2011");
		moto3.setCor("branca");
		moto3.setValorMoto(8000.00);
		
		
		venda.getMotocicleta().add(moto1);
		venda.getMotocicleta().add(moto2);
		venda.getMotocicleta().add(moto3);
		
		System.out.println("Descrião da venda : "  + venda.getDescricaoVenda() + "valor total = " + venda.getVendaTotal());
		
	}

}
