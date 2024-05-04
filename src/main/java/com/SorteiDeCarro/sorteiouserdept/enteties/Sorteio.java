package com.SorteiDeCarro.sorteiouserdept.enteties;

import java.util.Date;

public class Sorteio {
    private int id;
    private int ano;
    private String identificador;
    private String mes;
    private double valorPremio;
    private String apresentador;
    private String auditor;
    private boolean premiado;
    private String descricao;
    private String tipo;

    public Sorteio(int id, int ano, String identificador, String mes, double valorPremio, String apresentador, String auditor, boolean premiado, String descricao, String tipo) {
        this.id = id;
        this.ano = ano;
        this.identificador = identificador;
        this.mes = mes;
        this.valorPremio = valorPremio;
        this.apresentador = apresentador;
        this.auditor = auditor;
        this.premiado = premiado;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getMes() {
        return mes;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getAuditor() {
        return auditor;
    }

    public boolean isPremiado() {
        return premiado;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Sorteio [id=" + id + ", ano=" + ano + ", identificador=" + identificador + ", mes=" + mes
                + ", valorPremio=" + valorPremio + ", apresentador=" + apresentador + ", auditor=" + auditor
                + ", premiado=" + premiado + ", descricao=" + descricao + ", tipo=" + tipo + "]";
    }
}
