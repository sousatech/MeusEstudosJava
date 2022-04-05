package cursoJavaWeb.classes;

public class Aluno {
	/* atributos do aluno*/
	private String nome;
	private int idade;
	private String dataNaciemnto;
	private String cpf;
	private String rg;
	private String nomeMae;
	private String nomePai;
	private String dataMtricula;
	private String serieMatriculado;
	private String escola;

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	// contrutor
	public Aluno() {

	}

	/*
	 * metodos set e get set e para adicionar ou receber dados para os atributos get
	 * e para resgatar os dados do atributos retorna os dados
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNaciemnto() {
		return dataNaciemnto;
	}

	public void setDataNaciemnto(String dataNaciemnto) {
		this.dataNaciemnto = dataNaciemnto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMtricula() {
		return dataMtricula;
	}

	public void setDataMtricula(String dataMtricula) {
		this.dataMtricula = dataMtricula;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	/* metodo que calcula a media do aluno */
	public double getnotaMedia() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	// metodo que diz se o aluno est aprovado ou reprovado
	public boolean getAlunoAprovado() {
		double media = this.getnotaMedia();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

}
