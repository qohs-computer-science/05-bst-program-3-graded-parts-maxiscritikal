/*
 * Max Korsa 
 * 2/25/26
 * PD: 6
 * Creates a BST Tester File With Many Scenarios To Check Your Epic Program.
 */
 import java.lang.Comparable;
 public class BSTTester 
{
  public static void main(String[] args) 
  {
    System.out.println("Test Case 1:");
    System.out.println("");
    System.out.println("");
    BST testCase1 = new BST();
    testCase1.add(5);
    testCase1.add(3);
    testCase1.add(1);
    testCase1.add(2);
    testCase1.add(5);
    testCase1.add(4);
    testCase1.add(7);
    testCase1.printInOrder();
    System.out.println(testCase1.find(5));
    System.out.println(testCase1.find(77));
    System.out.println(testCase1.find(6));
    System.out.println(testCase1.delete(5));
    testCase1.printInOrder();
    System.out.println(testCase1.delete(5));
    testCase1.printInOrder();
    System.out.println(testCase1.delete(5));
    testCase1.printInOrder();

    System.out.println("");
    System.out.println("");
    System.out.println("Test Case 2:");
    System.out.println("");
    System.out.println("");
    BST testCase2 = new BST();
    System.out.println(testCase2.delete(5));
    testCase2.printInOrder();

    System.out.println("");
    System.out.println("");
    System.out.println("Test Case 3:");
    System.out.println("");
    System.out.println("");
    BST testCase3 = new BST();
    testCase3.add("P");
    testCase3.add("G");
    testCase3.add("C");
    testCase3.add("B");
    testCase3.add("G");
    testCase3.add("K");
    testCase3.add("N");
    testCase3.add("L");
    testCase3.add("T");
    testCase3.add("S");
    testCase3.add("Q");
    testCase3.add("U");
    testCase3.printPreOrder();
    System.out.println(testCase3.delete("B"));
    System.out.println(testCase3.delete("S"));
    testCase3.printPostOrder();
    System.out.println("");
    System.out.println(testCase3.delete("K"));
    testCase3.printInOrder();

    BST testCase4 = new BST();
    testCase4.add(5);
    testCase4.add(4);
    testCase4.add(2);
    testCase4.add(3);
    testCase4.add(1);
    testCase4.add(6);
    testCase4.add(7);
    testCase4.add(10);
    testCase4.add(8);
    testCase4.add(9);
    testCase4.printPreOrder();
    System.out.println("");
    testCase4.printPostOrder();
    System.out.println(testCase4.delete(5));
    testCase4.printPreOrder();
    System.out.println("");
    testCase4.printPostOrder();

    BST testCase5 = new BST();
    System.out.println("");
    System.out.println("");
    System.out.println("Testing Size");
    System.out.println("");
    testCase5.add(6);
    testCase5.add(7);
    testCase5.add(4);
    testCase5.add(5);
    testCase5.add(1);
    System.out.println(testCase5.size());
  }
}