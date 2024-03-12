package br.com.fiapinhos.ShopAll.service;

import br.com.fiapinhos.ShopAll.model.Electronic;
import br.com.fiapinhos.ShopAll.repository.ElectronicRepository;

import java.util.Scanner;

public class ElectronicService extends BaseProductService<Electronic> {
    public ElectronicService(Scanner sc) {

        super(sc, new ElectronicRepository());
    }

    @Override
    public Electronic createProduct () {
        Electronic electronic = new Electronic(sc);
        electronic.createProduct();
        repository.add(electronic);
        return electronic;
    }

    @Override
    public String getCategoryName() {
        return "Eletrônico";
    }


}
