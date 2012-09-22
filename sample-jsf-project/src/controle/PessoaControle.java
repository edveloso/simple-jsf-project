package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Pessoa;
import persistencia.PessoaDAO;

@SessionScoped
@ManagedBean
public class PessoaControle {

	private PessoaDAO  dao;

	private List<Pessoa> pessoas;
 
	private Pessoa pessoa;


	//--construtor
	
	public PessoaControle() {
		pessoas = new ArrayList<Pessoa>();
		dao = new PessoaDAO();
		pessoa =  new Pessoa();
	} 
	
	//---- logica de navegação e aplicação
	
	
	
	public String salvar(){
		
		if(pessoa.getCodigo() == null)
			dao.salvar(pessoa);
		else
			dao.editar(pessoa);
		
		pessoa =  new Pessoa();
		
		return "lista_pessoas";
	}
	
	public String deletar(String codigo){
		dao.deletar(Integer.valueOf(codigo));
		return "lista_pessoas";
	}

	public String iniciarEdicao(String codigo){
		pessoa = dao.obterPessoaPeloCodigo(Integer.valueOf(codigo));
		return "pessoa";
	}
	
	
	public String iniciarCadastro(){
		pessoa = new Pessoa();
		return "pessoa";
	}
	
	//-------gets e sets
	
	public List<Pessoa> getPessoas() {
		pessoas = dao.getPessoas();
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}


	public PessoaDAO getDao() {
		return dao;
	}


	public void setDao(PessoaDAO dao) {
		this.dao = dao;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
