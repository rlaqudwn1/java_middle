import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Naver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr= {"INT","INT","BOOL","INT","SHORT","LONG"};
        StringTokenizer st = new StringTokenizer(br.readLine());
        String byt ="";
        String answer="";
        int Maxbyte=128;
        for(int i=0; i<arr.length;i++){
            if (arr[i].equals("INT")){
                if (byt.isEmpty()) {
                    byt="########";
                    answer+=byt+",";
                    byt="";
                    Maxbyte-=8;
                }else {
                    while (byt.length() != 8) {
                        byt+=".";
                    }
                    answer+=byt+",";
                    byt="";
                    Maxbyte-=8;
                    answer+="########,";
                }
            }
            if (arr[i].equals("LONG")){
                if (byt.isEmpty()) {
                    answer+="########,########";
                    Maxbyte-=16;
                }else {
                    while (byt.length() != 8) {
                        byt += ".";
                    }
                    answer+=byt+",";
                    byt = "";
                    Maxbyte -= 8;
                    answer+="########,########";
                    Maxbyte-=16;
                }
            }
            if (arr[i].equals("FLOAT")){
                if (byt.length()>4){
                    byt+="....";
                    answer+=byt+",";
                    byt="####";
                }else {
                    byt += "####";
                    if (byt.length() == 8) {
                        answer+=byt+",";
                        Maxbyte-=8;
                        byt="";
                    }
                }
            }
            if (arr[i].equals("SHORT")){
                if(byt.length()>6){
                    while (byt.length() != 8) {
                        byt+=".";
                    }
                } else {
                    byt+="##";
                }
                if (byt.length() == 8) {
                    answer+=byt+",";
                    Maxbyte-=8;
                    byt="##";
                }
            }
            if (arr[i].equals("BOOL")) {
                if (byt.length() == 8) {
                    answer += byt;
                    Maxbyte -= 8;
                    byt = "";
                } else {
                    byt+="#";
                    if (i<arr.length-1&&arr[i+1].equals("SHORT")&&byt.length()<=7){
                        byt+=".";
                    } else if (i < arr.length - 1 && arr[i + 1].equals("FLOAT") && byt.length() <= 5) {
                        byt+="...";
                    }
                }
            }
            System.out.println(answer);
        }
        System.out.println(Maxbyte);
        if (Maxbyte < 0) {
            System.out.println("HALT");
        }
    }
}
