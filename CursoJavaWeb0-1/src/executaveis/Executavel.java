package executaveis;

import javax.swing.JOptionPane;

import cursoJavaWeb.classes.Aluno;
import cursoJavaWeb.classes.Diciplina;

public class Executavel {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("nome");
		String idade = JOptionPane.showInputDialog("nome");
		String dataNascimento = JOptionPane.showInputDialog("nome");
		String rg = JOptionPane.showInputDialog("rg");
		String cpf = JOptionPane.showInputDialog("cpf ");
		String nomeMae = JOptionPane.showInputDialog("nome da Mae");
		String nomePai = JOptionPane.showInputDialog("nome do Pai");
		String dataMatricula = JOptionPane.showInputDialog("data da matricula");
		String serie = JOptionPane.showInputDialog("serie");
		String escola = JOptionPane.showInputDialog("nome da escola");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome(nome);
		aluno2.setIdade(Integer.valueOf(idade));
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setRegistroGeral(rg);
		aluno2.setMumeroCpf(cpf);
		aluno2.setNomeMae(nomeMae);
		aluno2.setNomePai(nomePai);
		aluno2.setDataMatricula(dataMatricula);
		aluno2.setSerieMatriculado(serie);
		aluno2.setNomeEscola(escola);
		
		Diciplina diciplina = new Diciplina();
		
		
		
	}

}
