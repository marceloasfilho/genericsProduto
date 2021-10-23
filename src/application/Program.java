package application;

import entities.Produto;
import services.CalculationService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Iphone", 5432.10));
        produtos.add(new Produto("S21 Ultra 5g", 5700.00));

        CalculationService cs = new CalculationService(produtos);

        Produto maisCaro = cs.maxExpensive(produtos);
        System.out.println(maisCaro.toString());
    }
}
