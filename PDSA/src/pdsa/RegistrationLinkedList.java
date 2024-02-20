/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdsa;

/**
 *
 * @author User
 */
public class RegistrationLinkedList {
    Node head;
    
    public RegistrationLinkedList(){
        head = null;
    }
    
    public void insertDetails(String type, String model, String no, int id){
        if(head == null){
            Node new_node = new Node();
            new_node.type = type;
            new_node.model = model;
            new_node.No = no;
            new_node.ID = id;
            
            head = new_node;
        }else{
             Node new_node = new Node();
            new_node.type = type;
            new_node.model = model;
            new_node.No = no;
            new_node.ID = id;
            
            Node current = head;
            
            while(current.Next != null){
                current = current.Next;
            }
            
            current.Next = new_node;
            new_node.Prev = current;
            
        }
    }
    
    public void display(){
        Node current_node = head;
		
		while(current_node != null) {
			System.out.println("Vehicle Type: " + current_node.type);
                        System.out.println("Vehicle Model: " + current_node.model);
                        System.out.println("Vehicle No: " + current_node.No);
                        System.out.println("Vehicle ID: " + current_node.ID);
			current_node = current_node.Next;
		}
    }
    
 
        
        
}
