package src;
//coded by Randy Lee
//started Feb 8 worked for 1 hour
//Feb 12 worked on it for 3 hours
public class Decision_Matrix {
  //inputs are userinput, filename, and number of inputs
  //not numanswer = 4th line in txt file
  public String Decision(String s, String file, int i) {
    String decision = "";
    s = s.toLowerCase();

    String[] list = s.split(" ");
    String[] list2 = file.split(".");
    String[] ans = list2[0].split("-");

      if(i==3){
        for(int j = 0; i<list.length; i++){
          //work on this
          if(list[i].contains("phone")){
            ans[0]+="0";
          }else if(list[i].contains("internet")){
            ans[0]+="1";
          }else if(list[i].contains("both")){
            ans[0]+="2";
          }else{
            System.out.println("did not understand try again.");
            return file;
          }
          ans[1]="0";
        }
      }else if(i==2){
        for(int j = 0; i<list.length; i++){
          //if the word says yes add a zero to the path
          if(list[i].charAt(0)=='y'){
            ans[0]+="0";
          }
          //if the word says no add a one to the path
          else if(list[i].charAt(0)=='n'){
            ans[0]+="1";
          }else{
            System.out.println("did not understand try again.");
            return file;
          }
        }
        ans[1]="0";
      }
      else if(i==1){
        ans[1]="1";
      }
      else if(i==0){
        System.exit(0);
      }
      else if(i==-1){
        return "0.txt";
      }


      //decision = path, priority and file type
      decision = ans[0]+"-"+ans[1]+"."+list2[1];
      return decision;
  }
}
