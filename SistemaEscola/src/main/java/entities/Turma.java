package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Turma implements Identificavel{
	
	@Id
	@GeneratedValue(generator="turma_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="turma_seq")
	private Long idTur;
	private String nome;
	private String descricao;
	
	@OneToMany
	@JoinColumn(name = "id_aluno")
	private Set<Aluno> alunos;
	
	public Long getIdTur() {
		return idTur;
	}
	public void setIdTur(Long idTur) {
		this.idTur = idTur;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	@Override
	public Long getMatricula() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setMatricula(Long matricula) {
		// TODO Auto-generated method stub
		
	}
	
	

}
