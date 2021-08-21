package com.betha.exemplo.exemplo.model;

import com.betha.exemplo.exemplo.enterprise.AbstractEntity;

import java.time.LocalDate;
import java.util.Set;

public class ContaUsuario extends AbstractEntity {

    private String nomeConta;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private LocalDate daraCriacaoConta;
    private String biografia;
    private String link;
    private Cidade cidade;
    private Set<Feed> publicacoes;
    private Set<Historia> historias;
    private Set<ContaUsuario> seguidores;
    private Set<ContaUsuario> seguindo;

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDaraCriacaoConta() {
        return daraCriacaoConta;
    }

    public void setDaraCriacaoConta(LocalDate daraCriacaoConta) {
        this.daraCriacaoConta = daraCriacaoConta;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Set<Feed> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(Set<Feed> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public Set<Historia> getHistorias() {
        return historias;
    }

    public void setHistorias(Set<Historia> historias) {
        this.historias = historias;
    }

    public Set<ContaUsuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(Set<ContaUsuario> seguidores) {
        this.seguidores = seguidores;
    }

    public Set<ContaUsuario> getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(Set<ContaUsuario> seguindo) {
        this.seguindo = seguindo;
    }

    @Override
    public String toString() {
        return "ContaUsuario{" +
                "nomeConta='" + nomeConta + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                '}';
    }
}
