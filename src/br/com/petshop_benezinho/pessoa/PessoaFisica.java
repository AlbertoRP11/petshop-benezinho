package br.com.petshop_benezinho.pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private Collection <PessoaFisica> filhos = new Vector<>();

    public PessoaFisica() {
    }

    public PessoaFisica addFilho(PessoaFisica filho){
        this.getFilhos().add(filho);
        return this;
    }

    public PessoaFisica removeFilho(PessoaFisica filho){
        this.getFilhos().remove(filho);
        return this;
    }

    public Collection<PessoaFisica> getFilhos(){
        return Collections.unmodifiableCollection(this.filhos);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setFilhos(Collection<PessoaFisica> filhos) {
        this.filhos = filhos;
    }

    public PessoaFisica(String cpf, Collection<PessoaFisica> filhos) {
        this.cpf = cpf;
        this.filhos = filhos;
    }

    public PessoaFisica(Long id, String nome, String cpf, Collection<PessoaFisica> filhos) {
        super(id, nome);
        this.cpf = cpf;
        this.filhos = filhos;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", filhos=" + filhos +
                "} " + super.toString();
    }
}
