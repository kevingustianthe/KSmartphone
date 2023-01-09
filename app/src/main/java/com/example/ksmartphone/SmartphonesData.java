package com.example.ksmartphone;

import java.util.ArrayList;

public class SmartphonesData {

    private static String[] smartphoneNames = {
            "Xiaomi Redmi 10 5G",
            "Xiaomi Redmi Note 11",
            "Samsung Galaxy A23 5G",
            "Samsung Galaxy M52 5G",
            "iPhone 13 Pro Max",
            "iPhone 14 Pro Max",
            "Oppo Reno 8 Pro",
            "Oppo A77",
            "Huawei Mate 50 Pro",
            "Huawei nova 10 Pro",
            "Infinix Zero 20",
            "Infinix Note 12 Pro 5G"
    };

    private static String[] smartphoneDetails = {
            "Xiaomi Redmi 10 5G dirilis pada 23 September 2022. Smartphone ini memiliki bobot 200g dengan ketebalan 8.9mm dan kapasitas baterai sebesar 5000mAh. Smartphone ini menggunakan sistem operasi MIUI 13 berbasis Android 12.",
            "Xiaomi Redmi Note 11 dirilis pada 9 Februari 2022. Smartphone ini memiliki bobot 179g dengan ketebalan 8.1mm dan kapasitas baterai sebesar 5000mAh. Smartphone ini menggunakan sistem operasi MIUI 13 berbasis Android 11 up to Android 12.",
            "Samsung Galaxy A23 5G dirilis pada 2 September 2022. Smartphone ini memiliki bobot 197g dengan ketebalan 8.4mm dan kapasitas baterai sebesar 5000mAh. Smartphone ini menggunakan sistem operasi OneUI 4.1 berbasis Android 12.",
            "Samsung Galaxy M52 5G dirilis pada 3 Oktober 2021. Smartphone ini memiliki bobot 173g dengan ketebalan 7.4mm dan kapasitas baterai sebesar 5000mAh. Smartphone ini menggunakan sistem operasi OneUI 4.1 berbasis Android 11 up to Android 12.",
            "iPhone 13 Pro Max dirilis pada 24 September 2021. Smartphone ini memiliki bobot 240g dengan ketebalan 7.7mm dan kapasitas baterai sebesar 4352mAh. Smartphone ini menggunakan sistem operasi iOS 15 up to iOS 16.0.3.",
            "iPhone 14 Pro Max dirilis pada 16 September 2022. Smartphone ini memiliki bobot 240g dengan ketebalan 7.9mm dan kapasitas baterai sebesar 4323mAh. Smartphone ini menggunakan sistem operasi iOS 16 up to iOS 16.0.3.",
            "Oppo Reno 8 Pro dirilis pada 19 Juli 2022. Smartphone ini memiliki bobot 183g dengan ketebalan 7.3mm dan kapasitas baterai sebesar 4500mAh. Smartphone ini menggunakan sistem operasi ColorOS 12.1 berbasis Android 12.",
            "Oppo A77 dirilis pada 10 Juni 2022. Smartphone ini memiliki bobot 190g dengan ketebalan 8mm dan kapasitas baterai sebesar 5000mAh. Smartphone ini menggunakan sistem operasi ColorOS 12.1 berbasis Android 12.",
            "Huawei Mate 50 Pro dirilis pada 28 September 2022. Smartphone ini memiliki bobot 205g/209g dengan ketebalan 8.5mm dan kapasitas baterai sebesar 4700mAh. Smartphone ini menggunakan sistem operasi EMUI 13 berbasis HarmonyOS 3.0.",
            "Huawei nova 10 Pro dirilis pada 10 Juli 2022. Smartphone ini memiliki bobot 191g dengan ketebalan 7.9mm dan kapasitas baterai sebesar 4500mAh. Smartphone ini menggunakan sistem operasi HarmonyOS 2.0.",
            "Infinix Zero 20 dirilis pada 5 Oktober 2022. Smartphone ini memiliki bobot 196g dengan ketebalan 8mm dan kapasitas baterai sebesar 4500mAh. Smartphone ini menggunakan sistem operasi XOS 12 berbasis Android 12.",
            "Infinix Note 12 Pro 5G dirilis pada 15 Juli 2022. Smartphone ini memiliki bobot 188g dengan ketebalan 8mm dan kapasitas baterai sebesar 5000mAh. Smartphone ini menggunakan sistem operasi XOS 10.6 berbasis Android 12."
    };

    private static int[] smartphoneImages = {
            R.drawable.xiaomi_redmi_10_5g,
            R.drawable.xiaomi_redmi_note_11,
            R.drawable.samsung_galaxy_a23_5g,
            R.drawable.samsung_galaxy_m32_5g,
            R.drawable.iphone_13_pro_max,
            R.drawable.iphone_14_pro_max,
            R.drawable.oppo_reno8_pro,
            R.drawable.oppo_a77_5g,
            R.drawable.huawei_mate_50_pro,
            R.drawable.huawei_nova_10_pro,
            R.drawable.infinix_zero_20,
            R.drawable.infinix_note_12_pro_5g
    };

    static ArrayList<Smartphone> getListData() {
        ArrayList<Smartphone> list = new ArrayList<>();
        for (int position = 0; position < smartphoneNames.length; position++) {
            Smartphone smartphone = new Smartphone();
            smartphone.setName(smartphoneNames[position]);
            smartphone.setDetail(smartphoneDetails[position]);
            smartphone.setPhoto(smartphoneImages[position]);
            list.add(smartphone);
        }

        return list;
    }

}
