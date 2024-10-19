
import java.util.Arrays;

public class ArrayProcess {

        // 1. Soru: Diziyi yazdırma metodu
        public static void diziYaz(int[] dizi) {
            System.out.println(Arrays.toString(dizi));
        }

        // 2. Soru: Yeni eleman ekleyen metot
        public static int[] elemanEkle(int[] array, int yeni) {
            int[] yeniArray = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                yeniArray[i] = array[i];
            }
            yeniArray[yeniArray.length - 1] = yeni;
            return yeniArray;
        }

        // 3. Soru: İlk elemanı silen metot
        public static int[] elemanSil(int[] array) {
            if (array.length == 0) {
                return array; // Dizi boşsa aynı diziyi geri döndür
            }
            int[] yeniArray = new int[array.length - 1];
            for (int i = 1; i < array.length; i++) {
                yeniArray[i - 1] = array[i];
            }
            return yeniArray;
        }

        // 4. Soru: Dizi içinde aranan elemanın sayısını bulma metodu
        public static int diziElemanSay(int[] dizi, int aranan) {
            int sayac = 0;
            for (int eleman : dizi) {
                if (eleman == aranan) {
                    sayac++;
                }
            }
            return sayac;
        }

        // 5. Soru: Dizi içinde aranan elemanın indekslerini bulma metodu
        public static int[] diziArananElemanIndeks(int[] dizi, int aranan) {
            int[] tempIndeks = new int[dizi.length];
            int sayac = 0;

            for (int i = 0; i < dizi.length; i++) {
                if (dizi[i] == aranan) {
                    tempIndeks[sayac++] = i;
                }
            }

            // Bulunan indeksleri tutan yeni bir dizi oluşturalım
            int[] arananIndeksler = new int[sayac];
            for (int i = 0; i < sayac; i++) {
                arananIndeksler[i] = tempIndeks[i];
            }
            return arananIndeksler;
        }

        // 6. Soru: Selection Sort ile String dizisini sıralama metodu
        public static void secmeliSiralamaString(String[] str) {
            for (int i = 0; i < str.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < str.length; j++) {
                    if (str[j].compareTo(str[minIndex]) < 0) {
                        minIndex = j;
                    }
                }
                String temp = str[minIndex];
                str[minIndex] = str[i];
                str[i] = temp;
            }
        }

        // 7. Soru: Klasik eleman arama metodu
        public static int klasikArama(int[] array, int aranan) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == aranan) {
                    return i; // Eleman bulundu, indeks döndürülüyor
                }
            }
            return -1; // Eleman bulunamadı
        }

        // 8. Soru: Özyinelemeli eleman arama metodu
        public static int recursiveArama(int[] array, int aranan, int index) {
            if (index >= array.length) {
                return -1; // Dizi sonuna gelindiyse eleman bulunamadı
            }
            if (array[index] == aranan) {
                return index; // Eleman bulundu
            }
            return recursiveArama(array, aranan, index + 1); // Bir sonraki elemana geç
        }

        // 9. Soru: GCD (OBEB) bulma metodu (Özyinelemeli)
        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        // 10. Soru: Karakter dizisini tersten yazdırma metodu (Özyinelemeli)
        public static void Reverse(char[] s) {
            reverseHelper(s, 0, s.length - 1);
        }

        private static void reverseHelper(char[] s, int start, int end) {
            if (start >= end) {
                return;
            }
            // Karakterleri yer değiştir
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            // Bir sonraki karakter çiftine geç
            reverseHelper(s, start + 1, end - 1);
        }

        public static void main(String[] args) {
            // 1. Soru: Dizi Yazdırma
            int[] dizi = {5, 12, 7, 3, 8};
            diziYaz(dizi);

            // 2. Soru: Eleman Ekleme
            int[] yeniDizi = elemanEkle(dizi, 10);
            diziYaz(yeniDizi);

            // 3. Soru: İlk Elemanı Silme
            int[] silinmisDizi = elemanSil(yeniDizi);
            diziYaz(silinmisDizi);

            // 4. Soru: Eleman Sayma
            int tekrarSayisi = diziElemanSay(dizi, 7);
            System.out.println("Eleman sayısı: " + tekrarSayisi);

            // 5. Soru: Eleman İndekslerini Bulma
            int[] indeksler = diziArananElemanIndeks(dizi, 7);
            diziYaz(indeksler);

            // 6. Soru: String dizisini seçmeli sıralama
            String[] strDizi = {"elma", "armut", "kiraz", "muz"};
            secmeliSiralamaString(strDizi);
            System.out.println(Arrays.toString(strDizi));

            // 7. Soru: Klasik Arama
            int aramaSonucu = klasikArama(dizi, 8);
            System.out.println("Klasik arama sonucu: " + aramaSonucu);

            // 8. Soru: Özyinelemeli Arama
            int recursiveSonuc = recursiveArama(dizi, 8, 0);
            System.out.println("Özyinelemeli arama sonucu: " + recursiveSonuc);

            // 9. Soru: GCD Bulma
            int obeb = gcd(54, 24);
            System.out.println("GCD (OBEB): " + obeb);

            // 10. Soru: Karakter dizisini tersten yazdırma
            char[] charDizi = {'h', 'e', 'l', 'l', 'o'};
            Reverse(charDizi);
            System.out.println(charDizi);
        }
}


