static void minimumBribes(int[] q) {
        int swap = 0;
        int bribes;
        int pos = 0;
        for(int i=q.length-1; i>=0; i--){
            int j = 0;

            bribes = q[pos] - (pos++);
            if (bribes > 2){
                System.out.println("Too chaotic");
                return;
            }
            if (q[i] - 2 > 0){
                j = q[i] -2;
            }
            
            while(j <= i){
                if (q[j] > q[i]){
                    swap++;
                }
                j++;
            }
            pos++;
        }
        System.out.println(swap);
}
