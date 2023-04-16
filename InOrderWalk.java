package com.joshuacappella.binarytree;

/**
 *
 * @author Joshua Cappella
 */
public class InOrderWalk extends EulerTour {
    
    public InOrderWalk (BinaryTree t) {super(t);}
    
    /**
     * execute method
     */
    protected void execute() { performTour(tree.root());}
    
    /**
     * visitInorder method
     * @param p
     * @param r
     */
    @Override
    protected void visitInorder (Position p, TraversalResult r) {
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
