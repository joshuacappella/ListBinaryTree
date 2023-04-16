package com.joshuacappella.binarytree;

/**
 *
 * @author Joshua Cappella
 */
public class PostOrderWalk extends EulerTour {
    
    public PostOrderWalk (BinaryTree t) {super(t);}
    
    /**
     * execute method
     */
    protected void execute() { performTour(tree.root());}
    
    /**
     * visitPostorder method
     * @param p
     * @param r
     */
    @Override
    protected void visitPostorder (Position p, TraversalResult r) {
        System.out.println(p.element());
    }
    
    /**
     * visitExternal method
     * @param p
     * @param r
     */
    @Override
    protected void visitExternal (Position p, TraversalResult r) { 
        System.out.println(p.element());
    }

}
