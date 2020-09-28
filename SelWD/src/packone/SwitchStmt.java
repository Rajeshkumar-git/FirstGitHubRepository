package packone;

import org.eclipse.jdt.internal.compiler.ast.SwitchStatement;

public class SwitchStmt {

	public static void main(String[] args) {

		int a=10;
		int b=6;
		int c=a-b;
		
		
		switch (c)
		{
		
		case 1:System.out.println("Value 1");
		break;
		case 2:System.out.println("Value2");
		break;
		case 3: System.out.println("Value3");
		break;
		case 4:System.out.println("Value4");
		break;
		default: System.out.println("Value is out of Range");
		
		}

	}
}

	


