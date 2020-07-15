package competitiveProgramming.basicproblems;

/**
 * Input
 * Input will consist of several lines of text containing an even number of double-quote (") characters.
 * Input is ended with an end-of-file character.
 * Output
 * The text must be output exactly as it was input except that:
 * • the first " in each pair is replaced by two ` characters: `` and
 * • the second " in each pair is replaced by two ' characters: ''.
 * Sample Input
 * "To be or not to be," quoth the Bard, "that
 * is the question".
 * The programming contestant replied: "I must disagree.
 * To `C' or not to `C', that is The Question!"
 * Sample Output
 * ``To be or not to be,'' quoth the Bard, ``that
 * is the question''.
 * The programming contestant replied: ``I must disagree.
 * To `C' or not to `C', that is The Question!''
 */

public class TEXQuotes {

    public static void main(String[] args){

       // “To be or not to be,” quoth the bard, “that is the question.”
       // In order to produce the desired form, the source file must contain the sequence:
       //``To be or not to be,'' quoth the bard, ``that is the question.''


        StringBuilder text = new StringBuilder(" \"To be or not to be,\" quoth the bard, \"that is the question.\", " +
                " \"To be or not to be,\" quoth the bard, \"that is the question.\",  \"To be or not to be,\" quoth the bard, \"that is the question.\"" +
                " \"To be or not to be,\" quoth the bard, \"that is the question.\" ");
        System.out.println("Before: " + text);

        boolean firstQuote = true;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == '"' && firstQuote){
                text.deleteCharAt(i);
                text.insert(i, "`");
                i++;
                text.insert(i, "`");
                firstQuote = false;
            }
            else if(text.charAt(i) == '"' && !firstQuote){
                text.deleteCharAt(i);
                text.insert(i, "'");
                i++;
                text.insert(i, "'");
                firstQuote = true;
            }
        }
        System.out.println("After: " + text);

    }
}
