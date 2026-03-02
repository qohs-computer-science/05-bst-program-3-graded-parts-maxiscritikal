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
    testCase3.add(5);
    testCase3.add(3);
    testCase3.add(2);
    testCase3.add(7);
    testCase3.add(7);
    testCase3.add(6);
    testCase3.add(8);
    testCase3.printInOrder();
    System.out.println(testCase3.delete(7));
    testCase3.printPreOrder();
    System.out.println("");
    testCase3.printPostOrder();
    System.out.println("");
    System.out.println(testCase3.delete(5));
    testCase3.printPreOrder();
    System.out.println("");
    testCase3.printPostOrder();
  }
}