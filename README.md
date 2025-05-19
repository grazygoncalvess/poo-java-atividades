# ☕ Atividades de Programação Orientada a Objetos em Java

Este repositório contém exercícios desenvolvidos durante meus estudos de Programação Orientada a Objetos (POO) com Java. Aqui estão atividades práticas que reforçam conceitos como:

- Classes e Objetos  
- Encapsulamento  
- Herança  
- Polimorfismo  
- Interfaces  

---

##  Exemplo de atividade

Abaixo está um trecho de uma das atividades onde apliquei conceitos de:

- Herança
- Polimorfismo
- Classes abstratas
- Manipulação de datas (`SimpleDateFormat`)
- Uso de listas (`ArrayList`)

```java
System.out.print("Enter the number of products: ");
int n = input.nextInt();
for (int i = 0; i < n; i++) {
    System.out.println("Product #" + (i + 1) + " data:");
    System.out.print("Common, used or imported (c/u/i)? ");
    char type = input.next().charAt(0);
    System.out.print("Name: ");
    String name = input.next();
    System.out.print("Price: ");
    Double price = input.nextDouble();

    if (type == 'c') {
        Product product = new Product(name, price);
        products.add(product);
    } else if (type == 'u') {
        System.out.print("Manufacture date (dd/MM/yyyy): ");
        Date manufactureDate = sdf.parse(input.next());
        Product usedProduct = new UsedProduct(name, price, manufactureDate);
        products.add(usedProduct);
    } else {
        System.out.print("Custom fee: ");
        Double customFee = input.nextDouble();
        Product importedProduct = new ImportedProduct(name, price, customFee);
        products.add(importedProduct);
    }
}
