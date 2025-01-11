package StarAndNumPatterns;

public class Patterns {
    public static void main(String[] args) {
        Pattern4(5);
    }
    //Horizontal Stars
    public static void Pattern1(int num){
        for(int i=0;i<num;i++){
            System.out.print("* ");
        }
    }
    //Vertical Stars
    public static void Pattern2(int num){
        for(int i=0;i<num;i++){
            System.out.println("*");
        }
    }

    //Square of Stars
    public static void Pattern3(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.println("*");
            }
            System.out.print(" ");
        }
    }

    // Hollow Square
    public static void Pattern4(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==0 || j==0 || j==num-1 || i==num-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void Pattern5(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==0 || j==0 || j==num-1 || i== num-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}