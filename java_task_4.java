import java.util.*;
/**
 * java_task_4
 */
public class java_task_4 {
    public static void main(String[] args) {

        ArrayList<String[]> list =new ArrayList<>();
        ArrayList<String> age=new ArrayList<>();
        ArrayList<String[]> Sorted_list =new ArrayList<>();
       
        Scanner scanner= new Scanner(System.in);
    boolean run= true;
    while(run){
        String in=scanner.nextLine();
        if(in.equals("x")){
            run=!run;
        }
        else{
            String[] data=in.split(",");
            list.add(data);
            String temp_str=data[1]+" "+list.size();
            age.add(temp_str);
        }
        }
        Sorted_list.addAll(list);
    run=true;
    while (run) {
        for(String[]data:list){
            StringBuilder str=new StringBuilder();
            String[] tmp=data[0].split(" ");
            String sex=data[2];
            str.append(tmp[0]).append(' ').append(tmp[1].charAt(0)).append(".").append(' ').append(tmp[2].charAt(0)).append(".").append(data[1]).append(sex.charAt(0));
            System.out.println(str);
         } 
        System.out.println("press x to exit, press s to sort");
        String in=scanner.nextLine();
        if(in.equals("x")){
            run=!run;
        }
        if(in.equals("s")){
          Collections.sort(age);
           int i=0;
           
        while (i<list.size()) {
            String[] tmp= age.get(i).split(" ");
            int index=Integer.parseInt (tmp[1]);
            Sorted_list.remove(i);
            Sorted_list.add(i,list.get(index-1));
            i++;
        }
        System.out.println(Sorted_list.size());
        for(String[]data:Sorted_list){
        StringBuilder str=new StringBuilder();
        str.append(data[0].toString()).append(" ").append(data[1].toString()).append(" ").append(data[2].toString());
            System.out.println(str);
         } 
        
            run=!run;
        }
    } 
        
    }
    
}  
//????? ??? ? ????? ?????????? ?????? ???? ????????????? ?? ????? ?????- ?????????? ?? ???????? ????????? ? ??????????????? ?????? ????? ?????? ? ???????? ??????