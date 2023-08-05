import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;


public class RadioTest {
    @Test
    public void test (){
        Radio radio= new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testMinusOne (){
        Radio radio= new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testOne (){
        Radio radio= new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testEight (){
        Radio radio= new Radio();
        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testNine (){
        Radio radio= new Radio();
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testTen(){
        Radio radio= new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testMinusFive (){
        Radio radio= new Radio();
        radio.setCurrentStation(-5);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testFourteen (){
        Radio radio= new Radio();
        radio.setCurrentStation(14);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextChannel (){
        Radio radio= new Radio();
        radio.setCurrentStation(0);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextChannelOne (){
        Radio radio= new Radio();
        radio.setCurrentStation(1);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextChannelEight (){
        Radio radio= new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextChannelNine (){
        Radio radio= new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextChannelTen (){
        Radio radio= new Radio();
        radio.setCurrentStation(10);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevChannel (){
        Radio radio= new Radio();
        radio.setCurrentStation(9);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevChannelTen (){
        Radio radio= new Radio();
        radio.setCurrentStation(10);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevChannelZero (){
        Radio radio= new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevChannelFirst () {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume (){
        Radio radio= new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testVolumeZero (){
        Radio radio= new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testVolumeOne (){
        Radio radio= new Radio();
        radio.setCurrentVolume(1);

        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testVolumeNinetyNine (){
        Radio radio= new Radio();
        radio.setCurrentVolume(99);

        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testVolumeOneHundred (){
        Radio radio= new Radio();
        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testVolumeOneHundredOne (){
        Radio radio= new Radio();
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void upVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.upVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void upVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.upVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.downVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void downVolumeZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.downVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }



}
