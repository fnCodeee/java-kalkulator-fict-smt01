import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    // variable
    int operator_input;
    double angka1, angka2, hasil = 0;
    char lanjut_nggak = 'y';
    //Input : Scanner
    Scanner input = new Scanner(System.in);

    // Fungsi ulangi program:
    while(lanjut_nggak == 'y') {
      System.out.println("=== Kalkulator Sederhana ===\n");
    System.out.println("Pilihan Operator:\n1. Perkalian\n2. Pembagian\n3. Penjumlahan\n4. Pengurangan\n5. Modulus");

    System.out.print("input Operator: ");
    operator_input = input.nextInt();

    // aangka pertama
    if(operator_input >= 1 && operator_input <= 5) {
          System.out.print("input angka pertama: ");
    angka1 = input.nextInt();

    // aangka kedua
    System.out.print("input angka kedua: ");
    angka2 = input.nextInt();

    //Switch
    switch(operator_input) {
      case 1:
        hasil = angka1 * angka2;
        break;
      case 2:
        if(angka2 == 0) {
          System.out.println("\nTidak terdefinisi!\n");
          return;
        } else {
          hasil = angka1 / angka2;
        }
        break;
      case 3:
        hasil = angka1 + angka2;
        break;
      case 4:
        hasil = angka1 - angka2;
        break;
      case 5:
        if(angka2 == 0) {
          System.out.println("\nTidak terdefinisi!\n");
          return;
        } else {
          hasil = angka1 % angka2;
        }
        break;
    }
      System.out.printf("\nHasil: %.1f\n", hasil);
    } else {
        System.out.println("\nTidak Ada Operator!\n");
    }

      System.out.print("\nApakah anda ingin mengulangi program? (y/n): ");
      lanjut_nggak = input.next().charAt(0);
    }
  }
}