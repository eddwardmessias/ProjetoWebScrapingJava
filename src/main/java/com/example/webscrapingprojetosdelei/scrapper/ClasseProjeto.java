package com.example.webscrapingprojetosdelei.scrapper;

public class ClasseProjeto {

    String NumeroProjeto;
    String Ementa;

    public ClasseProjeto() {
    }
    public ClasseProjeto(String numeroProjeto, String ementa) {
        this.NumeroProjeto = numeroProjeto;
        this.Ementa = ementa;
    }

    public String getNumeroProjeto() {
        return NumeroProjeto;
    }

    public void setNumeroProjeto(String numeroProjeto) {
        NumeroProjeto = numeroProjeto;
    }

    public String getEmenta() {
        return Ementa;
    }

    public void setEmenta(String ementa) {
        Ementa = ementa;
    }
}
