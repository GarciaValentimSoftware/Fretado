package br.com.garciavalentim.fretado.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passageiro {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String registro;
	private Integer assento;
	
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
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public Integer getAssento() {
		return assento;
	}
	public void setAssento(Integer assento) {
		this.assento = assento;
	}
	public Boolean getPagamento() {
		return pagamento;
	}
	public void setPagamento(Boolean pagamento) {
		this.pagamento = pagamento;
	}
	private Boolean pagamento;
}
