package com.byu.utsbayu;

import android.content.Context;

import com.byu.utsbayu.model.Belalang;
import com.byu.utsbayu.model.Hewan;
import com.byu.utsbayu.model.Jangkrik;
import com.byu.utsbayu.model.Kupukupu;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Jangkrik> initDataJangkrik(Context ctx) {
        List<Jangkrik> jangkriks = new ArrayList<>();
        jangkriks.add(new Jangkrik("Jangkrik Kalung", "Bebatuan",
                "Jangkrik kalung adalah salah satu jenis jangkrik lokal yang punya warna coklat kehitaman.", R.drawable.jangkrik1));
        jangkriks.add(new Jangkrik("Jangkrik Kalung Ras Jerabang", "Jerami",
                "Jangkrik kalung ras jerabang mempunyai ciri berwarna merah bata.", R.drawable.jangkrik2));
        jangkriks.add(new Jangkrik("Jangkrik Kalung Ras Jeliteng", "Sawah",
                "Ras jeliteng mempunyai ciri warna hitam. Iteng diduga berasal dari kata ireng", R.drawable.jangkrik3));
        jangkriks.add(new Jangkrik("Jangkrik Alam", "Alam",
                "Jangkrik alam disebut juga jangkrik rumahan mempunyai warna abu abu kecoklatan.", R.drawable.jangkrik4));
        jangkriks.add(new Jangkrik("Jangkrik Seliring", "Indonesia",
                "Jangkrik seliring atau celiring dikenal dengan nama latin Teleogryllus mitratus.", R.drawable.jangkrik5));
        jangkriks.add(new Jangkrik("Jangkrik Madu (Jamaican Cricket)", "Jamaika",
                "Jangkrik madu punya ciri warna seperti madu. Hitam kecoklatan.", R.drawable.jangkrik6));
        return jangkriks;
    }

    private static List<Belalang> initDataBelalang(Context ctx) {
        List<Belalang> belalangs = new ArrayList<>();
        belalangs.add(new Belalang("Belalang Kayu ( Hedge Grasshopper )", "Hutan",
                "Belalang ini berukuran saat dewasa mencapai 85 mm dengan warna coklat tua. ", R.drawable.belalang1));
        belalangs.add(new Belalang("Belalang Sembah atau Belalang Sentadu", "china",
                "Belalang Sembah atau Belalang Sentadu merupakan serangga dalam ordo Mantodea.", R.drawable.belalang2));
        belalangs.add(new Belalang("Belalang Hijau", "Sawah",
                "Atractomorpha crenulata merupakan belalang yang tergolong dalam ordo orthoptera.", R.drawable.belalang3));
        belalangs.add(new Belalang("Belalang Batu", "Batu",
                "BELALANG yang tampilannya mengagumkan, memiliki corak seperti batu.", R.drawable.belalang4));
        belalangs.add(new Belalang("Belalang Daun", "Daun",
                "Belalang Daun Belalang yang berkamuflase, dapat diartikan sebagai penyesuaian warna tubuh makhluk hidup.", R.drawable.belalang5));
        belalangs.add(new Belalang("cladonotinae", "Dunia",
                "Cladonotinae adalah subfamili wereng tanah yang mengandung lebih dari 70 genera dan 260 spesies yang dideskripsikan. Serangga ini ditemukan di daerah tropis di seluruh dunia.", R.drawable.belalang6));
        return belalangs;
    }

    private static List<Kupukupu> initDataKupukupu(Context ctx) {
        List<Kupukupu> kupukupus = new ArrayList<>();
        kupukupus.add(new Kupukupu("Kupu-kupu raja (Danaus plexippus)", "Brazil dan selatan Suriname",
                "menghasilkan empat generasi hanya dalam satu musim panas saja", R.drawable.bf1));
        kupukupus.add(new Kupukupu("Kupu-kupu bersayap bening (Greta oto)", "Ekuador",
                "bisa membawa hampir 40 kali lipat berat badannya sendiri, bahkan lebih kuat daripada semut.", R.drawable.bf2));
        kupukupus.add(new Kupukupu("Kupu-kupu spicebush swallowtail (Papilio troilus)", "Nikaragua dan Kosta Rika",
                "salah satu kupu-kupu terbesar di dunia dengan lebar sayap mencapai 10 cm", R.drawable.bf3));
        kupukupus.add(new Kupukupu("Kupu-kupu Kaiser-i-Hind (Teinopalpus imperialis)", "Amerika Tengah",
                "memiliki nama yang serupa dengan medali untuk layanan publik di India selama dijajah Inggris.", R.drawable.bf4));
        kupukupus.add(new Kupukupu("Kupu-kupu ceylon rose Sri Lanka (Pachliopta jophon)", "Kolombia",
                "sangat terancam punah karena kehilangan habitat.", R.drawable.bf5));
        kupukupus.add(new Kupukupu("Katak racun punggung merahKupu-kupu swallowtail", "Jamaika",
                "adalah kupu-kupu terbesar di Amerika Utara dengan lebar sayap 16 cm.", R.drawable.bf6));
        return kupukupus;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataJangkrik(ctx));
        hewans.addAll(initDataBelalang(ctx));
        hewans.addAll(initDataKupukupu(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
