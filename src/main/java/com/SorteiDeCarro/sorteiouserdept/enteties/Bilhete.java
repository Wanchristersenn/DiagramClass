package com.SorteiDeCarro.sorteiouserdept.enteties;

public class Bilhete {
    private int id;
    private int ano;
    private String mes;
    private int numero;
    private int notaFiscalId;
    private int usuarioId;

    public Bilhete(int id, int ano, String mes, int numero, int notaFiscalId, int usuarioId) {
        this.id = id;
        this.ano = ano;
        this.mes = mes;
        this.numero = numero;
        this.notaFiscalId = notaFiscalId;
        this.usuarioId = usuarioId;
    }

    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public String getMes() {
        return mes;
    }

    public int getNumero() {
        return numero;
    }

    public int getNotaFiscalId() {
        return notaFiscalId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    @Override
    public String toString() {
        return "Bilhete [id=" + id + ", ano=" + ano + ", mes=" + mes + ", numero=" + numero + ", notaFiscalId="
                + notaFiscalId + ", usuarioId=" + usuarioId + "]";
    }
}
