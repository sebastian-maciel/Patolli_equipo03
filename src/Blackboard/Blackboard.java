package Blackboard;

import blackboardPattern.AbstractBlackBoard;
import blackboardPattern.BlackBoardObject;

public class Blackboard extends AbstractBlackBoard { 

     public void addBlackBoardObject(BlackBoardObject bbo) {
    	 
          System.out.println("==>> Blackboard recibió BBO "+bbo.getClass().getName());

          super.addBlackBoardObject(bbo);
     }
}
