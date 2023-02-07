package com.company.Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "test.csv";

        System.out.println("Запись данных в: " + filePath);
        writeCsv(filePath);

        System.out.println("Чтение данных из: " + filePath);
        readCsv(filePath);
    }

    public static void writeCsv(String filePath) {

        List<AppData> newValues = new ArrayList<>();

        AppData values = new AppData();
        values.setHeight(234);
        values.setLength(45);
        values.setWidth(12);
        newValues.add(values);

        values = new AppData();
        values.setHeight(980);
        values.setLength(87);
        values.setWidth(67);
        newValues.add(values);

        values = new AppData();
        values.setHeight(678);
        values.setLength(78);
        values.setWidth(46);
        newValues.add(values);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);

            fileWriter.append("Высота; Длинна; Ширина\n");

            for(AppData v: newValues) {
                fileWriter.append(String.valueOf(v.getHeight()));
                fileWriter.append(";");
                fileWriter.append(String.valueOf(v.getLength()));
                fileWriter.append(";");
                fileWriter.append(String.valueOf(v.getWidth()));
                fileWriter.append("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void readCsv(String filePath) {
        BufferedReader reader = null;

        try {
            List<AppData> newValues = new ArrayList<>();
            String line;
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();

            while((line = reader.readLine()) != null) {
                String[] fields = line.split(";");

                if(fields.length > 0) {
                    AppData values = new AppData();
                    values.setHeight(Integer.parseInt(fields[0]));
                    values.setLength(Integer.parseInt(fields[1]));
                    values.setWidth(Integer.parseInt(fields[2]));
                    newValues.add(values);
                }
            }

            System.out.println("Высота; Длинна; Ширина");

            for(AppData v: newValues) {
                System.out.printf("%d; %s; %s\n", v.getHeight(), v.getLength(), v.getWidth());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                assert reader != null;
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
