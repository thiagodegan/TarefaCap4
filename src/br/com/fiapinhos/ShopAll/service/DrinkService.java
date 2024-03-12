package br.com.fiapinhos.ShopAll.service;

import br.com.fiapinhos.ShopAll.model.Drink;
import br.com.fiapinhos.ShopAll.model.Manufacturer;
import br.com.fiapinhos.ShopAll.repository.DrinkRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DrinkService extends BaseProductService<Drink> {
    public DrinkService(Scanner sc) {
        super(sc, new DrinkRepository());
    }

    @Override
    public Drink createProduct() {
        Drink drink = new Drink(sc);
        drink.createProduct();
        repository.add(drink);
        return drink;
    }

    @Override
    public String getCategoryName() {
        return "Bebida";
    }
}
