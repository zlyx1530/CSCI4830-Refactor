package q1.extract_method.refactored;

import java.util.List;

abstract class Item {
    String name;

    public boolean contains(String p) {
        return name.contains(p);
    }

    public abstract void process();
}

public class A {
   Node m1(List<Node> nodes, String p) {
	  extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  extractedMethod(edgeList, p);
      return null;
   }

   void extractedMethod(List<? extends Item> items, String p) {
       for (Item item : items) {
           if (item.contains(p)) {
               item.process();
           }
       }
   }
}

class Node extends Item {
    @Override
    public void process() {
        System.out.println(this);
    }
}

class Edge extends Item {
    @Override
    public void process() {
        System.out.println(this);
    }
}