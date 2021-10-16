public class MultiDimensionalArrays {
    public static void main(String[] args){
        int[] values = {1, 2, 3, 4, 5};

        System.out.println(values[2]);

        int[][] grid = {values,
                        {2,3,4},
                        {4,3,2,1,4}
        };
        System.out.println(grid[0][0]);
        System.out.println(grid[1][2]);

        String[][] texts = new String[2][3];

        System.out.println(texts[0][1]);

        for(int i =0; i < grid.length; i++){
            for(int j=0; j < grid[i].length; j++){
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }

        String[][] words = new String[2][];

        System.out.println(words[0]);

        words[0] = new String[3];

        words[0][1] = "hi there";
        System.out.println(words[0][1]);
    }
}
