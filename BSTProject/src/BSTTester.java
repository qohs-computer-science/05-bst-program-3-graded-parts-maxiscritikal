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
  }
}