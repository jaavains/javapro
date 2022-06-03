package exercises.ex5;

import java.util.Arrays;

public class SentimentAnalyzer {
    // Tip: labeled continue can be used when iterating featureSet + convert review to lower-case
    public static int[] detectProsAndCons(String review, String[][] featureSet, String[] posOpinionWords,
                                          String[] negOpinionWords) {
        int[] featureOpinions = new int[featureSet.length]; // output

        for(int i =0;i<featureSet.length;i++){
            for (String s:featureSet[i]){
                int temp = getOpinionOnFeature(review,s,posOpinionWords,negOpinionWords);
                if (temp!=0){
                    featureOpinions[i]=temp;
                    break;
                }

            }

        }

        return featureOpinions;
    }

    // First invoke checkForWasPhrasePattern and
    // if it cannot find an opinion only then invoke checkForOpinionFirstPattern
    private static int getOpinionOnFeature(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {

        int checkforwas = checkForWasPhrasePattern(review,feature,posOpinionWords,negOpinionWords);

        return checkforwas == 0 ? checkForOpinionFirstPattern(review,feature,posOpinionWords,negOpinionWords) : checkforwas;
    }

    // Tip: Look at String API doc. Methods like indexOf, length, substring(beginIndex), startsWith can come into play
    // Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
    // You can first look for positive opinion. If not found, only then you can look for negative opinion
    private static int checkForWasPhrasePattern(String review, String feature, String[] posOpinionWords, String[] negOpinionWords) {
        int opinion = 0;
        String pattern = feature + " was";
        String[] sentences = review.toLowerCase().split("\\.");

        int idx = 0;
        for (String line:sentences){
            for(String posWord:posOpinionWords){
                idx = line.indexOf(pattern);
                if ( (idx>0) && (line.indexOf(posWord)==idx+1+pattern.length())){
                    return 1;
                }
            }
            for(String negWord:negOpinionWords){
                idx = line.indexOf(pattern);
                if ( (idx>0) && (line.indexOf(negWord)==idx+1+pattern.length())){
                    return -1;
                }
            }
        }

        return opinion;
    }

    // You can first look for positive opinion. If not found, only then you can look for negative opinion
    private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords,
                                                   String[] negOpinionWords) {
        // Extract sentences as feature might appear multiple times.
        // split() takes a regular expression and "." is a special character
        // for regular expression. So, escape it to make it work!!
        String[] sentences = review.toLowerCase().split("\\.");
        int opinion = 0;
        int idx = 0;
        for (String line:sentences){
            for(String posWord:posOpinionWords){
                idx = line.indexOf(posWord);
                if ( (idx>0) && (line.indexOf(feature)==idx+1+posWord.length())){
                    return 1;
                }
            }
            for(String negWord:negOpinionWords){
                idx = line.indexOf(negWord);
                if ( (idx>0) && (line.indexOf(feature)==idx+1+negWord.length())){
                    return -1;
                }
            }
        }
        // your code for processing each sentence. You can return if opinion is found in a sentence (no need to process subsequent ones)

        return opinion;
    }

    public static void main(String[] args) {
        String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive";

//        String review = "Sorry OG, but you just lost some loyal customers. Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, appetizer was cold and the food came out before the salad.";
//        String review = "The waiter was great ! ! ";
        String[][] featureSet = {
                { "ambiance", "ambience", "atmosphere", "decor" },
                { "dessert", "ice cream", "desert" },
                { "food" },
                { "soup" },
                { "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };
        String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
                "delicious" };
        String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor" };

       int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);
        System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
//        System.out.println(detectProsAndCons(review,"food",posOpinionWords,negOpinionWords));
    }
}