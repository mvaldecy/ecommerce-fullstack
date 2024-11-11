package com.clickshop.dtos;

import java.util.List;

import com.clickshop.entities.Customer;
import com.clickshop.entities.Product;

public class Utils {
    public static CustomerDto CustomerModelToDto(Customer customer) {
        return new CustomerDto(
            customer.getId(),
            customer.getName(),
            customer.getCpf(),
            customer.getCashback(),
            customer.getAmountSpent(),
            customer.getCustomerLevel(),
            customer.getCreatedAt()
        );
    }

    public static List<CustomerDto> CustomerModelListToDtoList(List<Customer> customerList) {
        return customerList.stream().map((customer) -> CustomerModelToDto(customer)).toList();
    }

    public static ProductDto ProductModelToDto(Product product) {
        return new ProductDto(
            product.getId(),
            product.getDescription(),
            product.getPrice(),
            product.getQuantity()
        );
    }

    public static List<ProductDto> ProductModelListToDto(List<Product> productList) {
        return productList.stream().map((product) -> ProductModelToDto(product)).toList();
    }
}
