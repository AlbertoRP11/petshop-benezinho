package br.com.petshop_benezinho.pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private Collection<Pessoa> socios = new Vector<>();

    public PessoaJuridica addSocio(Pessoa socio){
        this.getSocios().add(socio);
        return this;
    }

    public PessoaJuridica removeSocio(Pessoa socio){
        this.getSocios().remove(socio);
        return this;
    }

    public Collection<Pessoa> getSocios() {
        return Collections.unmodifiableCollection(this.socios);
    }

    public PessoaJuridica() {
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setSocios(Collection<Pessoa> socios) {
        this.socios = socios;
    }

    public PessoaJuridica(Long id, String nome, String cnpj, Collection<Pessoa> socios) {
        super(id, nome);
        this.cnpj = cnpj;
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", socios=" + socios +
                "} " + super.toString();
    }
}
