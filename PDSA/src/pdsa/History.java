/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdsa;

/**
 *
 * @author User
 */
public class History {
    Node head;
    
    public History(){
        head = null;
    }
    //Creating a new linkedlist to store Income
    public void insertHistory(String historyType, String historyModel, String historyNo, int historyID, double historyIncome, String historyDate){
        if(head == null){
            Node new_node = new Node();
            new_node.type = historyType;
            new_node.model = historyModel;
            new_node.No = historyNo;
            new_node.ID = historyID;
            new_node.serviceIncome = historyIncome;
            new_node.date = historyDate;
            head = new_node;
        }else{
            Node new_node = new Node();
            new_node.type = historyType;
            new_node.model = historyModel;
            new_node.No = historyNo;
            new_node.ID = historyID;
            new_node.serviceIncome = historyIncome;
            new_node.date = historyDate;
            
            Node current = head;
            while(current.Next !=null){
                current = current.Next;
            }
            
            current.Next = new_node;
            new_node.Prev = current;
            
        }
    }
    
    public String returninHisotryType(){
        return head.type;
    }
    
    public String returninHisotryModel(){
        return head.model;
    }
    
    public String returninHisotryNo(){
        return head.No;
    }
    
    public int returninHisotryID(){
        return head.ID;
    }
    
    public double returninHisotryIncome(){
        return head.serviceIncome;
    }
    
    public String returninHisotryDate(){
        return head.date;
    }
    
    public String nextHistoryType(){
        if(head.Next!= null){
            head = head.Next;
            return head.type;
        }else{
            return null;
        }

    }
    
    public String prevHistoryType(){
        if(head.Prev != null){
            head = head.Prev;
            return head.type;
        }else{
            return null;
        }
    }
    
}
