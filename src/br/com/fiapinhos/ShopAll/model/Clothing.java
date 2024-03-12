package br.com.fiapinhos.ShopAll.model;

import java.util.Scanner;

public class Clothing extends BaseProduct {
    Scanner sc;
    String size;
    String color;
    String material;
    public Clothing(Scanner sc) {
        super(sc);
        this.sc = sc;
    }

    private String getSize() {
        System.out.print("Informe o tamanho do produto: ");
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        return null;
    }

    private String getColor() {
        System.out.print("Informe o cor do produto: ");
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        return null;
    }

    private String getMaterial() {
        System.out.print("Informe o material do produto: ");
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        return null;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Tamanho: " + size);
        System.out.println("Cor: " + color);
        System.out.println("Material: " + material);
    }

    @Override
    public void getAdditionalAttributes() {
        this.size = getSize();
        this.color = getColor();
        this.material = getMaterial();
    }
}
