package br.com.fiapinhos.ShopAll.repository;

import br.com.fiapinhos.ShopAll.repository.contract.IRepository;

import java.util.ArrayList;

public abstract class BaseRepository<T> implements IRepository<T> {
    private ArrayList<T> dataSource;

    public void add(T entity) {
        if (dataSource == null) {
            dataSource = new ArrayList<T>();
        }
        dataSource.add(entity);
    }

    public ArrayList<T> getDataSource() {
        if (dataSource == null) {
            dataSource = new ArrayList<T>();
        }

        return dataSource;
    }

    public int countDataSource() {
        if (dataSource == null) {
            dataSource = new ArrayList<T>();
        }
        return dataSource.size();
    }
}
