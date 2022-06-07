package packageStrings;
// Minimize accessibility of classes & members.
public class tightCoupling {   // No setters and getters leads to tightCoupling.
//    We insert setters and getters to have loose coupling.
//  If we make a variable public , all customers expect it to be invariant(fixed data )and also expect its data type is fixed
// In public classes , use accessor methods . | using setter(called as mutator) & getters( called as accessor)
private String name;
private int iName;
    public String getName() {
        return name;
    }

    public void setName(String name) {  // Argument remains a string , but internally we can change to int for performance. !
        if (name.equals("avinash")) { iName=1; }
        else if (name.equals("nani")) { iName=2; }
        else {
            throw new IllegalArgumentException("Name not valid");
        }

    }
}
