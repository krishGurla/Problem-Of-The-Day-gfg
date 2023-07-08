//  >> JAVA CODE <<

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        int n = size;
        int i = 0;

        while (i < n) {
            int el = arr[i];
            int index = el - 1;

            if (index >= 0 && index < n) {
                if (arr[index] != el) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                    continue;
                }
            }
            i++;
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
