package pdsa;

import javax.swing.JOptionPane;

public class ServiceQueue {
    RegistrationLinkedList rl;
    Node rear;
    Node front;

    public ServiceQueue() {
        rl = new RegistrationLinkedList();
        rear = null;
        front = null;
    }

    public boolean isEmpty() {
        return rear == front && front == null;
    }



    public void serviceEnqueue(String vType, String VModel, String VNo, int VID) {
        rl.insertDetails(vType, VModel, VNo, VID);
        if (rear == null) {
            rear = rl.head;
            front = rl.head;
        } else {
            rear = rear.Next;
        }
    }
    

    public void display() {
        rl.display();
    }

    public String returningRegType() {
        front = rl.head;
        if (!isEmpty()) {
            return front.type;
        }
        return null;
    }
    
    

    public String returningRegModel() {
        if (!isEmpty()) {
            return front.model;
        }
        return null;
    }

    public String returningRegNo() {
        if (!isEmpty()) {
            return front.No;
        }
        return null;
    }

    public int returningRegID() {
        if (!isEmpty()) {
            return front.ID;
        }
        return -1; // Return a default value indicating no valid ID
    }
    
    

    public String serviceApprovedType() {
        if (!isEmpty()) {
            if (front.Next != null) {
                front = front.Next;
                return front.type;
            } else {
                System.out.println("No more vehicles in the queue.");
            }
        }
        return null;
    }

    public String serviceApprovedTypeLeft() {
        if (!isEmpty() && front.Prev != rl.head.Prev) {
            front = front.Prev;
            return front.type;
        } else {
            System.out.println("No previous node available.");
        }
        return null;
    }

    public String serviceApprovedModel() {
        if (!isEmpty()) {
            return front.model;
        }
        return null;
    }

    public String serviceApprovedNo() {
        if (!isEmpty()) {
            return front.No;
        }
        return null;
    }

    public int serviceApprovedID() {
        if (!isEmpty()) {
            return front.ID;
        }
        return -1; // Return a default value indicating no valid ID
    }
}
