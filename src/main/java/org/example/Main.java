package org.example;

import org.example.classes.Lancamentos;
import org.example.classes.Tabela;
import org.example.enums.TipoTransacao;

public class Main {
    public static void main(String[] args) {

        System.out.println("Testando Aplicação - Adicionando Lançamentos");

        var transacao = new Lancamentos(1170.00, TipoTransacao.SAIDA, "Aluguel");
        var transacao1 = new Lancamentos(150.00, TipoTransacao.SAIDA, "Agua");
        var transacao2 = new Lancamentos(170.00, TipoTransacao.SAIDA, "Luz");
        var transacao3 = new Lancamentos(120.00, TipoTransacao.SAIDA, "Telefone");
        var transacao4 = new Lancamentos(100.00, TipoTransacao.SAIDA, "Internet");
        var transacao5 = new Lancamentos(86.00, TipoTransacao.SAIDA, "Iptu");
        var transacao6 = new Lancamentos(25.00, TipoTransacao.SAIDA, "TV");
        var transacao7 = new Lancamentos(170.00, TipoTransacao.SAIDA, "Plano");
        var transacao8 = new Lancamentos(1070.00, TipoTransacao.SAIDA, "Cartao 1");
        var transacao9 = new Lancamentos(780.00, TipoTransacao.SAIDA, "Cartão 2");

        Tabela.getInstancia().addLancamento(transacao);
        Tabela.getInstancia().addLancamento(transacao1);
        Tabela.getInstancia().addLancamento(transacao2);
        Tabela.getInstancia().addLancamento(transacao3);
        Tabela.getInstancia().addLancamento(transacao4);
        Tabela.getInstancia().addLancamento(transacao5);
        Tabela.getInstancia().addLancamento(transacao6);
        Tabela.getInstancia().addLancamento(transacao7);
        Tabela.getInstancia().addLancamento(transacao8);
        Tabela.getInstancia().addLancamento(transacao9);

        var transacao10 = new Lancamentos(3100.00, TipoTransacao.ENTRADA, "Salario");
        var transacao11 = new Lancamentos(200.00, TipoTransacao.ENTRADA, "Ajuda de custo");
        var transacao12 = new Lancamentos(100.00, TipoTransacao.ENTRADA, "Freela");
        var transacao13 = new Lancamentos(200.00, TipoTransacao.ENTRADA, "Ajuda Sogra");

        Tabela.getInstancia().addLancamento(transacao10);
        Tabela.getInstancia().addLancamento(transacao11);
        Tabela.getInstancia().addLancamento(transacao12);
        Tabela.getInstancia().addLancamento(transacao13);


        System.out.println("Conteúdo do objeto LANCAMENTOS");
        System.out.println(Tabela.getInstancia().getLancamentos());

        System.out.println("Total de Entradas");
        System.out.println(Tabela.getInstancia().totalByTipo(TipoTransacao.ENTRADA));

        System.out.println("Total de Saídas");
        System.out.println(Tabela.getInstancia().totalByTipo(TipoTransacao.SAIDA));

        System.out.println("Saldo final:");
        System.out.println(Tabela.getInstancia().getSaldo());

    }
}