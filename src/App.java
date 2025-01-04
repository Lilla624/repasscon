/*
* File: App.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Refactored: Varga Lilla, 2025-01-04
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
nevjegy();

System.out.println("Jelszavak");

System.out.println("Verzió: 0.0.1");

Scanner scanner = new Scanner(System.in);

System.out.print("Felhasználónév: ");
String username = scanner.nextLine();
System.out.print("Jelszó: ");
String password = scanner.nextLine();
System.out.print("Hely: ");
String place = scanner.nextLine();
scanner.close();

int Siker = 0;
try {
    Store store = new Store(username, password, place);
    FileWriter fileWriter = new FileWriter("passwords.txt");
    PrintWriter printWriter = new PrintWriter(fileWriter);
    if(store.getPassword() != null) {
        printWriter.print("Felhasználónév: " + store.getUsername() + ", "); 
        printWriter.print("Jelszó: " + store.getPassword() + ", ");
        if (!store.getPlace().isEmpty()) {
            printWriter.print("Hely: " + store.getPlace());
        }
    }
    printWriter.close();
    Siker = 1;
} catch (IOException e) {
    System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
}

if(Siker == 1) { 
    System.out.println("Ok. A kiírás sikeres.");  
    }else { 
    System.out.println("Hiba! A kiírás sikertelen."); 
    }
}

public static void nevjegy() {
System.out.println("Varga Lilla");
}
}
