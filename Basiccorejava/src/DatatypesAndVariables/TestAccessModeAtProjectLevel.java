package DatatypesAndVariables;

import Functions.AccessModifier;

public class TestAccessModeAtProjectLevel extends AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessModifier obj=new AccessModifier();

obj.publicFunction();

TestAccessModeAtProjectLevel S =new TestAccessModeAtProjectLevel();
S.privateFunction();
S.protectedFunction();
S.publicFunction();
S.noaccessspecifierFunction();
	}

}

