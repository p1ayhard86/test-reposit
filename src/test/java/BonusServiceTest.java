import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class BonusServiceTest {

    @Test
    void    CalculateBonus (){
        BonusService service = new BonusService();
        int amount = 1010;
        int expected = 0;
        int actual = service.calculateBonus(amount);
        Assertions.assertEquals(expected, actual);

    }

}