package services;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class CalculationService {
    private List<Produto> produtos = new ArrayList<Produto>();

    public CalculationService(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto maxExpensive(List<Produto> produtos){
        Produto max = produtos.get(0);

        for (Produto produto : produtos){
            if (max.compareTo(produto) > 0){
                max = produto;
            }
        }
        return max;
    }
}