package cursoJavaWeb.Executaveis;

import cursoJavaWeb.classes.Aluno;

/* main e um metodo auto executavel em java*/
public class ExecutavelAluno {
	public static void main(String[] args) {
		/*
		 * criando um objeto aluno1 e uma instancia do objeto
		 */
		Aluno aluno1 = new Aluno();// crando dados na memoria do java isso ja vem por padrão

		aluno1.setNome("lucas Emanuel");
		aluno1.setIdade(Integer.valueOf(01));
		aluno1.setCpf("684.2541.875-00");
		aluno1.setRg("8.566.011");
		aluno1.setDataNaciemnto("16/09/2021");
		aluno1.setNomeMae("izabel");
		aluno1.setNomePai("mauricio");
		aluno1.setDataMtricula("05/04/2022");
		aluno1.setSerieMatriculado("01");
		aluno1.setEscola("javaweb");

		aluno1.setNota1(90);
		aluno1.setNota2(87);
		aluno1.setNota3(88);
		aluno1.setNota4(77.15);

		System.out.println("nome : " + aluno1.getNome());
		System.out.println("idade :" + aluno1.getIdade());
		System.out.println("cpf : " + aluno1.getCpf());
		System.out.println("rg : " + aluno1.getRg());
		System.out.println("data de nascimento : " + aluno1.getDataNaciemnto());
		System.out.println("nome da mae : " + aluno1.getNomeMae());
		System.out.println("nome do pai :" + aluno1.getNomePai());
		System.out.println("data da matricula :" + aluno1.getDataMtricula());
		System.out.println("serie matriculado : " + aluno1.getSerieMatriculado());
		System.out.println("escola : " + aluno1.getEscola());
		System.out.println(" a media e  = " + aluno1.getnotaMedia());
		System.out.println("media = "+ (aluno1.getAlunoAprovado()? "aprovado" : "reprovado"));
		

	}

}
