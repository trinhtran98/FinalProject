package CarFinal;

public class LinkList {
	
	Car head; // head of list 
	  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Car { 
  
    	String maker;
    	String bodyType;
    	String name;
    	String modelYear;
    	String color;
        String registrationNumber; 
        Car next; 
  
        // Constructor 
        Car(String makerA, String bodyTypeA, String nameA, String modelYearA, String colorA, String registrationNumberA) 
        { 
            maker = makerA;
            bodyType = bodyTypeA;
            name = nameA;
            modelYear = modelYearA;
            color = colorA;
            registrationNumber = registrationNumberA;
            next = null; 
        } 
    } 
      
    // Method to insert a new node 
    public LinkList insert(LinkList list, String makerB, String bodyTypeB, String nameB, String modelYearB, String colorB, String registrationNumberB) 
    { 
        // Create a new node with given data 
        Car new_node = new Car(makerB, bodyTypeB, nameB, modelYearB, colorB, registrationNumberB); 
        new_node.next = null; 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Car last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
   
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public void printList(LinkList list) 
    { 
        Car currNode = list.head; 
  
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.println(currNode.maker + ", " + currNode.bodyType + ", " + currNode.name + ", " + currNode.modelYear + ", " + currNode.color + ", " + currNode.registrationNumber); 
  
            // Go to next node 
            currNode = currNode.next; 
        } 
    }

}
