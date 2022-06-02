package packageStrings;
// there are about 4000 + classes in various packages.
// ```````````````````````````````````````````````````
// java.lang  -> Fundamental classes like String , imported by Default.
// java.util  -> DataStructures
// java.io    -> io
// java.net   -> network related.
// java.sql   -> databases.
// Apache Commons,Google Guava -> advanced data structures .

//  we should avoid multiple imports as some times a class like 'Date' can be present in different packages  .
public class packages {
    java.util.Date UTILDATE;   // if there is conflict , use fully qualified names.
    java.sql.Date SQLDATE;   // if there is conflict , use fully qualified names.

    public static void main(String[] args) {

    }
}
