/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasi_2_Contoh_Polymorphism;

/**
 *
 * @author anonymous
 */
public class EmailNotification implements InterfaceNotifikasi {
   
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Send email to " + receiver + " about : " + content);
    }
    
}
