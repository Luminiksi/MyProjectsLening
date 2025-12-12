package practice.hospital;

import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        int maxTemp = 40;
        int minTemp = 32;
        float[] temperatures = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            float temperature = (float) (Math.random() * (maxTemp - minTemp) + minTemp);
            // Исправляем формат и округляем математически (а то дальше используется 1 число после запятой)
            temperature = Math.round(temperature * 10) / 10.0f;
            temperatures[i] = temperature;
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

        float sumTemp = 0;
        int healthy = 0;

        for (int i = 0; i < temperatureData.length; i++) {
            // Исправляем формат и округляем математически (а то дальше используется 1 число после запятой)
            float temperature = Math.round(temperatureData[i] * 100) / 100.0f;
            temperatureData[i] = temperature;
            sumTemp += temperature;
            if (temperature >= 36.2f && temperature <= 36.9f) {
                healthy++;
            }
        }

        float avgTemp = sumTemp / temperatureData.length;
        avgTemp = Math.round(avgTemp * 100) / 100.0f;

        String allTemperatures = Arrays.toString(temperatureData);
        allTemperatures = allTemperatures.replaceAll("[\\[\\],]", "");

        String report =
                "Температуры пациентов: " + allTemperatures +
                        "\nСредняя температура: " + avgTemp +
                        "\nКоличество здоровых: " + healthy;

        return report;
    }
}
