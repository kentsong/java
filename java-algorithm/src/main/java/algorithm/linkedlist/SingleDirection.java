package algorithm.linkedlist;

/**
 * 單向鏈表
 */


public class SingleDirection {


    public static void main(String[] args) {

        MyLink link = new MyLink();

        link.addNode(1);
        link.addNode(2);
        link.addNode(3);

        link.printAllNode();
        link.reverse();
        link.printAllNode();

        System.out.println("length = " + link.length());

    }


    public static class MyLink {

        private Node head = null;

        class Node {
            Node next;
            int data;

            public Node(int data) {
                this.data = data;
            }

            public int getData() {
                return data;
            }
        }


        public void addNode(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                System.out.println("---add Head");
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = head.next;
            }

            System.out.println("---add Node");
            temp.next = newNode;
        }

        public Node getHead() {
            return head;
        }

        public int length(){
            Node tmp = head;

            int length = 0;
            while(tmp != null){
                length++;
                tmp = tmp.next;
            }

            return length;
        }

        public void printAllNode() {
            Node temp = head;

            StringBuilder sb = new StringBuilder();

            while (temp != null)
            {
                sb.append(temp.data + ",");
                temp = temp.next;
            }

            System.out.println(sb.toString());
        }

        /** 倒序 reverse sorting **/
        public Node reverse(){

            Node pReversedNode = null; //倒序結果
            Node pNode = head; //原head
            Node pPrev = null; //暫存用

            while(pNode != null){

                Node next = pNode.next;

                if (next == null) {
                    pReversedNode = pNode;
                }

                pNode.next = pPrev;
                pPrev = pNode;
                pNode = next;
            }


            this.head = pReversedNode;
            return this.head;
        }
    }

}
