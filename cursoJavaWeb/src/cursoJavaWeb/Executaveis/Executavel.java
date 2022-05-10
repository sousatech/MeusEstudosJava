package cursoJavaWeb.Executaveis;

import javax.swing.JOptionPane;

import cursoJavaWeb.classes.Aluno;

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
		String escola = JOptionPane.showInputDialog("nome");
		String diciplina1 = JOptionPane.showInputDialog("diciplina 1");
		String nota1 = JOptionPane.showInputDialog("nota 1");
		String diciplina2 = JOptionPane.showInputDialog("diciplina 2");
		String nota2 = JOptionPane.showInputDialog("nota 2");
		String diciplina3 = JOptionPane.showInputDialog("diciplina 3");
		String nota3 = JOptionPane.showInputDialog("nota 3");
		String diciplina4 = JOptionPane.showInputDialog("diciplina 4");
		String nota4 = JOptionPane.showInputDialog("nota 4");
		
		Aluno aluno1 = new Aluno();
	     
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setMumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setDiciplina1(diciplina1);
		aluno1.setNota1(Double.valueOf(nota1));
		aluno1.setDiciplina2(diciplina2);
		aluno1.setNota2(Double.valueOf(nota2));
		aluno1.setDiciplina3(diciplina3);
		aluno1.setNota3(Double.valueOf(nota3));
		aluno1.setDiciplina4(diciplina4);
		aluno1.setNota4(Double.valueOf(nota4));
		
		System.out.println(aluno1.toString());
		System.out.println("nome do aluno : " + aluno1.getNome());
		System.out.println("cpf : "+ aluno1.getMumeroCpf());
		System.out.println("A media do aluno e : " + aluno1.getMediaNota());
		System.out.println("Status do Aluno e de : " + aluno1.getAlunoAprovado());
		
		
	}

}
