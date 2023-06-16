import java.util.Scanner;
class Two_D
{
    public static void main(String []args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        a=sc.nextInt();
        System.out.println("Enter the number of columns :");
        b=sc.nextInt();
        int arr[][]=new int[a][b];

        System.out.println("Enter the Array :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Element to search :");
        int s=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==s)
                {
                    System.out.println("Element present at ["+i+"]["+j+"]"); 
                }
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print("At Array Index ["+i+"]["+j+"] :"+arr[i][j]+"");
                System.out.println(" ");
            }
        }
        
    }
}