/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Question {
    private String text;
    private String answer;
    
    public Question(String text, String answer){
        text = this.text;
        answer = this.answer;
    }
    
    String getText(){
        return text;
    }
    
    boolean isCorrect(String answer) {
        if (answer.equals(this.answer)) {
            return true;
        }
        else {
            return false;
        }
    }
}
