package br.com.fiapinhos.ShopAll.service.contract;

public interface IProductService<T> {
    T createProduct();
    void showProducts();
    String getCategoryName();
}
