class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        // answer list
        List<Integer> ans = new ArrayList<Integer>();

        // base case(s)
        if (matrix.length == 0) return ans;

        // initialize variables
        int startRow = 0;
        int endRow = matrix.length -1;
        int startColumn = 0;
        int endColumn = matrix[0].length -1;
        int numElements = matrix.length*matrix[0].length;
        int count = 0;

        while(startRow<=endRow && startColumn<=endColumn)
        {
            // print the first row
            for (int i=startColumn; i<=endColumn; i++)
            {
                ans.add(matrix[startRow][i]);
                count++;
            }
            startRow++;

            if (count == numElements) return ans;

            // print last column
            for (int i=startRow; i<=endRow; i++)
            {
                ans.add(matrix[i][endColumn]);
                count++;
            }
            endColumn--;

            if (count == numElements) return ans;

            // print last row
            for (int i=endColumn; i>=startColumn; i--)
            {
                ans.add(matrix[endRow][i]);
                count++;
            }
            endRow--;

             if (count == numElements) return ans;

            // print first column
            for (int i=endRow; i>=startRow; i--)
            {
                ans.add(matrix[i][startColumn]);
                count++;
            }
            startColumn++;

             if (count == numElements) return ans;

        }

        return ans;
    }
}
