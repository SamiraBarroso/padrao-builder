package br.ufjf;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilmeBuilderTest {
    @Test
    void deveRetornarExcecaoParaFilmeSemNome() {
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            List elenco = new ArrayList<>();
            elenco.add("Jeronimo");
            elenco.add("Petrucio");
            elenco.add("Filomena");
            Filme filme = filmeBuilder
                    .setAno(2001)
                    .setElenco(elenco)
                    .setDiretor("Milton Faizao")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFilmeSemAno(){
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            List elenco = new ArrayList<>();
            elenco.add("Jeronimo");
            elenco.add("Petrucio");
            elenco.add("Filomena");
            Filme filme = filmeBuilder
                    .setNome("A volta dos que não foram")
                    .setElenco(elenco)
                    .setDiretor("Milton Faizao")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano inválido", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoParaFilmeAnoNegativo(){
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            List elenco = new ArrayList<>();
            elenco.add("Jeronimo");
            elenco.add("Petrucio");
            elenco.add("Filomena");
            Filme filme = filmeBuilder
                    .setNome("A volta dos que não foram")
                    .setAno(-98)
                    .setElenco(elenco)
                    .setDiretor("Milton Faizao")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFilmeSemDiretor(){
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            List elenco = new ArrayList<>();
            elenco.add("Jeronimo");
            elenco.add("Petrucio");
            elenco.add("Filomena");
            Filme filme = filmeBuilder
                    .setNome("A volta dos que não foram")
                    .setAno(2008)
                    .setElenco(elenco)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Diretor inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFilmeSemELenco(){
        try {
            FilmeBuilder filmeBuilder = new FilmeBuilder();
            Filme filme = filmeBuilder
                    .setNome("A volta dos que não foram")
                    .setAno(2008)
                    .setDiretor("Milton Faizao")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Elenco inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        FilmeBuilder filmeBuilder = new FilmeBuilder();
        List elenco = new ArrayList<>();
        elenco.add("Jeronimo");
        elenco.add("Petrucio");
        elenco.add("Filomena");
        Filme filme = filmeBuilder
                .setNome("A volta dos que não foram")
                .setAno(2008)
                .setDiretor("Milton Faizao")
                .setElenco(elenco)
                .build();

        assertNotNull(filme);
    }
}