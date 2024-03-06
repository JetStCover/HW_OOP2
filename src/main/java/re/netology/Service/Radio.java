package re.netology.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int allStation;

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