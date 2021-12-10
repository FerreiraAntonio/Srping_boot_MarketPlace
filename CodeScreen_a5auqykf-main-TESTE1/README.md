# Java-SpringBoot-CodeScreen-Marketplace
This is the Marketplace platform (you can think of it as a simple version of Amazon). The Platform provides a number
of stores. Each store has a list of products for sale.

This repo contains a SpringBoot project which has implemented functionality for stores. You will need to implement
functionality for products of those stores. The project contains two service's interfaces:

- [StoreService](src/main/java/dev/codescreen/marketplace/service/StoreService.java) - describes methods to manage stores (and it's implementation [InMemoryStoreService](src/main/java/dev/codescreen/marketplace/service/impl/InMemoryStoreService.java))

- [ProductService](src/main/java/dev/codescreen/marketplace/service/ProductService.java) - describes methods to manage products (not implemented)

## Your Task

You need to:

1. Implement the [Product](src/main/java/dev/codescreen/marketplace/model/Product.java) entity to store product information into the `H2` in-memory database.
   Product should have the following fields: `id`, `name`, `storeId` and `price`.

2. Implement all the methods in [InMemoryProductService](src/main/java/dev/codescreen/marketplace/service/impl/InMemoryProductService.java).

3. Implement [ProductController](src/main/java/dev/codescreen/marketplace/controller/ProductController.java) which will serve the following APIs:
    - GET `/product/{id}` - which should return the product with given `id` in JSON format
    - GET `/store/{storeId}/product` - should return the list of all product of store with given `id` in JSON format
    - POST `/store/{storeId}/product` - should add new product, for store with given `storeId`, and give post-body (body should contains product `name` and `price`)
    - GET `/product/find/{name}` - should return all products with given `name` from all stores and sort them by price (cheapest first)

All unit tests in the project should pass if your solution has been implemented correctly.

## Requirements

All test classes (any class that ends with `Test`) should not be modified. If you would like to add your own unit tests,
you can add these in a separate class.

The [pom.xml](pom.xml) file should only be modified in order to add any third-party dependencies required for your solution.
We don't expect to see databases or other persistence layers. In-memory implementations of the stores is all that is
required.

Your solution must use/be compatible `Java 16`.

## Tests
Run `mvn clean test` to run the unit tests. These should all pass if your solution has been implemented correctly.<br>
**Please** check that all the unit tests pass when you run `mvn clean test`, rather than solely running them from inside your IDE.

##

Good luck!

## Submitting your solution

Please push your changes to the `main branch` of this repository. You can push one or more commits. <br>

Once you are finished with the task, please click the `Complete task` link on <a href="https://app.codescreen.dev/#/codescreentest7013ddd1-7f92-43ab-aaba-12455ba1e327" target="_blank">this screen</a>.