package persistencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.Pessoa;

public class PessoaDAO {

	private List<Pessoa> lista = new ArrayList<Pessoa>();

	public PessoaDAO() {
		Pessoa pessoa = new Pessoa(1, "Joao", new Date(), "Masculino");
		lista.add(pessoa);
		pessoa = new Pessoa(2, "Maria", new Date(), "Feminino");
		lista.add(pessoa);
	}
	
	public List<Pessoa> getPessoas(){
		return lista;
	}

	public void deletar(Integer codigo) {
		Pessoa pessoa = obterPessoaPeloCodigo(codigo);
		if(pessoa != null)
			lista.remove(pessoa);
	}

	public Pessoa obterPessoaPeloCodigo(Integer codigo) {
		if(codigo == null) return null;
		
		for (Pessoa pessoa : lista) {
			if(codigo.intValue() == pessoa.getCodigo().intValue())
				return pessoa;
		}
		return null;
	}

	public void salvar(Pessoa pessoa) {
		lista.add(pessoa);
	}

	public void editar(Pessoa pessoa) {
		deletar(pessoa.getCodigo());
		salvar(pessoa);
	}
	
}
