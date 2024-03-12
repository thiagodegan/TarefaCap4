package br.com.fiapinhos.ShopAll.service;

import br.com.fiapinhos.ShopAll.model.BaseProduct;
import br.com.fiapinhos.ShopAll.model.Electronic;
import br.com.fiapinhos.ShopAll.model.contract.IProduct;
import br.com.fiapinhos.ShopAll.repository.BaseRepository;
import br.com.fiapinhos.ShopAll.repository.contract.IRepository;
import br.com.fiapinhos.ShopAll.service.contract.IProductService;

import java.util.Scanner;

public abstract class BaseProductService<T extends BaseProduct> implements IProductService<T> {
    Scanner sc;
    IRepository<T> repository;

    public BaseProductService(Scanner sc, IRepository<T> repository) {
        this.sc = sc;
        this.repository = repository;
    }

    public abstract T createProduct ();

    public abstract String getCategoryName();

    public void showProducts() {
        System.out.printf("\nExistem %d produtos cadastrados como %s.\n", repository.countDataSource(), getCategoryName());

        for (T product : repository.getDataSource() ) {
            System.out.println("----------------------------------------------");
            product.showFullData();
        }
    }

}
