class jagged {
    public static void main(String[] args)
    {
        int arr[][]=new int[3][];
        arr[0]=new int[]{1,2,3};
        arr[1]=new int[]{7,5,6,4};
        arr[2]=new int[]{8,9};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            System.out.print(arr[i][j]+"");
            System.out.println(" ");
        }
    }
}
