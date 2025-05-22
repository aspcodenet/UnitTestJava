package se.systementor.unittest.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeerCalculatorServiceTests {
    private BeerCalculatorService sut = new BeerCalculatorService();

    @Test
    public void when_18_And_OnKrogen_And_Not_Drunk_Is_Allowed() {
        // ARRANGE
        int age = 18;
        String location = "K";
        float promille = 0.0f;

        // ACT
        boolean canBuyBeer = sut.CanBuyBeer (age, location, promille);

        //ASSERT
        assertEquals(canBuyBeer, true);

    }
}
