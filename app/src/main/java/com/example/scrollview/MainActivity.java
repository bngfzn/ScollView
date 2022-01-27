package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //01. Daftarkan Widget
    TextView tvDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //02. daftarkan ID widget
        tvDeskripsi = (TextView) findViewById(R.id.textView3);

        //03. Coding Fungsi
        tvDeskripsi.setText("Sejarah Indonesia perlu diketahui. Nama Indonesia sendiri baru digunakan pertama kali saat Kongres Pemuda II 28 Oktober 1928. " +
                        "Jauh sebelum itu wilayah yang kini disebut Indonesia lebih dikenal dengan sebutan Nusantara. Berbagai kerajaan berada dalam wilayah Nusantara ini.\n" +
                "Nusantara hampir tidak pernah luput dari penjajahan bangsa asing. Sumber daya alam yang melimpah jadi incaran. " +
                        "Bangsa Portugis di tahun 1509 berhasil menguasai wilayah Malaka, Ternate dan Madura. Salah satu perlawanan yang dilakukan adalah dari " +
                        "Fatahillah dari Demak yang berhasil merebut Sunda Kelapa dari Portugis yakni pada tahun 1602.\n" +
                "\n" +
                "Setelah Portugis, Belanda kemudian ke wilayah Banten dalam pimpinan Cornelis de Houtman. Saat itu, " +
                        "Belanda ingin membentuk VOC dan menguasai rempah-rempah Indonesia.\n" +
                "Dalam membentuk VOC ada beberapa perjanjian yang harus ditaati oleh Belanda seperti perjanjian Bongaya " +
                "hingga perjanjian Giyanti. Setelah VOC dibubarkan, Belanda akhirnya menunjuk Herman William Daendels sebagai " +
                "gubernur jenderal Hindia-Belanda. Di masanya, ia mempekerjakan paksa masyarakat di Pulau Jawa bekerja untuk membuat jalur Anyer-Panarukan.\n" +
                "\n" +
                "Belanda menguasai Indonesia selama kurang lebih 350 tahun. Hingga akhirnya Jepang masuk ke Indonesia dan" +
                " menyerang Belanda hingga menyerah tanpa syarat. Pemerintahan Jepang berakhir setelah 3,5 tahun menjajah dan " +
                "berakhir ketika tentara sekutu kalah pada Perang Dunia II. Selain itu dua kota di Jepang Hiroshima dan Nagasaki dibom oleh tentara sekutu.\n" +
                "\n" +
                "Mengetahui Jepang kalah, kemudian dibentuk badan BPUPKI atau Dokuritsu Junbi Cosakai yang diketuai oleh Dr. Radjiman Widyodiningrat.\n" +
                "\n" +
                "Setelah mendengar kekalahan Jepang pada 14 Agustus 1945, golongan muda mendesak agar golongan tua cepat melakukan proklamasi kemerdekaan.\n" +
                "\n" +
                "Dalam sejarah Indonesia proses kemerdekaan, terjadi peristiwa Rengasdengklok yakni peristiwa penculikan " +
                "Soekarno dan Hatta oleh golongan muda untuk mempercepat pelaksanaan proklamasi.\n" +
                "\n" +
                "Setelah kembali ke Jakarta, Soekarno dan Hatta mulai menyusun teks proklamasi di rumah Laksamana Maeda dan" +
                " dibantu oleh Achmad Soebardjo dan disaksikan oleh Soekarno, B.M, Diah, Sudiro dan Sayuti Melik.\n" +
                "\n" +
                "Teks proklamasi pun akhirnya dibacakan pada 17 Agustus 1945. Sejarah Indonesia setelah merdeka ialah mengesahkan " +
                "dan menetapkan Undang-undang Dasar (UUD) sebagai dasar negara Republik Indonesia yang akhirnya dikenal masyarakat sebagai UUD 1945.");

    }
}