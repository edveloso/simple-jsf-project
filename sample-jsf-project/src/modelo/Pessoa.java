package modelo;

import java.util.Date;

public class Pessoa {

	private String nome;
	
	private Integer codigo;
	
	private Date nascimento;

	private String sexo;
	
	public Pessoa() {
	}
	
	public Pessoa(Integer codigo, String nome, Date nascimento, String sexo) {
		this.codigo = codigo; 
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento; 
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
}
