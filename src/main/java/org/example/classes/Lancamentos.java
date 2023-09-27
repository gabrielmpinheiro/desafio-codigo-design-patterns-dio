package org.example.classes;

import org.example.enums.TipoTransacao;
import org.example.services.CalculosService;

public class Lancamentos {

    public double valor;
    public TipoTransacao tipo;
    public String descricao;


    public Lancamentos(double valor, TipoTransacao tipo, String descricao) {
        setValor(valor);
        setTipo(tipo);
        setDescricao(descricao);
    }

    @Override
    public String toString() {
        return "Lancamentos{" +
                "valor=" + valor +
                ", tipo=" + tipo +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
