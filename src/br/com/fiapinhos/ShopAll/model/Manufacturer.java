package br.com.fiapinhos.ShopAll.model;

public class Manufacturer {
    String name;
    String address;
    String phone;

    public Manufacturer (String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void showData() {
        System.out.println("Dados do Fabricante:");
        System.out.println("Nome: " + name);
        System.out.println(("Endereço: " + address));
        System.out.println("Telefone: " + phone);
    }
}
