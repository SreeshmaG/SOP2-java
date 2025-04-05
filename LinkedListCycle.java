public class LinkedListCycle{
public static void main(String[]args){
newNode temp = new NOde;
int temp = head;
int slow = head;
int fast = head;
while(fast != null && fast.next != null){
slow = slow.next;
fast = fast.ext.next;
if(slow == fast){
return true
}
}
return false;
}
}
