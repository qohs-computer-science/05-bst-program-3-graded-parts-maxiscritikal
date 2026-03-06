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
    System.out.println("Test Case 1 Empty tree");
    testCase1();

    System.out.println("Test Case 2 Add and find");
    testCase2();

    System.out.println("Test Case 3 Delete leaf");
    testCase3();

    System.out.println("Test Case 4 Delete node with one child");
    testCase4();

    System.out.println("Test Case 5 Delete node with two children");
    testCase5();

    System.out.println("Test Case 6 Root operations");
    testCase6();

    System.out.println("Test Case 7 Replace");
    testCase7();

    System.out.println("Test Case 8 Lots of operations");
    testCase8();
  }//end main

  public static void testCase1()
  {
    BST bst = new BST();
    System.out.println("Empty: " + bst.isEmpty());
    System.out.println("Size: " + bst.size());
    System.out.println("Find A: " + bst.find("a"));
    System.out.println("Delete A: " + bst.delete("a"));
    bst.printInOrder();
    System.out.println();
  }//end testCase1

  public static void testCase2()
  {
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("c");
    System.out.println("Size: " + bst.size());
    System.out.println("Find A: " + bst.find("a"));
    System.out.println("Find B: " + bst.find("b"));
    System.out.println("Find C: " + bst.find("c"));
    System.out.println("Find D: " + bst.find("d"));
    bst.printInOrder();
    System.out.println();
  }//end testCase2

  public static void testCase3()
  {
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("c");
    System.out.println("Before delete:");
    bst.printInOrder();
    System.out.println("Delete A: " + bst.delete("a"));
    System.out.println("After delete:");
    bst.printInOrder();
    System.out.println("Size: " + bst.size());
    System.out.println();
  }//end testCase3

  public static void testCase4()
  {
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("d");
    bst.add("c");
    System.out.println("Before delete:");
    bst.printInOrder();
    System.out.println("Delete D: " + bst.delete("d"));
    System.out.println("After delete:");
    bst.printInOrder();
    System.out.println();
  }//end testCase4

  public static void testCase5()
  {
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("d");
    bst.add("c");
    bst.add("e");
    System.out.println("Before delete:");
    bst.printInOrder();
    System.out.println("Delete D: " + bst.delete("d"));
    System.out.println("After delete:");
    bst.printInOrder();
    System.out.println();
  }//end testCase5

  public static void testCase6()
  {
    BST bst = new BST();
    bst.add("m");
    bst.add("h");
    bst.add("t");
    bst.add("c");
    bst.add("k");
    bst.add("p");
    bst.add("z");

    System.out.println("Before root testing:");
    bst.printInOrder();

    System.out.println("Delete root M: " + bst.delete("m"));
    System.out.println("After deleting root:");
    bst.printInOrder();

    System.out.println("Replace current root H with R: " + bst.replace("h", "r"));
    System.out.println("After replacing root:");
    bst.printInOrder();

    System.out.println("Find H: " + bst.find("h"));
    System.out.println("Find R: " + bst.find("r"));
    System.out.println();
  }//end testCase6

  public static void testCase7()
  {
    BST bst = new BST();
    bst.add("b");
    bst.add("a");
    bst.add("c");
    System.out.println("Before replace:");
    bst.printInOrder();
    System.out.println("Replace A with Z: " + bst.replace("a", "z"));
    System.out.println("After replace:");
    bst.printInOrder();
    System.out.println("Find A: " + bst.find("a"));
    System.out.println("Find Z: " + bst.find("z"));
    System.out.println("Replace X with Y: " + bst.replace("x", "y"));
    System.out.println("Find Y after failed replace: " + bst.find("y"));
    bst.printInOrder();
    System.out.println();
  }//end testCase7

  public static void testCase8()
  {
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
    System.out.println("InOrder:");
    bst.printInOrder();
    System.out.println("PreOrder:");
    bst.printPreOrder();
    System.out.println("PostOrder:");
    bst.printPostOrder();
    System.out.println("Size: " + bst.size());
    System.out.println("Empty: " + bst.isEmpty());
    bst.delete("R");
    System.out.println("After delete R");
    bst.printInOrder();
    bst.replace("A", "Z");
    System.out.println("After replace A with Z");
    bst.printInOrder();
    System.out.println();
  }//end testCase8
}//end BSTTester