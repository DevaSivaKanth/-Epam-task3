import java.util.*;
public class CycleDetection {
	public class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
	
	public boolean hasCycle(SinglyLinkedListNode head) {
        HashSet<SinglyLinkedListNode> h=new HashSet<SinglyLinkedListNode>();
        if(head==null)
        {
            return false;
        }
        while(head!=null)
        {
            if(h.contains(head))
            {
                return true;
            }
            h.add(head);
            head=head.next;
        }
        return false;
	}
}
