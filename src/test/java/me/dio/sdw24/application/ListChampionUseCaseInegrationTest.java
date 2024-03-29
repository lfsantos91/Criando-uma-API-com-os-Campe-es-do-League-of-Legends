package me.dio.sdw24.application;

import me.dio.sdw24.domain.model.Champion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListChampionUseCaseInegrationTest {

    @Autowired
    private ListChampionUseCase listChampionUseCase;

    @Test
    public void testListChampions() {
        List<Champion> champions = listChampionUseCase.findAll();

        Assertions.assertEquals(12, champions.size());
    }
}
