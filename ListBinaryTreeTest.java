/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.joshuacappella.binarytree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua Cappella
 */
public class ListBinaryTreeTest {
    
    public ListBinaryTreeTest() {
    }

    /**
     * Test of root method, of class ListBinaryTree.
     */
    @Test
    public void testRoot() {
        System.out.println("root");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        Object expResult = 0;
        Object result = t.root().element();
        assertEquals(expResult, result);
    }

    /**
     * Test of leftChild method, of class ListBinaryTree.
     */
    @Test
    public void testLeftChild() {
        System.out.println("leftChild");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        Position pos = t.root();
        Object expResult = 1;
        Object result = t.leftChild(pos).element();
        assertEquals(expResult, result);
    }

    /**
     * Test of rightChild method, of class ListBinaryTree.
     */
    @Test
    public void testRightChild() {
        System.out.println("rightChild");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        Position pos = t.root();
        Object expResult = 2;
        Object result = t.rightChild(pos).element();
        assertEquals(expResult, result);
    }

    /**
     * Test of sibling method, of class ListBinaryTree.
     */
    @Test
    public void testSibling() {
        System.out.println("sibling");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        Position pos = t.root();
        Object expResult = 2;
        pos = t.leftChild(pos);
        Object result = t.sibling(pos).element();
        assertEquals(expResult, result);
    }

    /**
     * Test of parent method, of class ListBinaryTree.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        Position pos = t.root();
        Object expResult = 4;
        pos = t.leftChild(pos);
        pos = t.rightChild(pos);
        pos = t.leftChild(pos);
        Object result = t.parent(pos).element();
        assertEquals(expResult, result);
    }

    /**
     * Test of isInternal method, of class ListBinaryTree.
     */
    @Test
    public void testIsInternal() {
        System.out.println("isInternal");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        Position pos = t.root();
        boolean expResult = false;
        pos = t.leftChild(pos);
        pos = t.rightChild(pos);
        pos = t.leftChild(pos);
        boolean result = t.isInternal(pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of isExternal method, of class ListBinaryTree.
     */
    @Test
    public void testIsExternal() {
        System.out.println("isExternal");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        Position pos = t.root();
        boolean expResult = true;
        pos = t.leftChild(pos);
        pos = t.rightChild(pos);
        pos = t.leftChild(pos);
        boolean result = t.isExternal(pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of isRoot method, of class ListBinaryTree.
     */
    @Test
    public void testIsRoot() {
        System.out.println("isRoot");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        Position pos = t.root();
        boolean expResult = true;
        pos = t.leftChild(pos);
        pos = t.parent(pos);
        boolean result = t.isRoot(pos);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class ListBinaryTree.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        int expResult = 11;
        int result = t.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class ListBinaryTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        boolean expResult = false;
        boolean result = t.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of leftChild method's InvalidPositionException, of class ListBinary
     * Tree.
     */
    @Test
    public void testInvalidPositionException1() throws InvalidPositionException{
        System.out.println("Test of InvalidPositionException in left child.");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        InvalidPositionException thrown = assertThrows(
           InvalidPositionException.class,
                () -> t.leftChild(null));
        assertTrue(thrown.getMessage().contentEquals("This position "
                + "does not exist, so it has no left child."));
    }
    
    /**
     * Test of rightChild method's InvalidPositionException, of class ListBinary
     * Tree.
     */
    @Test
    public void testInvalidPositionException2() throws InvalidPositionException{
        System.out.println("Test of InvalidPositionException in right child.");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        InvalidPositionException thrown = assertThrows(
           InvalidPositionException.class,
                () -> t.rightChild(null));
        assertTrue(thrown.getMessage().contentEquals("This position "
                + "does not exist, so it has no right child."));
    }
    
    /**
     * Test of sibling method's InvalidPositionException, of class ListBinary
     * Tree.
     */
    @Test
    public void testInvalidPositionException3() throws InvalidPositionException{
        System.out.println("Test of InvalidPositionException in sibling.");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        InvalidPositionException thrown = assertThrows(
           InvalidPositionException.class,
                () -> t.sibling(null));
        assertTrue(thrown.getMessage().contentEquals("This position "
                + "does not exist, so it has no sibling."));
    }
    
    /**
     * Test of parent method's InvalidPositionException, of class ListBinary
     * Tree.
     */
    @Test
    public void testInvalidPositionException4() throws InvalidPositionException{
        System.out.println("Test of InvalidPositionException in parent.");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        InvalidPositionException thrown = assertThrows(
           InvalidPositionException.class,
                () -> t.parent(null));
        assertTrue(thrown.getMessage().contentEquals("This position "
                + "does not exist, so it has no parent."));
    }
    
    /**
     * Test of inInternal method's InvalidPositionException, of class ListBinary
     * Tree.
     */
    @Test
    public void testInvalidPositionException5() throws InvalidPositionException{
        System.out.println("Test of InvalidPositionException in isInternal.");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        InvalidPositionException thrown = assertThrows(
           InvalidPositionException.class,
                () -> t.isInternal(null));
        assertTrue(thrown.getMessage().contentEquals("Position does not"
                    + " exist, so it is not an internal node."));
    }
    
    /**
     * Test of isExternal method's InvalidPositionException, of class ListBinary
     * Tree.
     */
    @Test
    public void testInvalidPositionException6() throws InvalidPositionException{
        System.out.println("Test of InvalidPositionException in isExternal.");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        InvalidPositionException thrown = assertThrows(
           InvalidPositionException.class,
                () -> t.isExternal(null));
        assertTrue(thrown.getMessage().contentEquals("Position does not"
                    + " exist, so it is not an external node."));
    }
    
    /**
     * Test of isRoot method's InvalidPositionException, of class ListBinary
     * Tree.
     */
    @Test
    public void testInvalidPositionException7() throws InvalidPositionException{
        System.out.println("Test of InvalidPositionException in isRoot.");
        ListBinaryTree t = new ListBinaryTree();
        t.fillTree();
        InvalidPositionException thrown = assertThrows(
           InvalidPositionException.class,
                () -> t.isRoot(null));
        assertTrue(thrown.getMessage().contentEquals("Position does not"
                    + " exist, so it is not the tree root."));
    }
    
    /**
     * Test of root method's EmptyTreeException, of class ListBinary
     * Tree.
     */
    @Test
    public void testEmptyTreeException() throws InvalidPositionException{
        System.out.println("Test of InvalidPositionException in isRoot.");
        ListBinaryTree t = new ListBinaryTree();
        EmptyTreeException thrown = assertThrows(
           EmptyTreeException.class,
                () -> t.root());
        assertTrue(thrown.getMessage().contentEquals("The tree is "
                + "empty, so there is no root."));
    }
}