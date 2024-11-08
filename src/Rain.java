//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.*;

public class Rain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var v = new Vector<Integer>();
        var sum = 0.0;

        while(true){
            System.out.print("강수량 입력 (0입력시 종료) : ");
            int n = sc.nextInt();
            if(n == 0) break;;
            v.add(n);
            sum += n;
            for (int i=0; i<v.size(); i++) System.out.print(v.get(i) + " ");
            System.out.println("\n현재평균 : " + (sum / v.size()));
        }
        sc.close();
    }
}