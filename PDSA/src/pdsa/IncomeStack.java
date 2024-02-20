/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdsa;

/**
 *
 * @author User
 */
public class IncomeStack {
    Node top;
    
    public IncomeStack(){
        top = null;
    }
    
    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void push(String completedType, String completedModel, String completedNo, int completedID, double RepairCharge, String completedDate){     
        Node new_node = new Node();
        new_node.type = completedType;
        new_node.model = completedModel;
        new_node.No = completedNo;
        new_node.serviceIncome = RepairCharge;
        new_node.date = completedDate;
        
        if(top != null){
            new_node.Next = top;
            top.Prev = new_node;
        }
        new_node = top;
    }
}
