package br.com.fiapinhos.ShopAll.service;

import br.com.fiapinhos.ShopAll.model.Clothing;
import br.com.fiapinhos.ShopAll.model.Manufacturer;
import br.com.fiapinhos.ShopAll.repository.ClothingRepository;

import java.util.Scanner;

public class ClothingService extends BaseProductService<Clothing>{
    Scanner sc;
    public ClothingService(Scanner sc) {
        super(sc, new ClothingRepository());
        this.sc = sc;
    }

    @Override
    public Clothing createProduct() {
        Clothing clothing = new Clothing(sc);
        clothing.createProduct();
        repository.add(clothing);
        return clothing;
    }

    @Override
    public String getCategoryName() {
        return "Vestuário";
    }
}
