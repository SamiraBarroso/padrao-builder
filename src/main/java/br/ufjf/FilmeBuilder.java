package br.ufjf;
import java.util.List;
public class FilmeBuilder {
    private Filme filme;

    public FilmeBuilder() {
        filme = new Filme();
    }

    public Filme build(){
        if(filme.getAno() == 0 || filme.getAno() < 0 ) {
            throw new IllegalArgumentException("Ano inválido");
        }
        if( filme.getNome() == null || filme.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido");
        }
        if(filme.getDiretor().equals("")){
            throw new IllegalArgumentException("Diretor inválido");
        }
        if(filme.getElenco().isEmpty()){
            throw new IllegalArgumentException("Elenco inválido");
        }
        return filme;
    }

    public FilmeBuilder setNome(String nome) {
        filme.setNome(nome);
        return this;
    }

    public FilmeBuilder setAno(int ano) {
        filme.setAno(ano);
        return this;
    }

    public FilmeBuilder setDiretor(String diretor) {
        filme.setDiretor(diretor);
        return this;
    }

    public FilmeBuilder setDataLancamento(String dataLancamento) {
        filme.setDataLancamento(dataLancamento);
        return this;
    }

    public FilmeBuilder setAvaliacaoImdb(Double avaliacaoImdb) {
        filme.setAvaliacaoImdb(avaliacaoImdb);
        return this;
    }

    public FilmeBuilder FilmeBuilder(String genero) {
        filme.setGenero(genero);
        return this;
    }

    public FilmeBuilder setRoterista(String roterista) {
        filme.setRoterista(roterista);
        return this;
    }

    public FilmeBuilder setDuracao(int duracao) {
        filme.setDuracao(duracao);
        return this;
    }

    public FilmeBuilder setClassificação(int classificação) {
        filme.setClassificação(classificação);
        return this;
    }

    public FilmeBuilder setElenco(List elenco) {
        filme.setElenco(elenco);
        return this;
    }

}
