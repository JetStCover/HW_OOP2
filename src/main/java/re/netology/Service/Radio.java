package re.netology.Service;
public class Radio {
    public int currentStation;
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int setStation() { // Ручной ввод станции, где минимум 0, а максимум 9
        if (currentStation > 9) {
            currentStation = 9;
        } else if (currentStation < 0) {
            currentStation = 0;
        }
        return currentStation;
    }


    public void nextStation(){  // Следующая станция
        if ( currentStation > 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }
    public void prevStation(){ // Предыдущая станция
        if ( currentStation < 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }


    public void increaseVolume() { // Увеличение громкости
        if (currentVolume > 100) {
            currentVolume = 100;
        } else {
            currentVolume ++;
        }
    }

    public void downgradeVolume() { // Уменьшение громкости
        if (currentVolume < 0) {
            currentVolume = 0;
        } else {
            currentVolume --;
        }
    }
    public int minMaxVolume () { // Установка громкости, где минимальная 0, максимальная 100
        if (currentVolume > 100) {
        currentVolume = 100;
    } else if (currentVolume < 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }
}