package com.example.myrecyclerview;

import java.util.ArrayList;

public class ResepData {
    public static String[][] data = new String[][]{
            {"Sate", "Makanan", "http://www.rooftoptable.com/wp-content/uploads/2016/05/satay.jpeg","200 gram kacang tanah goreng, 5 siung bawang merah, 3 siung bawang putih, 2 buah kemiri, bagi dua, 4 buah cabai merah keriting, 70 ml santan (kemasan), 170 ml air, Gula secukupnya, Garam secukupnya, Minyak goreng secukupnya."},
            {"Soto", "Makanan", "http://3.bp.blogspot.com/_w5RYu7_MCh4/TJ3C5G9FoYI/AAAAAAAAHiI/eutRBecsjxc/s1600/sotof5.JPG","1 ekor (900 gram) ayam, belah 4 bagian, 2 liter air , 2 cm jahe, 3 batang serai, memarkan, 1 1/2 sendok makan garam , 1/8 sendok teh merica bubuk , 1 sendok makan gula pasir , 10 lembar daun jeruk, buang tulang daunnya, 2 sendok makan minyak untuk menumis , Minyak untuk menggoreng "},
            {"Rendang", "Makanan", "https://scm-assets.constant.co/swm/9a888e72fca371869e751ab34491d024/27cb62cf-e2bc-4127-a5da-795a0e9dcd0f.jpg","1 kg daging sapi Bahan dan Bumbu Membuat Rendang Daging Kalio: 1 butir kelapa 8 siung bawang merah 1/2 sendok makan gula pasir 2 lembar daun jeruk 4 buah kemiri 1/2 sendok teh jintan 4 siung bawang putih 1 cm lengkuas 2 lembar daun salam 1 sendok teh ketumbar 1/2 sendok teh lada bubuk 1 batang serai 1/2 sendok makan garam 3 sendok makan minyak goreng"},
            {"Ayam Bakar", "Makanan", "https://s3-ap-southeast-1.amazonaws.com/afc-prod/thumbnails/standard_large/9214/9656/5289/tn-recipe-HCI-Ayam-Panggang-Kecap-Soy-Sauce-Grilled-Chicken.jpg","1 ekor ayam bagi 4 (aku pakai ayam pejantan), 4 lembar daun salam, 2 batang serai, ambil bagian putihnya, memarkan 20 gr asam jawa, larutkan dan remas-remas dalam 3sdm air panas, ambil airnya\n" +
                    "500 ml santan\n"},
            {"Pempek", "Makanan", "http://2.bp.blogspot.com/-MrtHV_vHqgg/UQILToFB6QI/AAAAAAAAAIY/Q2asJHjAgjY/s1600/Pempek-Palembang-Sumatera-Selatan-Indonesia-1024x768.jpg","1½ kg tepung tapioca, 1¼ kg tepung terigu, 1¼ kg telur ayam, 1 butir bawang putih (haluskan), Air secukupnya\n" +
                    "Cuka: 1 sendok garam, 3 sdm kecap manis Bango, 2 bungkus asam, 2 koin kecil gula merah, 5 gelas air\n" +
                    "Bahan yang dihaluskan: 3 butir bawang putih, Cabai/cengeh sesuai selera\n"},
            {"Baso", "Makanan", "http://3.bp.blogspot.com/-mzJjTMYNPsU/T08cANQPoII/AAAAAAAAA_0/S9eKvPEs2wo/s1600/bakso-meatball.jpg","20 buah Bakso Sapi, 250 gram Tulang Sapi, 4 siung Bawang Putih, Secukupnya Daun Bawang, Secukupnya Bawang Merah, Secukupnya Garam, 1 liter Air Untuk Membuat Kaldu, Secukupnya Air Untuk Kuah Bakso, 1 sendok Minyak Untuk Menumis, Secukupnya Lada Bubuk, Secukupnya Bawang Goreng."},
            {"Es Buah", "Minuman", "https://media-cdn.tripadvisor.com/media/photo-s/10/ba/2e/7b/es-oyen-nyaa-lumayan.jpg","Sirup rasa cocopandan, cincau hitam atau agar-agar, Buah nangka matang, Buah alpukat, Daging Buah kelapa muda, kolang-kaling, Buah blewah matang, Bubur Mutiara, Roti tawar, Susu kental manis, Es batu / serut secukupnya."}
    };

    public static ArrayList<Resep> getListData() {
        Resep resep = null;
        ArrayList<Resep> list = new ArrayList<>();
        for (String[] aData : data){
            resep = new Resep();
            resep.setName(aData[0]);
            resep.setRemarks(aData[1]);
            resep.setPhoto(aData[2]);
            resep.setDetail(aData[3]);

            list.add(resep);
        }
        return list;
    }
}
