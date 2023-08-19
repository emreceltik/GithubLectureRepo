public class Class01 {
    public static void main(String[] args) {

        //Versiyon 1 Kodlari
        System.out.println("Version1");

        //Versiyon 2 Kodlari
        System.out.println("Version2");

        //Versiyon 3 Kodlari
        System.out.println("Version3");

        //Versiyon 4 Kodlari (hatali kodlar - unutulan bazi ozellikler)
        System.out.println("Hatali kodlar");


//git init ==>ile terminalden kaydediyoruz. (repostories -kaydedecegimiz yer- oluşturuyoruz
//kod yazdigimiz yer WS (working space)
//git status ==>statüyü kontrol ettiriyor (guncellenmis kod var ise bize soyluyor, SA'ya gonderilecek kodlari)
//git add . ==>ile "tüm eksikleri" (yaptiklarimizi) staging area'ya yükler.
// Geçici alan (SA) Staging Area. Version lamadan once gonderilen Area
// yesil olunca gecici alanda, version lama bekliyor

//git commit -m" başlık gelecek buraya " ==>version ekliyoruz (gecici alandan versionlamis oluyoruz, commitliyoruz)
// Commit Area

//git log ile ==> version lari ayrintili gosterir (commit de hash kodu yani kimlik bilgisi var, yazar ve tarih de var)
//Q ==>ile log kismindan cikiliyor (Quit)
//git log --oneline   ==>tek satirda versionlari gosterir (burada da sayilar var. version un kimlik numaralarinin ilk 7 hanesi)
//cls ==> ile alan temizleniyor kodlar yani
//git commit --amend -m""  ==> isim değiştirme (hangi versiyondaysan)
// klavyeedeki ok tuşlarıyla eski yazdıklarına ulaşabilirsin
//git log --oneline ==> ile versiyonları tek satırlar halinde gösteriyor.
//git show kmilikNumarasininIlkYediKarakteri ==> orn: git show dd39838
//Q ile cikiliyor

        //git restore --staged. ==> ile SA'daki kodu tekrar WS'ye gonderiyoruz
        //git reset --hard ==>WS'deki son kodlari yok eder. Commit'lenmisleri silmiyor


    }
}
