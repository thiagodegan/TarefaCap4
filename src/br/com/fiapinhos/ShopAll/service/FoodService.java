package br.com.fiapinhos.ShopAll.service;

import br.com.fiapinhos.ShopAll.model.Food;
import br.com.fiapinhos.ShopAll.repository.FoodRepository;

import java.util.Scanner;

public class FoodService extends BaseProductService<Food>{
    public FoodService(Scanner sc) {
        super(sc, new FoodRepository());
    }

    @Override
    public Food createProduct() {
        Food food = new Food(sc);
        food.createProduct();
        repository.add(food);
        return food;
    }

    @Override
    public String getCategoryName() {
        return "Alimentício";
    }
}
