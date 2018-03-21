package pessoa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	ID
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer matricula;
	
//	DADOS
	private String nome;
	private String setor;
	
//	GETTERS AND SETTERS	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
//	INSERCAO DE DADOS NA CLASSE TIPO RODIGO
	public Funcionario(Integer matricula, String nome, String setor) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.setor = setor;
	}	
}
