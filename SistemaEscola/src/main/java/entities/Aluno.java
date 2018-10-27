package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Aluno implements Identificavel {

	@Id
	@GeneratedValue(generator = "aluno_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "aluno_seq")
	private Long matricula;
	
	private String nome;
	private String data;
	
	@ManyToMany
	@JoinTable(name = "aluno_disciplina", joinColumns = { @JoinColumn(name = "disciplina_iDdis") }, inverseJoinColumns = {
			@JoinColumn(name = "aluno_matricula") })
	private Set<Disciplina> disciplinas;

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	

}
