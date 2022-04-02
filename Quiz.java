public class Quiz {

    public static void main(String[] args) {
        Question question = new MultipleChoiceQuestion( "What is a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "a");
        question.check();
        question.showResults();

        question = new MultipleChoiceQuestion("What is the speed of light?",
                "3*10^8 m/s",
                "2*10^9 m/s",
                "4*10^9 m/s",
                "1*10^9 m/s",
                "4*10^7 m/s",
                "a");
        question.check();
        question.showResults();

        question = new MultipleChoiceQuestion("What was the average IQ of Albert Einstein?",
                "160",
                "161",
                "162",
                "163",
                "164",
                "a");
        question.check();
        question.showResults();

        question = new MultipleChoiceQuestion("What is the speed of sound?",
                "342 m/s",
                "344 m/s",
                "354 m/s",
                "345 m/s",
                "343 m/s",
                "e");
        question.check();
        question.showResults();

        question = new MultipleChoiceQuestion("What is the speed of electron?",
                "2.0*10^6 m/s",
                "2.1*10^6 m/s",
                "2.2*10^6 m/s",
                "2.0*10^5 m/s",
                "2.1*10^5 m/s",
                "c");
        question.check();
        question.showResults();

        question = new TrueFalseQuestion("Superman is from Marvel?",
                "f");
        question.check();

        question = new TrueFalseQuestion("Spiderman is from Marvel",
                "t");
        question.check();

        question = new TrueFalseQuestion("Ironman is from DC",
                "f");
        question.check();

        question = new TrueFalseQuestion("Doctor Strange is from Marvel",
                "t");
        question.check();

        question = new TrueFalseQuestion("Flash is from DC",
                "t");
        question.check();
        question.showResults();
    }
}