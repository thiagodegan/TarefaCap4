package br.com.fiapinhos.ShopAll.model.contract;

import br.com.fiapinhos.ShopAll.model.Manufacturer;

public interface IProduct {
    void showFullData();
    void showData();
    void createManufacturer();
    void createProduct();
    Manufacturer getManufacturer();
    void clearBufferSc();
    void getAdditionalAttributes();
}
