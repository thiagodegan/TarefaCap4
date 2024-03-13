package br.com.fiapinhos.ShopAll.service;

import java.util.Scanner;

public class MenuService {
    Scanner sc = new Scanner(System.in);
    ElectronicService electronicService = new ElectronicService(sc);
    ClothingService clothingService = new ClothingService(sc);
    FoodService foodService = new FoodService(sc);
    DrinkService drinkService = new DrinkService(sc);

    private int requestProductType() {
        int option;

        System.out.println("1 - Produto Eletrônico");
        System.out.println("2 - Produto de Vestuário");
        System.out.println("3 - Produto Alimentício");
        System.out.println("4 - Bebida");
        System.out.println("5 - Voltar");
        System.out.print("Informe o tipo: ");
        option = 0;
        if (sc.hasNextInt()) {
            option = sc.nextInt();
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
        }

        if (option == 0 || option > 5){
            System.out.printf("Opção %d inválida!\n", option);
            return requestProductType();
        }

        return option;
    }

    private void menuCreate () {
        int option;

        System.out.println("\n*** Incluir Produto ***");
        System.out.println("Qual o tipo de produto que vai incluir?");
        option = requestProductType();

        switch (option) {
            case 1:
                electronicService.createProduct();
                break;
            case 2:
                clothingService.createProduct();
                break;
            case 3:
                foodService.createProduct();
                break;
            case 4:
                drinkService.createProduct();
                break;
        }

        if (option != 5) {
            // FICA EM RECURSAO ATÉ QUE O USUÁRIO INFORME A OPÇÃO PARA VOLTAR
            menuCreate();
        }
    }

    private void menuList() {
        int option;

        System.out.println("\n*** Consultar Produto ***");
        System.out.println("Qual o tipo de produto que deseja consultar?");
        option = requestProductType();

        switch (option) {
            case 1:
                electronicService.showProducts();
                break;
            case 2:
                clothingService.showProducts();
                break;
            case 3:
                foodService.showProducts();
                break;
            case 4:
                drinkService.showProducts();
                break;
        }
        if (option != 5) {
            // FICA EM RECURSAO ATÉ QUE O USUÁRIO INFORME A OPCAO 5 PARA VOLTAR
            menuList();
        }
    }
    public void Start() {
        System.out.println("ShopAll inicializando...");
        int option;

        do {
            System.out.println("\n*** Menu principal ***");
            System.out.println("1 - Incluir Produtos");
            System.out.println("2 - Consultar Produtos");
            System.out.println("3 - Sair");
            System.out.print("Informe a opção: ");
            option = 0;

            if (sc.hasNextInt()) {
                option = sc.nextInt();
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }

            switch (option){
                case 1:
                    menuCreate();
                    break;
                case 2:
                    menuList();
                    break;
                case 3: break;
                default:
                    System.out.printf("Opção %d inválida!", option);
                    break;
            }

        } while (option != 3);
    }
}
