import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String[] devided =  sentence.split(" ");
        boolean flag = false;
        int index = -1;
        for(int i = 0; i < devided.length; i++) {
            if(devided[i].equals(word)){
                flag = true;
                index = i;
            }
        }
        if(flag){
            devided[index] = newWord;
            String newSentence = String.join(" ", devided);
            return newSentence;
        }else{
            return ("There is no match");
        }

        

    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        String normilizeF = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String normilizeL = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        String normalName = normilizeF + " " + normilizeL;
        return normalName;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        String[] devided = word.split("");
        for(int i = 0 ; i< devided.length - 1; i++){
            if(devided[i].equals(devided[i+1])) {
                for(int j = i; j < devided.length - 1; j++){
                    devided[j] = devided[j+1];
                }
                devided[devided.length - 1] = "\0";
            }
        }
        word = String.join("", devided);
        return word;
    }
}

