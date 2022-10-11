package br.ufjf;

import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String nome;
    private int ano;
    private String diretor;
    private String dataLancamento;
    private Double avaliacaoImdb;
    private String genero;
    private String roterista;
    private int duracao;
    private int classificação;
    private List elenco;

    public Filme (){
        this.ano = 0;
        this.elenco = new ArrayList();
        this.diretor = "";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getAvaliacaoImdb() {
        return avaliacaoImdb;
    }

    public void setAvaliacaoImdb(Double avaliacaoImdb) {
        this.avaliacaoImdb = avaliacaoImdb;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRoterista() {
        return roterista;
    }

    public void setRoterista(String roterista) {
        this.roterista = roterista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getClassificação() {
        return classificação;
    }

    public void setClassificação(int classificação) {
        this.classificação = classificação;
    }

    public List getElenco() {
        return elenco;
    }

    public void setElenco(List elenco) {
        this.elenco = elenco;
    }
}

