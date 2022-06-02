package exercises.ex4;

public class IRUtil {

    public static double termFrequency(String term,String doc) {
        double count = 0.0;


        String lowerterm = term.toLowerCase();
        String lowerdoc = doc.toLowerCase();

        int currIdx = 0;
            while (! ( currIdx==-1)){
                count+=1;
                currIdx = lowerdoc.indexOf(lowerterm,currIdx+lowerterm.length());
             }

        return count/lowerdoc.split(" ").length;
    }


    public static void main(String[] args) {
        System.out.println(termFrequency("is","Every time there is a new COVID wave, a few medicines become popular. The desperation to save family members or avoid severe forms of the infection makes hapless people opt for the ‘promising’ drugs. Currently, people are made aware of one such drug called ‘Monoclonal Antibodies Cocktail’, which costs around ₹60,000. However, several doctors from Telangana have underscored that the antibodies cocktail, available in India, are not effective against the Omicron variant. They have also stressed that 93% to 95% of the current COVID cases are of Omicron variant. Even if it is Delta variant, the drug cocktail has to be given within seven days of onset of the infection, and it is ineffective if the patient is in a severe stage of infection. Doctors said Remdesivir is suggested for patients with Omicron, after examining infection severity, presence of co-morbidities, immunity levels, and other factors."));
    }


}
