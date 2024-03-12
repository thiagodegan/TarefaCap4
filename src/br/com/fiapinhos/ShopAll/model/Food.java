package br.com.fiapinhos.ShopAll.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Food extends BaseProduct{
    Scanner sc;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String ingredients;
    Date validity;
    public Food(Scanner sc) {
        super(sc);
    }

    private String getIngredients() {
        System.out.print("Informe os ingredientes do Produto: ");
        if (sc.hasNextLine()) {
            return sc.nextLine();
        }
        return null;
    }

    public Date getValidity(){
        System.out.print("Informe da data de Validade (dd/mm/aaaa): ");
        if(sc.hasNextLine()) {
            String strDt = sc.nextLine();

            try {
                return formatter.parse(strDt);
            } catch (ParseException e) {
                System.out.print("Data inválida, por favor informe novamente!");
                return getValidity();
            }
        }
        return null;
    }

    @Override
    public void getAdditionalAttributes() {
        this.ingredients = getIngredients();
        this.validity = getValidity();
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Ingredientes: " + ingredients);
        System.out.println("Validade: " + formatter.format(validity));
    }
}
