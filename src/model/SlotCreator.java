package model;

import expr.ExprParser;
import util.XLException;

public class SlotCreator {
	
	public Slot createSlot(String input) {
		
		ExprParser parser = new ExprParser();
		
		if(input.charAt(0) == '#') {
			return new CommentSlot(input);
		} else {
			try {
				System.out.println("Expr try to build");
				return new ExpressionSlot(parser.build(input));
			} catch (Exception error) {
				throw new XLException("SlotCreator failure");
			}
		}
		
	}

}
