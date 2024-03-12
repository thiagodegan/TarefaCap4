package br.com.fiapinhos.ShopAll.model;

import java.util.Date;
import java.util.Scanner;

public class Drink extends Food {
    Scanner sc;
    boolean alcoholic;
    String volume;
    public Drink(Scanner sc) {
        super(sc);
    }

    private boolean getAlcoholic(){
        System.out.print("Bebida alcoólica? (true/false) ");
        if (sc.hasNextBoolean()) {
            boolean alcooholic = sc.nextBoolean();
            clearBufferSc();
            return alcooholic;
        }
        return false;
    }

    private String getVolume() {
        System.out.print("Informe Volume da bebida: ");
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        return null;
    }

    @Override
    public void getAdditionalAttributes() {
        super.getAdditionalAttributes();
        this.alcoholic = getAlcoholic();
        this.volume = getVolume();
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Alcoólico: " + alcoholic);
        System.out.println("Volume: " + getVolume());
    }
}
