
public class p6s {
    public static void main(String[] args) {
        System.out.print("*********\n");
        for(int i=4;i>=1;i--){
            for(int k=5-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                    System.out.print("* ");

                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
        System.out.println("Id-22DCE069");    
    }
}