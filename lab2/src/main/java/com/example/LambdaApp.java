package com.example;

public class LambdaApp {
    public interface Product {
        void displayInfo();
    }

    public interface Manufacturer {
        void displayInfo();
    }

    public static void main(String[] args) {
        // Лямбда-выражение для товара
        Product product = () -> {
            String name = "Ноутбук";
            String size = "15 дюймов";
            double weight = 2.5; // в килограммах

            System.out.println("Информация о товаре:");
            System.out.println("Наименование: " + name);
            System.out.println("Резмер: " + size);
            System.out.println("Вес: " + weight + " кг");
        };

        // Лямбда-выражение для производителя
        Manufacturer manufacturer = () -> {
            String name = "TechCorp";
            String country = "Германия";
            String contactPerson = "Иванов Иван Иванович";
            String phone = "+7-000-000-00-00";

            System.out.println("Информация о производителе:");
            System.out.println("Название: " + name);
            System.out.println("Страна: " + country);
            System.out.println("Контактная информация: " + contactPerson);
            System.out.println("Телефон: " + phone);
        };

        // Вызов методов для отображения информации
        product.displayInfo();
        System.out.println();
        manufacturer.displayInfo();
    }
}