package re.netology.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {


    @Test
    public void shouldSetOverMaxStation() { //Выбор станции выше максимальной
        Radio rad = new Radio();

        rad.setCurrentStation(11);
        rad.setStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinStation() { //Выбор станции ниже минимальной
        Radio rad = new Radio();

        rad.setCurrentStation(-3);
        rad.setStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetAnotherStation() { //Выбор станции от 0 до 9
        Radio rad = new Radio();

        rad.setCurrentStation(5);
        rad.setStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextOverStation(){ // Переключение станции выше 9
        Radio rad = new Radio();

        rad.setCurrentStation(10);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation(){ // Переключение станции до 9
        Radio rad = new Radio();

        rad.setCurrentStation(7);
        rad.nextStation();

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevUnderStation(){ // Переключение станции ниже 0
        Radio rad = new Radio();

        rad.setCurrentStation(-1);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation(){ // переключение станции ниже 9
        Radio rad = new Radio();

        rad.setCurrentStation(5);
        rad.prevStation();

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    
    @Test
    public void shouldIncVolume() { // Увеличение громкости
        Radio vol = new Radio();

        vol.setCurrentVolume(24);
        vol.increaseVolume();

        int expected = 25;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldOverIncVolume() { // Увеличение громкости выше максимума
        Radio vol = new Radio();

        vol.setCurrentVolume(101);
        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDownVolume() { // Уменьшение громкости
        Radio vol = new Radio();

        vol.setCurrentVolume(55);
        vol.downgradeVolume();

        int expected = 54;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
        @Test
        public void shouldUnderDownVolume() { // Уменьшение громкости
            Radio vol = new Radio();

            vol.setCurrentVolume(-2);
            vol.downgradeVolume();

            int expected = 0;
            int actual = vol.getCurrentVolume();

            Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetOverMaxVolume() { // Установка громкости выше максимальной
        Radio vol = new Radio();

        vol.setCurrentVolume(101);
        vol.minMaxVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinVolume() { // Установка громкости ниже минимума
        Radio vol = new Radio();

        vol.setCurrentVolume(-2);
        vol.minMaxVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetAnotherVolume() { // Устанвка громкости от 0 до 9
        Radio vol = new Radio();

        vol.setCurrentVolume(30);
        vol.minMaxVolume();

        int expected = 30;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
