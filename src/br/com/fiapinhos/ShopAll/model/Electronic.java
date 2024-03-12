package br.com.fiapinhos.ShopAll.model;

import java.util.Scanner;

public class Electronic extends BaseProduct {
    Scanner sc;
    String model;
    public Electronic(Scanner sc) {
        super(sc);
        this.sc = sc;
    }

    private String getModel() {
        System.out.print("Informe o modelo do Produto: ");
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        return null;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Modelo: " + model);
    }

    @Override
    public void getAdditionalAttributes() {
        this.model = getModel();
    }

}
