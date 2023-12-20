import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    // Тесты для класса Feline

    @Test
    public void getFamilyReturnValidFamily() {
        // Тест метода, возращающего семейство
        Feline feline = new Feline();
        String exceptedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Некорректное семейство", exceptedFamily, actualFamily);
    }

    @Test
    public void getKittensReturnValidCountOfKittens() {
        Feline feline = new Feline();
        int exceptedCountOfKittens = 1;
        int actualCountOfKittens = feline.getKittens();
        Assert.assertEquals("Некорректное количество котят", exceptedCountOfKittens, actualCountOfKittens);
    }

    @Test
    public void eatMeatReturnValidMeat() throws Exception {
        Feline feline = new Feline();
        List<String> exceptedMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeat = feline.eatMeat();
        Assert.assertEquals("Некорректная пища", exceptedMeat, actualMeat);
    }

    @Test
    public void eatMeatReturnInvalidMeat() throws Exception {
        Feline feline = new Feline();
        List<String> exceptedMeat = List.of("Трава", "Различные растения");
        List<String> actualMeat = feline.eatMeat();
        Assert.assertNotEquals("Некорректная пища", exceptedMeat, actualMeat);
    }
}
