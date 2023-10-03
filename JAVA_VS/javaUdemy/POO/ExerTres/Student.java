package javaUdemy.POO.ExerTres;
public class Student {
    public String name;
    public double gradeOne; /* Vale 30 */
    public double gradeTwo; /* Vale 35 */
    public double gradeThree; /* Vale 35 */
    public double grade;

    public double median (){
        grade = (gradeOne + gradeTwo + gradeThree) / 3;
        return grade;
    }

    public void finalGrade(){
        if (median() >= 60) {
            System.out.printf("Passou \n %.2f \n",median());
        } else {
            System.out.printf("Reprovou: %.2f \n", median());
            double falta = 60.0 - median();
            System.out.printf("Faltam: %.2f \n", falta, "para voce passar!");
        }
    } 
}
