package br.com.fiapinhos.ShopAll.model;

import br.com.fiapinhos.ShopAll.model.contract.IProduct;

import java.util.Scanner;

public abstract class BaseProduct implements IProduct {
    Scanner sc;
    Manufacturer manufacturer;
    String name;
    double price;
    String description;
    int stock;

    public BaseProduct(Scanner sc) {
        this.sc = sc;
    }

    public void clearBufferSc() {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }

    public String getName() {
        System.out.print("Informe o nome do Produto: ");
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        return null;
    }

    public String getDescription() {
        System.out.print("Informe a descrição do Produto: ");
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        return null;
    }

    public double getPrice() {
        System.out.print("Informe o preço do Produto: ");
        if (sc.hasNextDouble()) {
            double price = sc.nextDouble();
            clearBufferSc();
            return  price;
        }
        return 0;
    }

    public int getStock() {
        System.out.print("Informe o estoque do Produto: ");
        if (sc.hasNextInt()) {
            int stock = sc.nextInt();
            clearBufferSc();
            return stock;
        }
        return 0;
    }

    private void createBaseAttributes(){
        this.name = getName();
        this.description = getDescription();
        this.price = getPrice();
        this.stock = getStock();
    }

    private String getManufacturerName () {
        System.out.print("Informe o nome do Fabricante: ");

        if (sc.hasNextLine()) {
            return sc.nextLine();
        }

        return null;
    }

    private String getManufacturerAddress () {
        System.out.print("Informe o endereço do Fabricante: ");

        if (sc.hasNextLine()) {
            return sc.nextLine();
        }

        return null;
    }

    private String getManufacturerPhone () {
        System.out.print("Informe o telefone do Fabricante: ");

        if (sc.hasNextLine()) {
            return sc.nextLine();
        }

        return null;
    }

    public void showData() {
        System.out.println("Nome: " + name);
        System.out.println("Descrição: " + description);
        System.out.printf("Preço: %.2f%n", price);
        System.out.printf("Estoque: %d%n", stock);
    }

    final public void showFullData() {
        manufacturer.showData();
        System.out.println("Dados do Produto:");
        showData();
    }

    public void createManufacturer() {
        this.manufacturer = new Manufacturer(getManufacturerName(), getManufacturerAddress(),
                getManufacturerPhone());
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public abstract void getAdditionalAttributes();
    public void createProduct() {
        createManufacturer();
        createBaseAttributes();
        getAdditionalAttributes();
        System.out.println("\nPor favor revise os dados do novo produto:\n");
        showFullData();
        System.out.print("Tudo correto com o produto? (true/false) ");
        boolean isOk = sc.nextBoolean();
        clearBufferSc();

        if (!isOk) {
            createProduct();
        }
    }
}
