private static class Node{
      int data;
      ArrayList<Node> children;
      
      Node(int data){
          this.data = data;
          this.children = new ArrayList<>();
      }
      
      Node(){
          this.data = 0;
          this.children = new ArrayList<>();
      }
  }

public static Node contruct(int[] arr){
  Node root;
  Stack<Node> stk= new stack<>();
  for(int i=0; i<arr.length; i++){
    if(arr[i]==-1){// end of child makers node
      stk.pop();// postorder(child -> parent)
    }else{
      //1. Creation of node
      Node curr= new Node(arr[i]);

      if(stk.size()==0){
        //current Node is the root Node (Root has no parent)
        root=curr;
      }else{
        //2. Make current Node as child of parents
        stk.peek().children.add(curr);
      }
      //3.preorder (push curr node in stack)
      stk.push(curr);
    }
    return root;

  }
}

public static void display(Node root) {
      if(root == null) return;
      
      // Meeting Expectation
      print(root);
      
      // faith
      for(Node child: root.children){
            display(child);
      }
  }
