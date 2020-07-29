package HW4;


import HW3.Util;


public class Part1 {

    public static void main(String[] args) {
        String input = Util.getInput("part1.txt");
        StringBuilder words = new StringBuilder();
        for (String line:
                input.split(System.lineSeparator()) ) {
            for (String word:
                 line.split("\\b")) {
                if(word.length() > 3){
                    word = word.substring(2);
                }
                words.append(word);
            }
            words.append(System.lineSeparator());
        }
        words.deleteCharAt(words.length()-1);
        System.out.println(words);
    }

}