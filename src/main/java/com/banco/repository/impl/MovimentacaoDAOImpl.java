package com.banco.repository.impl;

import com.banco.model.Movimentacao;
import com.banco.repository.MovimentacaoDAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MovimentacaoDAOImpl implements MovimentacaoDAO {
    private final static List<Movimentacao> dados = new ArrayList<>();

    @Override
    public void create(Movimentacao movimentacao) {
        dados.add(movimentacao);
    }

    @Override
    public List<Movimentacao> readAll() {
        return dados;
    }

    @Override
    public Movimentacao read(Long id) {
        for (Movimentacao mov : dados) {
            if (mov.getId().equals(id)) {
                return mov;
            }
        }
        return null;
    }

    @Override
    public boolean update(Long id, Movimentacao movimentacao) {
        for (int i = 0; i < dados.size(); i++) {
            if (dados.get(i).getId().equals(id)) {
                dados.set(i, movimentacao);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        for (int i = 0; i < dados.size(); i++) {
            if (dados.get(i).getId().equals(id)) {
                dados.remove(i);
                return true;
            }
        }
        return false;
    }

//    @Override
//    public List<Movimentacao> buscarPorContaEPeriodo(String numeroConta, Date inicio, Date fim) {
//        List<Movimentacao> resultado = new ArrayList<>();
//        for (Movimentacao movi : dados) {
//            if (movi.getNumeroConta().equals(numeroConta) && !movi.getData().before(inicio) &&
//                    !movi.getData().after(fim)) {
//                resultado.add(movi);
//            }
//        }
//        return resultado;
//    }

    @Override
    public List<Movimentacao>  buscarPorContaEPeriodo(String numeroConta, Date inicio, Date fim) {
      return dados.stream().filter(movi -> movi.getNumeroConta().equals(numeroConta)
                && !movi.getData().before(inicio) &&
                !movi.getData().after(fim)).collect(Collectors.toList());
    }

    @Override
    public List<Movimentacao> buscarTodasContas(String numeroConta) {
       return dados.stream().filter(movi -> movi.getNumeroConta().equals(numeroConta))
               .collect(Collectors.toList());

    }
}



