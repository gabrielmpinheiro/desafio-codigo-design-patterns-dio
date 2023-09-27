package org.example.classes;

import org.example.enums.TipoTransacao;
import org.example.services.CalculosService;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
    private static Tabela instancia;
    public List<Lancamentos> lancamentos = new ArrayList<Lancamentos>();

    private CalculosService calculos = new CalculosService();

    private Tabela() {
       super();
    }

    public static Tabela getInstancia() {
        if (instancia == null) {
            instancia = new Tabela();
        }
        return instancia;
    }

    public void addLancamento(Lancamentos item){
        lancamentos.add(item);
    }

    public List<Lancamentos> getLancamentos() {
        return lancamentos.stream().toList();
    }

    public double totalByTipo(TipoTransacao tipo) {

        return lancamentos.stream()
                .filter(l -> l.getTipo() == tipo)
                .mapToDouble(l -> l.getValor())
                .sum();
    }

    public double getSaldo(){
        return calculos.saldo(this.totalByTipo(TipoTransacao.ENTRADA), this.totalByTipo(TipoTransacao.SAIDA));

    }






}
