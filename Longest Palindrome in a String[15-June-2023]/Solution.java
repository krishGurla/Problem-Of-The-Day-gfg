//  >> JAVA CODE <<

static String longestPalin(String S) {
        int st = 0;
        int end = 0;
        int i = 0;
        int n = S.length();
        
        while (i < n) {
            int j = i - 1;
            int k = i + 1;
            
            while (j >= 0 && k < n && S.charAt(j) == S.charAt(k)) {
                k++;
                j--;
            }
            
            if (k - j + 1 > end - st + 1) {
                end = k;
                st = j;
            }
            
            j = i;
            k = i + 1;
            
            while (j >= 0 && k < n && S.charAt(j) == S.charAt(k)) {
                k++;
                j--;
            }
            
            if (k - j + 1 > end - st + 1) {
                end = k;
                st = j;
            }
            
            i++;
        }
        
        return S.substring(st + 1, end);
    }