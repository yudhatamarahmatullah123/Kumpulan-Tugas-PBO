/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_2_Contoh_Polymorphism;

/**
 *
 * @author anonymous
 */
public class Main {
    
    public static void main(String[] args) {
        String gmail       = "yudhatamarahmatullah123@gmail.com";
        String phoneNumber = "085796740896";
        String country     = "Indonesia";
        
        EmailNotification emailNotif = new EmailNotification();
        SMSNotification   smsNotif   = new SMSNotification();
        PushNotification  pushNotif  = new PushNotification();
        
        String message     = "Hello World ! ";
        
        emailNotif.sendMessage(gmail, message);
        smsNotif.sendMessage(phoneNumber, message);
        pushNotif.sendMessage(country, message);
    }
    
}
