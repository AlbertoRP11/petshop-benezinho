import br.com.petshop_benezinho.model.Animal;
import br.com.petshop_benezinho.model.Documento;
import br.com.petshop_benezinho.model.Servico;
import br.com.petshop_benezinho.pessoa.Pessoa;
import br.com.petshop_benezinho.pessoa.PessoaFisica;
import br.com.petshop_benezinho.pessoa.PessoaJuridica;

import javax.swing.*;
import java.util.Objects;

public class Main {
    public static PessoaFisica novaPessoa(Long id, String nome, String cpf){
        PessoaFisica pf = new PessoaFisica();
        pf.setId(id);
        pf.setNome(nome);
        pf.setCpf(cpf);
        return pf;
    }

    public static PessoaJuridica novaPessoaJuridica(Long id, String nome, String cnpj){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(id);
        pj.setNome(nome);
        pj.setCnpj(cnpj);
        return pj;
    }

    public static Documento novoDocumento(int id, String numero, Pessoa pessoa){
        Documento doc = new Documento();
        doc.setId(id);
        doc.setNumero(numero);
        doc.setPessoa(pessoa);
        return doc;
    }

    public static Animal novoAnimal(Long id, String nome, String raca, String descricao, String observacao, Pessoa dono){
        Animal animal = new Animal();
        animal.setId(id);
        animal.setNome(nome);
        animal.setRaca(raca);
        animal.setDescricao(descricao);
        animal.setObservacao(observacao);
        animal.setDono(dono);
        return animal;
    }

    public static Servico novoServico(int id, String nome, double valor, String descricao, String observacao, Animal animal){
        Servico servico = new Servico();
        servico.setId(id);
        servico.setNome(nome);
        servico.setValor(valor);
        servico.setDescricao(descricao);
        servico.setAnimal(animal);
        return servico;
    }

    public static void main(String[] args) {

        PessoaFisica alberto = novaPessoa(1, "Alberto","123456789-10");
        PessoaJuridica petshop = novaPessoaJuridica(2, "Petshop do Alberto", "1230001/03");
        Documento doc = novoDocumento(3, "123", alberto);
        Animal animal = novoAnimal(4, "Toto", "Viralata", "Cachorro tranquilo", "Não cortar as unhas", alberto);
        PessoaFisica albertinho = novaPessoa(6, "Albertinho", "123456789-11");

        alberto.addFilho(albertinho);

        var servico = JOptionPane.showInputDialog("Digite o serviço desejado:");

        if (Objects.equals(servico, "Tosa")){
            System.out.println("Serviço agendado!");
        } else{
            System.out.println("Infelizmente não temos esse serviço!");
        }

    }
}