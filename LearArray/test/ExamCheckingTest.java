/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import leararray.LearArray.ExamChecking;

/**
 *
 * @author User
 */
public class ExamCheckingTest {
    private ExamChecking testEx;
    private char[] stdAnswer;
    private char[] solAnswer;
    public ExamCheckingTest() {
       testEx=new ExamChecking();
    }
    @Test
    public void allStudentAnswerIncorrect(){
        stdAnswer = new char [] {'A', 'B', 'C', 'D', 'A'};
        solAnswer = new char[] {'B', 'C', 'D', 'A', 'B'};
        int expectResult=0;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }

    @Test
    public void allStudentAnswerCorrect(){
        stdAnswer = new char [] {'B', 'B', 'C', 'D', 'A'};
        solAnswer = new char[] {'B', 'B', 'C', 'D', 'A'};
        int expectResult=5;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void someStudentAnswerCorrect(){
        stdAnswer = new char [] {'B', 'B', 'C', 'D', 'A'};
        solAnswer = new char[] {'B', 'C', 'D', 'A', 'A'};
        int expectResult=2;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }
  
    @Test
    public void notEquallyNumberOfExamReturnMinusOne(){
        stdAnswer = new char [] {'B', 'B', 'C'};
        solAnswer = new char[] {'B', 'B', 'C', 'D', 'A'};
        int expectResult=-1;
        int result=ExamChecking.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }
}
