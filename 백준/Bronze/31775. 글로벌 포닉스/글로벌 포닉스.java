import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        
        int[] lkp = {0, 0, 0};
        

        if(a.charAt(0) == 'l'){
            lkp[0]=1;
        }else if(a.charAt(0) == 'k'){
            lkp[1] = 1;
        }else if(a.charAt(0) == 'p'){
            lkp[2] = 1;
        }
        
        if(b.charAt(0) == 'l'){
            lkp[0]=1;
        }else if(b.charAt(0) == 'k'){
            lkp[1] = 1;
        }else if(b.charAt(0) == 'p'){
            lkp[2] = 1;
        }
        
        if(c.charAt(0) == 'l'){
            lkp[0]=1;
        }else if(c.charAt(0) == 'k'){
            lkp[1] = 1;
        }else if(c.charAt(0) == 'p'){
            lkp[2] = 1;
        }
        
        boolean key = true;
        for(int i=0;i<3;i++){
            if(lkp[i] == 0){
                key = false;
                break;
            }
        }
        if(key){
            System.out.println("GLOBAL");
        }else{
            System.out.println("PONIX");
        }
        
    }
}