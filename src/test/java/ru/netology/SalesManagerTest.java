package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тестирование SalesManager")

public class SalesManagerTest {
    protected SalesManager period;

    @BeforeEach
    void put() {
        period = new SalesManager(new long[]{68, 55, 98, 35, 87, 100});
    }

    @Test
    @DisplayName("Тестирование поика максимума")
    void max() {
        Assertions.assertEquals(100, period.max());
    }

    @Test
    @DisplayName("Тестирование поиска минимума")
    void min() {
        Assertions.assertEquals(35, period.min());
    }

    @Test
    @DisplayName("Тестирование поиска обрезанного среднего")
    void croppedAverage() {
        Assertions.assertEquals(77, period.croppedAverage());
    }

    @Test
    @DisplayName("Тестирование поиска обрезанного среднего из двух значений")
    void croppedAverageTwo() {
        SalesManager two = new SalesManager(new long[] {50, 70});
        Assertions.assertThrows(ArithmeticException.class, two::croppedAverage);
    }
}
