package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Professor implements Identificavel {
	
	@Id
	@GeneratedValue(generator="professor_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="professor_seq")
	private Long matricula;
	private String nome;
	private Date date;
	private String login;
	private String senha;
	private String materia;
	
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public Long getMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}
	@Override
	public void setMatricula(Long Matricula) {
		// TODO Auto-generated method stub
		
	}
	


}
