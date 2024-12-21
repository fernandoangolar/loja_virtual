package ao.com.angolartech.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pessoa_fisica")
//@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa {

    private static final long serialVersionUID = 1L;

    @CPF(message = "CPF está inválido")
    @Column(nullable = false)
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;


    @Transient
    private String senhaTemp;

    public void setSenhaTemp(String senhaTemp) {
        this.senhaTemp = senhaTemp;
    }

    public String getSenhaTemp() {
        return senhaTemp;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
