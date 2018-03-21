package pessoa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atleta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String clube;

	// EMPTY
	public Atleta() {
	}

	// CONSTRUCTOR E ARGUMENTOS
	public Atleta(Integer id, String nome, String clube) {
		super();
		this.id = id;
		this.nome = nome;
		this.clube = clube;
	}

	// GETTERS AND SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClube() {
		return clube;
	}

	public void setClube(String clube) {
		this.clube = clube;
	}

	// TOSTRING()
	@Override
	public String toString() {
		return "Atleta [id=" + id + ", nome=" + nome + ", clube=" + clube + "]";
	}
}
