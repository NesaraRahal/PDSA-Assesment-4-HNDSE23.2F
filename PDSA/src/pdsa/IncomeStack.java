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
        new_node.ID = completedID;
        new_node.serviceIncome = RepairCharge;
        new_node.date = completedDate;
        
        if(top != null){
            new_node.Next = top;
            top.Prev = new_node;
        }
        top = new_node;
    }
    
    public void tempDisplay(){
        System.out.println(top.ID);
    }
    
    public String popType(){
        if(isEmpty() == true){
            System.err.println("No more serviced vehicles to pop");
        }else{
            String popType = top.type;
            
            if(top != null){
                top.Prev = null;
            }
            return popType;
        }
        return null;
    }
    
    
        public String popModel(){
        if(isEmpty() == true){
           // System.err.println("No more serviced vehicles to pop");
        }else{
            String popModel = top.model;
           return popModel;
        }
        return null;
    }
        
    public String popNo(){
        if(isEmpty() == true){
          //  System.err.println("No more serviced vehicles to pop");
        }else{
            String popNo = top.No;
           return popNo;
        }
        return null;
    }
    
    public int popID(){
        if(isEmpty() == true){
            //System.err.println("No more serviced vehicles to pop");
        }else{
           int popID = top.ID;
           return popID;
        }
        return 0;
    }
    
    public double popServiceCost(){
        if(isEmpty() == true){
          //  System.err.println("No more serviced vehicles to pop");
        }else{
           double popCost = top.serviceIncome;
           return popCost;
        }
        return 0;
    }
    
    public String popCompletedDate(){
        if(isEmpty() == true){
           // System.err.println("No more serviced vehicles to pop");
        }else{
           String popDate = top.date;
           top = top.Next;
           return popDate;
        }
        return null;
    }
    
    
    
}
