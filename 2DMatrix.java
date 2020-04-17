class 2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        // base case:
        if (matrix.length == 0){ return false;}


        for (int[] row: matrix)
        {
            if (row.length == 0){return false;}

            if (target<=row[row.length-1])
            {
                if (target == row[row.length-1]) return true;

                for (int i=0; i<row.length; i++)
                {
                  if (target == row[i]) return true;
                }
            }
        }

        return false;
    }
}
