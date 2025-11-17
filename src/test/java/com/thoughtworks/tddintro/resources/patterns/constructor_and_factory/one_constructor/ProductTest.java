package com.thoughtworks.tddintro.resources.patterns.constructor_and_factory.one_constructor;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {
    @Test
    public void pricePerItemShouldBeSameAsTotalPriceWhenThereIsOneItem() {
        Product product = new Product(1, 14.0);
        assertThat(product.pricePerItem()).isEqualTo(14.0);
    }

    @Test
    @Disabled // Remove each @Disabled to allow the test to run
    public void pricePerItemShouldBeSameAsTotalPriceWhenThereIsOneItemWithDefaultConstructor() {
        Product product = new Product();
        product.setTotalPrice(14.0);
        assertThat(product.pricePerItem()).isEqualTo(14.0);
    }
}