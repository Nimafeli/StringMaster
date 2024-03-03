public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] devided = sentence.split(" ");
        if(number > sentence.length){
            return ("Number = " + number + " is out Of Bound");
        }else{
            return devided[number-1];
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int converted = Integer.valueOf(number);
        int temp = converted;
        int evenCounter=0, oddCounter=0;
        while(temp != 0){
            int last = temp % 10;
            if(last % 2 == 0){
                evenCounter++;
            }else{
                oddCounter++;
            }
            temp /= 10;
        }
        if(searchForEven){
            return evenCounter;
        }else{
            return oddCounter;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        int i = 0;
        while(wordA.charAt(i) != "\0" && wordB.charAt(i) != "\0")
        if(wordA.cahrAt(i) < wordB.charAt(i)){
            return wordA;
        }else if(wordA.charAt(i) > wordB.charAt(i)){
            return wordB;
        }else{
            i++;
        }
    }
}
