public class StringComparison {
    private String firstStr;
    private String secondStr;

    StringComparison(String firstStr, String secondStr){
        this.firstStr = firstStr;
        this.secondStr = secondStr;
    }

    public void equalsString(){

        if(firstStr.equals(secondStr)){
            System.out.println("Строки равны");
        }else{
            System.out.println("Строки не равны");
        }
    }
}
