package day01_variables;

import java.util.Scanner;

public class C5_Variables4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int sayi1=10;
int sayi2=4;
double sayi3=4;
System.out.println(sayi1/sayi2);

System.out.println(sayi1/sayi3);

Scanner scan = new Scanner(System.in);
System.out.println("****Toplama Islemi*****\n");
System.out.print("Lutfen ilk sayiyi giriniz = ");
int s1 = scan.nextInt();
System.out.print("\nLutfen ikinci sayiyi giriniz = ");
int s2 = scan.nextInt();
System.out.print("\nToplama Isleminin Sonucu = "+(s1+s2));

Scanner scan = new Scanner(System.in);
System.out.println("****Kayit Programi*****\n");
System.out.print("Lutfen isminizi yaziniz : ");
String isim = scan.nextLine();
System.out.print("\nLutfen soyisminizi yaziniz : ");
String soyisim = scan.nextLine();
System.out.print("\nIsminiz : "+isim+"\nSoyisminiz : "+soyisim+"\nKaydiniz basari ile alinmistir...." );

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen isminizi yaziniz : ");
		String isim = scan.nextLine();
		System.out.println("Isminizin bas harfi : "+isim.charAt(0)+"'dir.");
		
		Scanner scan= new Scanner(System.in);
		System.out.println("***Dikdortgenler Prizmasi Hacim Hesaplama***\n");
		System.out.print("Lutfen yuksekligi cm cinsinden yaziniz = ");
		int yukseklik = scan.nextInt();
		System.out.print("Lutfen en i cm cinsinden yaziniz = ");
		int en = scan.nextInt();
		System.out.print("Lutfen boyu cm cinsinden yaziniz = ");
		int boy = scan.nextInt();
		System.out.println("Prizmanin hacmi = "+(yukseklik*en*boy)+" cm2 dir.");
		
		byte b1 = 15;
		short s= b1;
		int i=b1;
		long l= b1;
		float f=b1;
		double d= b1;
		System.out.println("Short deger = "+s+"\nInteger deger = "+i+"\nLong deger = "+l+"\nFloat deger = "+f+"\nDouble deger = "+d);
		
		int i1= 19;
		short s1= (short)i1;
		byte b2 = (byte)i1;
		System.out.println("Short deger = "+s1+"\nByte deger = "+b2);
		
		
		float f5 = 3.54321f;
		System.out.println(f5);
		
		double d5= 255.36;
		int into = (int)d5;
		byte b65= (byte)into;
		System.out.println(b65);
		
		int y8 = 34;
		double y9= 5;
		y8 = y8+6;
		y8= y8/5;
		y8++;
		y8--;
		y8+=5;
		y8-=9;
		y8*=4;
		y8/=3;
		
		
		y8= (int)Math.pow(y9, y9);
		System.out.println(y8);
		*/
		System.out.println("** MOD ALMA PROGRAMI **");
		System.out.print("\nModunu almak istediginiz sayiyi yaziniz = ");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		System.out.print("Hangi moda gore almak istediginizi giriniz = ");
		int mod = scan.nextInt();
		System.out.println(sayi+" sayisinin mod("+mod+") gore sonucu "+(sayi%mod)+" 'dur");
		
		if (2==1) {
			System.out.println("aaaa");
			
			
			
			
			
		}

		int n1=10, n2=20, n3=30;
		System.out.println();
	}

}

