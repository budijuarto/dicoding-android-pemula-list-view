package com.example.celerates.myrecyclerview;

import java.util.ArrayList;

public class BudiData {
    public static String[][] data = new String[][]{
            {
                    "中島 敦",
                    "Penulis Ke-1",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/AtsushiNakajima.jpg",
                    " Nakajima was born in Tokyo, Japan. His father was a scholar specialising in Classical Chinese and he communicated his enthusiasm to his son, who is known for poetic short stories in distant historical settings",
                    "May 5, 1909",
                    "December 4, 1942"
            },
            {
                    "太宰 治",
                    "Penulis Ke-2",
                    "https://upload.wikimedia.org/wikipedia/commons/7/77/Osamu_Dazai.jpg",
                    "Osamu Dazai (太宰 治 Dazai Osamu, lahir di Prefektur Aomori, 19 Juni 1909 – meninggal di Mitaka, Tokyo, 13 Juni 1948 pada umur 38 tahun) adalah penulis dari zaman Showa di Jepang. Nama aslinya Tsushima Shūji (津島修治). Selain dikenal mengarang cerita pendek dan novel dengan gaya autobiografi, Dazai juga pernah menulis naskah sandiwara Shin Hamlet (The New Hamlet) dan dongeng Otogizōshi (Fairy Tales)",
                    "Prefektur Aomori, 19 Juni 1909 ",
                    "Mitaka, Tokyo, 13 Juni 1948"},

                     {"芥川 龍之介",
                             "Penulis Ke-3",
                    "https://upload.wikimedia.org/wikipedia/commons/c/c5/Akutagawa_Ry%C5%ABnosuke.jpg",
                    "sastrawan Jepang yang dikenal sebagai penulis novel pendek dan cerpen. Pada tahun 1935, Kan Kikuchi mengabadikan namanya untuk hadiah sastra Penghargaan Akutagawa.",
                    "Tokyo, 1 Maret 1892 ",
                    "Tokyo, 24 Juli 1927 "
                     },

                    {"国木田 独歩",
                            "Penulis Ke-4",
                    "https://upload.wikimedia.org/wikipedia/commons/3/32/Kunikida_Doppo.jpg",
                    "penulis novel dan puisi romantis Jepang dari periode Meiji. Ia dikenal sebagai salah seorang perintis naturalisme dalam sastra Jepang..",
                    "Chōshi, Chiba, 15 Juli 1871",
                    " Tokyo, 23 Juni 1908"}
    };
    public static ArrayList<Budi> getListData(){
        Budi Budi = null;
        ArrayList<Budi> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            Budi = new Budi();
            Budi.setName(data[i][0]);
            Budi.setRemarks(data[i][1]);
            Budi.setPhoto(data[i][2]);
            Budi.setDeskripsi(data[i][3]);
            Budi.setLahir(data[i][4]);
            Budi.setWafat(data[i][5]);

            list.add(Budi);
        }

        return list;
    }

}
