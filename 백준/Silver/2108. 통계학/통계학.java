import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[8001];
        int[] arr = new int[n];
        int avg = 0;
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
            avg += arr[i];
            cnt[arr[i]+4000]++;
        }
        Arrays.sort(arr);
        
        int maxFreq = 0;
        for (int i = 0; i < 8001; i++) {
            maxFreq = Math.max(maxFreq, cnt[i]);
        }

        List<Integer> modeList = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (cnt[i] == maxFreq) {
                modeList.add(i - 4000);
            }
        }
        System.out.println(Math.round((double) avg / n));
        System.out.println(arr[n / 2]);
        System.out.println(modeList.size() > 1 ? modeList.get(1) : modeList.get(0));
        System.out.println(arr[n - 1] - arr[0]);
    }
}