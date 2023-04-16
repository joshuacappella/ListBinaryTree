package com.joshuacappella.binarytree;

/**
 *
 * @author Joshua Cappella
 */
public class PreOrderWalk extends EulerTour {
    
    public PreOrderWalk (BinaryTree t) {super(t);}
    
    /**
     * execute method
     */
    protected void execute() { performTour(tree.root());}
    
    /**
     * visitPreorder method
     * @param p
     * @param r
     */
    @Override
    protected void visitPreorder (Position p, TraversalResult r) {
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
