package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Disciplina implements Identificavel {
	
	@Id
	@GeneratedValue(generator="disciplina_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="disciplina_seq")
	private Long idDis;
	
	private String nome;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_professor_disciplina")
	private Professor professor;
	
	
	@ManyToMany(mappedBy = "disciplinas", cascade = CascadeType.ALL)
	private Set<Aluno> alunos;
	
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Long getIdDis() {
		return idDis;
	}
	public void setIdDis(Long idDis) {
		this.idDis = idDis;
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
