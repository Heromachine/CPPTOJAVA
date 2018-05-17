import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Heromachine
 */
public class StudentClass {
    
    double TESTWEIGHT = 0.20, LABWEIGHT = 0.15, FINALWEIGHT = 0.30;
    private String name; 
    private int iTest1;
    private int iTest2;
    private int iLab;
    private int iQuiz;
    private int iFinalExam;
    private int iTotal;
    private String sGrade;
    
    public void setName(String x)
    {
        name = x;
    }
    public String getName()
    {
        return name; 
    }
    public int getiTest1() {
        return iTest1;
    }
    public int getiTest2() {
        return iTest2;
    }
    public int getiLab() {
        return iLab;
    }
    public int getiQuiz() {
        return iQuiz;
    }
    public int getiFinalExam() {
        return iFinalExam;
    }
    public int getiTotal() 
    {        
        iTotal =(int)((iTest1+iTest2)*TESTWEIGHT+(iLab+iQuiz)*LABWEIGHT+iFinalExam*FINALWEIGHT);        
	return iTotal;
    }
    public String getsGrade() {
        return sGrade;
    }
    public void setiTest1(int iTest1) {
        this.iTest1 = iTest1;
    }
    public void setiTest2(int iTest2) {
        this.iTest2 = iTest2;
    }
    public void setiLab(int iLab) {
        this.iLab = iLab;
    }
    public void setiQuiz(int iQuiz) {
        this.iQuiz = iQuiz;
    }
    public void setiFinalExam(int iFinalExam) {
        this.iFinalExam = iFinalExam;
    }
    public void setiTotal(int iTotal) {
        this.iTotal = iTotal;
    }
    public void setsGrade() 
    {
        
    if(iTotal >= 90)
        sGrade =" A "; 
    else if(iTotal >= 80)
        sGrade =" B "; 
    else if(iTotal>= 70)
        sGrade =" C ";
    else if(iTotal >= 60)
        sGrade =" D "; 
    else
        sGrade =" F ";
    } 
    
    public void printStudentInfo()
    {
       System.out.print("Name: "+ name);
       System.out.print("Test 1: "+ iTest1);
       System.out.print("Test 2: "+ iTest2);
       System.out.print("Lab: "+ iLab);
       System.out.print("Quiz: "+ iQuiz);
       System.out.print("iFinal: "+ iFinalExam);
       System.out.print("iTotal: "+ iTotal);
       System.out.print("Grade: "+ sGrade);
    }
    
    public void GetStudentInfoFile(String x) throws IOException
    {
        try(FileInputStream inputStream = new FileInputStream(x)) {
        Session IOUtils = null;
        String everything = IOUtils.toString(inputStream);
        
        System.out.print(everything);
}
        
    }
    
}
