package com.SorteiDeCarro.sorteiouserdept.enteties;

public class Nota_Fiscal {
    private int id;
    private int usuarioId;
    private String chave;
    private String sequencial;
    private String dataProcessamento;

    public Nota_Fiscal(int id, int usuarioId, String chave, String sequencial, String dataProcessamento) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.chave = chave;
        this.sequencial = sequencial;
        this.dataProcessamento = dataProcessamento;
    }

    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public String getChave() {
        return chave;
    }

    public String getSequencial() {
        return sequencial;
    }

    public String getDataProcessamento() {
        return dataProcessamento;
    }

    @Override
    public String toString() {
        return "NotaFiscal [id=" + id + ", usuarioId=" + usuarioId + ", chave=" + chave + ", sequencial=" + sequencial
                + ", dataProcessamento=" + dataProcessamento + "]";
    }
}
