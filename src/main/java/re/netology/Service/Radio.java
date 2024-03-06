package re.netology.Service;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Radio {
    @Getter
    private int currentStation;
    @Getter
    private int currentVolume;
    private int allStation = 10;

    public void setCurrentStation(int newCurrentStation) { // выбор станции
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void nextStation() { // переключение на следующую станцию
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() { // переключение на предыдущую станцию
        if (currentStation == 0) {
            currentStation = 9;
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