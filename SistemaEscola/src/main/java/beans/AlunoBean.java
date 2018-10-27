package beans;

import java.io.Serializable;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import entities.Aluno;
import services.AlunoService;

@SessionScoped
@Named
public class AlunoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Aluno aluno = new Aluno();
	private Set<Aluno> alunos;	
	private AlunoService service;

	
	@PostConstruct
	private void init() {
		setService(new AlunoService());
	}
	
	
	private void salvarAluno() {
		service.save(aluno);
		aluno = new Aluno();

	}
	
	public void removerAluno(Aluno a) {
		service.remove(a);
		limpar();
	}
	

	public void limpar() {
		aluno = new Aluno();
		setAlunos((Set<Aluno>) getService().getAll());
	}
	
	public void salvar() {
		service.save(aluno);
		limpar();
	}
	public void onRowEdit(Aluno a) {
		service.update(a);
		FacesMessage m = new FacesMessage("Edição compleata:", a.getNome());
		FacesContext.getCurrentInstance().addMessage(null, m);
		limpar();
	}
	
	private void removeAluno(Aluno a) {
		service.remove(a);
		limpar();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public AlunoService getService() {
		return service;
	}

	public void setService(AlunoService service) {
		this.service = service;
	}

}