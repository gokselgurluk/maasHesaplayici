public class Employee {

   String name ; //Çalışanın adı ve soyadı
    int salary ;//Çalışanın maaşı
   int  workHours; //: Haftalık çalışma saati
   int  hireYear; //: İşe başlangıç yılı

    //double vergiOrani =0.03;
    double vergiTutari =0.0;
    int bonusUcret  =0;
    double maasHesapArtisi=0.0;




    public Employee(String name, int salary,   int  workHours, int  hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
        bonus();
        raiseSalary();
        toStringPrint();

    }

    public void tax(){
        /*Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.*/

        if(this.salary<1000){

           this.vergiTutari=0;
          }
        if(this.salary>1000) {
           this.vergiTutari= (this.salary * 0.03);
        }

    }

    public void bonus(){
        if(this.workHours>40){
            this.bonusUcret=(this.workHours-40)*30;
        }
        if (this.workHours<40){
            this.bonusUcret=0;
        }
        /*Eğer çalışan haftada 40 saatten fazla çalışmış ise
        fazladan çalıştığı her saat başına 30 TL olacak şekilde
        bonus ücretleri hesaplayacaktır.
         */

    }
    public void raiseSalary(){
        int hesapYil;
       hesapYil=2021-this.hireYear;

        if(hesapYil<10){
            this.maasHesapArtisi=this.salary*0.05;
        }
        if(hesapYil> 9 && hesapYil < 20 ){
            this.maasHesapArtisi=this.salary*0.10;
        }
        if(hesapYil> 19 ){
            this.maasHesapArtisi=this.salary*0.15;
        }

       /* Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.*/
    }

    public void toStringPrint(){

        System.out.println("=========================");
        System.out.println("Çalışanın adı ve soyadı : " + this.name);
        System.out.println("Çalışanın maaşı : " + this.salary);
        System.out.println("Haftalık çalışma saati: " + this.workHours);
        System.out.println("İşe başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi Tutarı: " +this.vergiTutari);
        System.out.println("Bonus Ücreti: " +this.bonusUcret);
        System.out.println("Bonus Ücreti: " +this.maasHesapArtisi);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " +(this.salary+this.bonusUcret-this.vergiTutari));
        System.out.println("Toplam Maaş  : " +(this.salary+this.bonusUcret+this.maasHesapArtisi-this.vergiTutari));

    }
}
