package practice.hospital;

import java.text.DecimalFormat;

public class Hospital {
    private static final int MIN = 32;
    private static final int MAX = 40;

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperatures = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            temperatures[i] = rnd();
        }
        return temperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        String temperatures = "";
        int countNormal = 0;
        float tempAverage = 0;
        DecimalFormat df = new DecimalFormat("#.#");

        for (int i = 0; i < temperatureData.length; i++) {
            Float temp = new Float(temperatureData[i]);
            int minNormal = temp.compareTo(new Float(36.2));
            int maxNormal = temp.compareTo(new Float(36.9));
            if ((temperatureData[i] > 36.2 && temperatureData[i] < 36.9) ||
                    minNormal == 0 || maxNormal == 0) {
                countNormal++;
            }
            tempAverage += temperatureData[i];
            temperatures += df.format(temperatureData[i]);
            temperatures += i == temperatureData.length - 1 ? "" : " ";
        }

        tempAverage /= temperatureData.length;
        df = new DecimalFormat("#.##");

        String report =
                "Температуры пациентов: " + temperatures +
                        "\nСредняя температура: " + df.format(tempAverage) +
                        "\nКоличество здоровых: " + countNormal;

        return report;
    }

    public static float rnd() {
        float max = MAX - MIN;
        float rerult = (float) ((Math.random() * max) + MIN);
        return rerult > 40 ? Math.round(rerult) : rerult;
    }
}
