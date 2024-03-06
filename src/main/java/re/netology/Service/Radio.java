package re.netology.Service;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int allStation;

    public Radio(int allStation) {
        this.allStation = allStation;
    }

    public Radio() {
        this.allStation = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) { // выбор станции
        if (newCurrentStation > allStation) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void nextStation() { // переключение на следующую станцию
        if (currentStation == allStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() { // переключение на предыдущую станцию
        if (currentStation == 0) {
            currentStation = allStation - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() { // Увеличение громкости
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void downgradeVolume() { // Уменьшение громкости
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}