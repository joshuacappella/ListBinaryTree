package com.joshuacappella.binarytree;



public class ListBinaryTree implements BinaryTree {
    
    STNode root;
    int size = 0;
    
    /**
     *
     */
    public void fillTree() {
        root = new STNode(new Integer(0), null, null, null);
        STNode node1 = new STNode(new Integer(1), root, null, null);
        STNode node2 = new STNode(new Integer(2), root, null, null);
        root.setLeftChild(node1);
        node1.setSibling(node2);

        STNode node3 = new STNode(new Integer(3), node1, null, null);
        STNode node4 = new STNode(new Integer(4), node1, null, null);
        node1.setLeftChild(node3);
        node3.setSibling(node4);

        STNode node5 = new STNode(new Integer(5), node2, null, null);
        STNode node6 = new STNode(new Integer(6), node2, null, null);
        node2.setLeftChild(node5);
        node5.setSibling(node6);

        STNode node7 = new STNode(new Integer(7), node3, null, null);
        STNode node8 = new STNode(new Integer(8), node3, null, null);
        node3.setLeftChild(node7);
        node7.setSibling(node8);

        STNode node9 = new STNode(new Integer(9), node4, null, null);
        STNode node10 = new STNode(new Integer(10), node4, null, null);
        node4.setLeftChild(node9);
        node9.setSibling(node10);

        size = 11;
    }

    /**
     * Returns the root of the tree
     * Returns root of tree, if it exists.
     * @return
     * @throws EmptyTreeException
     */
    @Override
    public Position root() throws EmptyTreeException {
        if (root == null){
            throw new EmptyTreeException("The tree is empty, so there is"
                    + " no root.");
        }
        return root;
    }

    /**
     * Returns the left child node of a node at a position
     * @param pos
     * @return
     * @throws InvalidPositionException
     */
    @Override
    public Position leftChild(Position pos) throws InvalidPositionException {
        if ((!(pos instanceof STNode) || (pos == null))){
            throw new InvalidPositionException("This position does not"
                    + " exist, so it has no left child.");
        }
        STNode n = (STNode) pos;
        pos = n.getLeftChild();
        return pos;
    }

    /**
     * Returns the right child node of a node at a position
     * @param pos
     * @return
     * @throws InvalidPositionException
     */
    @Override
    public Position rightChild(Position pos) throws InvalidPositionException {
        if ((!(pos instanceof STNode) || (pos == null))){
            throw new InvalidPositionException("This position does not"
                    + " exist, so it has no right child.");
        }
        STNode n = (STNode) pos;
        STNode nn = n.getLeftChild();
        pos = nn.getSibling();
        return pos;
    }

    /**
     * Returns the sibling of a node at a position
     * @param pos
     * @return
     * @throws InvalidPositionException
     */
    @Override
    public Position sibling(Position pos) throws InvalidPositionException {
        if ((!(pos instanceof STNode) || (pos == null))){
            throw new InvalidPositionException("This position does not"
                    + " exist, so it has no sibling.");
        }
        STNode n = (STNode) pos;
        pos = n.getSibling();
        return pos;
    }

    /**
     * Returns the parent node of a node at a position
     * @param pos
     * @return
     * @throws InvalidPositionException
     */
    @Override
    public Position parent(Position pos) throws InvalidPositionException {
        if ((!(pos instanceof STNode) || (pos == null))){
            throw new InvalidPositionException("This position does not"
                    + " exist, so it has no parent.");
        }
        STNode n = (STNode) pos;
        STNode nn = n.getParent();
        pos = nn;
        return pos;
    }

    /**
     * Returns whether the node at a position is internal
     * @param pos
     * @return
     * @throws InvalidPositionException
     */
    @Override
    public boolean isInternal(Position pos) throws InvalidPositionException {
        if ((!(pos instanceof STNode) || (pos == null))){
            throw new InvalidPositionException("Position does not"
                    + " exist, so it is not an internal node.");
        }
        STNode n = (STNode) pos;
        return (null != n.getLeftChild());
    }

    /**
     * Returns whether the node at a position is external
     * @param pos
     * @return
     * @throws InvalidPositionException
     */
    @Override
    public boolean isExternal(Position pos) throws InvalidPositionException {
        if ((!(pos instanceof STNode) || (pos == null))){
            throw new InvalidPositionException("Position does not"
                    + " exist, so it is not an external node.");
        }
        STNode n = (STNode) pos;
        return (null == n.getLeftChild());
    }

    /**
     * Returns whether a position is the root
     * @param pos
     * @return
     * @throws InvalidPositionException
     */
    @Override
    public boolean isRoot(Position pos) throws InvalidPositionException {
        if ((!(pos instanceof STNode) || (pos == null))){
            throw new InvalidPositionException("Position does not"
                    + " exist, so it is not the tree root.");
        }
        STNode n = (STNode) pos;
        return (null == n.getParent());
    }

    /**
     * Returns the size of the tree
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns whether the tree is empty
     * @return
     */
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }
    
    /**
     * main function, for testing
     * @param args
     */
    public static void main (String[] args) {
        ListBinaryTree myTree = new ListBinaryTree();
        myTree.fillTree();
        System.out.println("In order walk:");
        InOrderWalk iow = new InOrderWalk(myTree);
        iow.execute();
        System.out.println("Pre-order walk:");
        PreOrderWalk prow = new PreOrderWalk(myTree);
        prow.execute();
        System.out.println("Post order walk:");
        PostOrderWalk poow = new PostOrderWalk(myTree);
        poow.execute();
    }
}