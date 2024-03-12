package br.com.fiapinhos.ShopAll;

import br.com.fiapinhos.ShopAll.service.MenuService;

public class Main {
    public static void main(String[] args) {
        MenuService mnService = new MenuService();
        mnService.Start();
        System.out.println("Encerrando ShopAll..");
    }
}
