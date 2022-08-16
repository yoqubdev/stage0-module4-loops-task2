package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
         String str = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            String s = "";

            while (i < ch.length && ch[i] != ' ') {

                s = s + ch[i];
                i++;
            }

            if (s.length() > 0)
                System.out.println(s + "->" + s.length());
        }

    }
}
