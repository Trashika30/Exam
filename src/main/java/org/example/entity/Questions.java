package org.example.entity;

public class Questions {

    int qid;
   private String text;
   private String optionA;
   private String optionB;
    private String optionC;
    private String optionD;
    private String optionE;
    private String answer;
    public Questions() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getOptionE() {
        return optionE;
    }

    public void setOptionE(String optionE) {
        this.optionE = optionE;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Questions(int qid, String text, String optionA, String optionB, String optionC, String optionD, String optionE, String answer) {
        this.qid = qid;
        this.text = text;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.optionE = optionE;
        this.answer = answer;

    }

    @Override
    public String toString() {
        return qid+". "+text+"\n A."+optionA+"\n B."+optionB+"\n C."+optionC+"\n D."+optionD+"\n E."+optionE+"\n \n";
    }
}
