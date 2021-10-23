package services;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class CalculationService {
    private List<Produto> produtos;

    public CalculationService() {
        produtos = new ArrayList<>();
    }

    public CalculationService(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public <T extends Comparable<T>> T max(List<T> lista) {
        T max = lista.get(0);

        for (T item : lista) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
