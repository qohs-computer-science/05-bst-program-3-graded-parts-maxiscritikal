/*
 * Max Korsa 
 * 2/25/26
 * PD: 6
 * Creates a BST Tester File With Many Scenarios To Check Your Epic Program.
 */
 public class BSTTester 
{
  public static void main(String[] args) 
  {
    testCase1();
    testCase2();
    testCase3();
    testCase4();
    testCase5();
    testCase6();
    testCase7();
  }

  public static void testCase1() {
    // Test empty tree
    BST bst = new BST();
    System.out.println("Test Case 1: Empty tree");
    System.out.println("isEmpty(): " + bst.isEmpty());
    System.out.println("size(): " + bst.size());
    System.out.println("find(\"a\"): " + bst.find("a"));
    System.out.println("delete(\"a\"): " + bst.delete("a"));
    bst.printInOrder();
    System.out.println();
  }

  public static void testCase2() {
    // Test add and find
    BST bst = new BST();
    System.out.println("Test Case 2: Add and find");
    bst.add("b");
    bst.add("a");
    bst.add("c");
    System.out.println("size(): " + bst.size());
    System.out.println("find(\"a\"): " + bst.find("a"));
    System.out.println("find(\"b\"): " + bst.find("b"));
    System.out.println("find(\"c\"): " + bst.find("c"));
    System.out.println("find(\"d\"): " + bst.find("d"));
    bst.printInOrder();
    System.out.println();
  }

  public static void testCase3() {
    // Test delete leaf
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("c");
    System.out.println("Test Case 3: Delete leaf");
    System.out.println("Before delete:");
    bst.printInOrder();
    System.out.println("delete(\"a\"): " + bst.delete("a"));
    System.out.println("After delete:");
    bst.printInOrder();
    System.out.println("size(): " + bst.size());
    System.out.println();
  }

  public static void testCase4() {
    // Test delete node with one child
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("d");
    bst.add("c");
    System.out.println("Test Case 4: Delete node with one child");
    System.out.println("Before delete:");
    bst.printInOrder();
    System.out.println("delete(\"d\"): " + bst.delete("d"));
    System.out.println("After delete:");
    bst.printInOrder();
    System.out.println();
  }

  public static void testCase5() {
    // Test delete node with two children
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("d");
    bst.add("c");
    bst.add("e");
    System.out.println("Test Case 5: Delete node with two children");
    System.out.println("Before delete:");
    bst.printInOrder();
    System.out.println("delete(\"d\"): " + bst.delete("d"));
    System.out.println("After delete:");
    bst.printInOrder();
    System.out.println();
  }

  public static void testCase6() {
    // Test replace
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("c");
    System.out.println("Test Case 6: Replace");
    System.out.println("Before replace:");
    bst.printInOrder();
    System.out.println("replace(\"a\", \"z\"): " + bst.replace("a", "z"));
    System.out.println("After replace:");
    bst.printInOrder();
    System.out.println("find(\"a\"): " + bst.find("a"));
    System.out.println("find(\"z\"): " + bst.find("z"));
    System.out.println("replace(\"x\", \"y\"): " + bst.replace("x", "y"));
    bst.printInOrder();
    System.out.println();
  }

  public static void testCase7() {
    // Test all print methods and comprehensive operations with ORCHARD QUINCE letters
    BST bst = new BST();
    bst.add("O");
    bst.add("R");
    bst.add("C");
    bst.add("H");
    bst.add("A");
    bst.add("R");
    bst.add("D");
    bst.add("Q");
    bst.add("U");
    bst.add("I");
    bst.add("N");
    bst.add("C");
    bst.add("E");
    System.out.println("Test Case 7: All prints and operations with ORCHARD QUINCE letters");
    System.out.println("InOrder:");
    bst.printInOrder();
    System.out.println("PreOrder:");
    bst.printPreOrder();
    System.out.println("PostOrder:");
    bst.printPostOrder();
    System.out.println("size(): " + bst.size());
    System.out.println("isEmpty(): " + bst.isEmpty());
    bst.delete("R");
    System.out.println("After delete 'R':");
    bst.printInOrder();
    bst.replace("A", "Z");
    System.out.println("After replace 'A' with 'Z':");
    bst.printInOrder();
    System.out.println();
  }
}