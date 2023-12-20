import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Test
    public void getSoundValidSound() {
        // Тест корректного звучания
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals("Некорректный звук", expectedSound, actualSound);
    }

    @Test
    public void getFoodValidFood() throws Exception {
        // Тест корректной пищи
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedMeal = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeal = cat.getFood();
        Assert.assertEquals("Указана некорректная пища", expectedMeal, actualMeal);
    }
}
