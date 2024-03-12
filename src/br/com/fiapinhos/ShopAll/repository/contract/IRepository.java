package br.com.fiapinhos.ShopAll.repository.contract;

import java.util.ArrayList;

public interface IRepository<T> {
    void add(T entity);
    ArrayList<T> getDataSource();
    int countDataSource();
}
