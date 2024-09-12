package com.example3;

public class ProductApp {
    public interface Product {
        void displayInfo();
    }

    public interface Manufacturer {
        void displayInfo();
    }

    public static void main(String[] args) {
        // Анонимный класс для товара
        Product product = new Product() {
            String name = "Ноутбук";
            String size = "15 дюймов";
            double weight = 2.5; // в килограммах

            @Override
            public void displayInfo() {
                System.out.println("Информация о товаре:");
                System.out.println("Наименование: " + name);
                System.out.println("Резмер: " + size);
                System.out.println("Вес: " + weight + " кг");
            }
        };

        // Анонимный класс для производителя
        Manufacturer manufacturer = new Manufacturer() {
            String name = "TechCorp";
            String country = "Германия";
            String contactPerson = "Иванов Иван Иванович";
            String phone = "+7-000-000-00-00";

            @Override
            public void displayInfo() {
                System.out.println("Информация о производителе:");
                System.out.println("Название: " + name);
                System.out.println("Страна: " + country);
                System.out.println("Контактная информация: " + contactPerson);
                System.out.println("Телефон: " + phone);
            }
        };

        // Вызов методов для отображения информации
        product.displayInfo();
        System.out.println();
        manufacturer.displayInfo();
    }
}
