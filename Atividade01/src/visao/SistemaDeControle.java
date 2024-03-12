package visao;
import javax.swing.*;
import modelagem.Carro;

public class SistemaDeControle {
	public static void main(String[] args) {
		Carro cauan = new Carro();
		cauan.setNome(JOptionPane.showInputDialog
				(null, "Cauan, digite o nome do seu carro: "));
		cauan.setMarca(JOptionPane.showInputDialog
				(null, "Digite a marca do seu carro: "));
		cauan.setPlaca(JOptionPane.showInputDialog
				(null, "Digite a placa do seu carro: "));
		cauan.setAno(JOptionPane.showInputDialog
				(null, "Digite o ano do seu carro (somente números): "));
		
		JOptionPane.showMessageDialog(null,
				"Dados do veículo de Cauan:\n" +
				"Nome: "+cauan.getNome()+"\n"+
				"Marca: "+cauan.getMarca()+"\n"+
				"Placa: "+cauan.getPlaca()+"\n"+
				"Ano: "+cauan.getAno()+"\n\n"+
			    "Confirmação: Dados registrados com sucesso!");
				
		Carro daniel = new Carro();
		daniel.setNome(JOptionPane.showInputDialog
				(null, "Daniel, digite o nome do seu carro: "));
		daniel.setMarca(JOptionPane.showInputDialog
				(null, "Digite a marca do seu carro: "));
		daniel.setPlaca(JOptionPane.showInputDialog
				(null, "Digite a placa do seu carro: "));
		daniel.setAno(JOptionPane.showInputDialog
				(null, "Digite o ano do seu carro (somente números): "));
		
		JOptionPane.showMessageDialog(null,
				"Dados do veículo de Daniel:\n" +
				"Nome: "+daniel.getNome()+"\n"+
				"Marca: "+daniel.getMarca()+"\n"+
				"Placa: "+daniel.getPlaca()+"\n"+
				"Ano: "+daniel.getAno()+"\n\n"+
			    "Confirmação: Dados registrados com sucesso!");
		
		Carro osmam = new Carro();
		osmam.setNome(JOptionPane.showInputDialog
				(null, "Osmam, digite o nome do seu carro: "));
		osmam.setMarca(JOptionPane.showInputDialog
				(null, "Digite a marca do seu carro: "));
		osmam.setPlaca(JOptionPane.showInputDialog
				(null, "Digite a placa do seu carro: "));
		osmam.setAno(JOptionPane.showInputDialog
				(null, "Digite o ano do seu carro (somente números): "));
		
		JOptionPane.showMessageDialog(null,
				"Dados do veículo de Osmam:\n" +
				"Nome: "+osmam.getNome()+"\n"+
				"Marca: "+osmam.getMarca()+"\n"+
				"Placa: "+osmam.getPlaca()+"\n"+
				"Ano: "+osmam.getAno()+"\n\n"+
			    "Confirmação: Dados registrados com sucesso!");
	}
}