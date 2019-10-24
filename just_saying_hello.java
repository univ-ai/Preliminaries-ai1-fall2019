import java.util.*
class Vk
{
  public static void main (String args[])
  {
    System.out.println("describe   vikhyath in one word and win free vikhyath goodies");
    Scanner sc=new Scanner (Sytem.in);
    String t = sc.nextLine();
    t= t.toLowerCase();
    if(t=="good"||t=="nice"||t=="kind"||t=="smart"||t=="sportsperson"||t=="loving"||t=="clever"||t==" ")
      System.out.println("sorry your comment has violated our policy and hence your consideration in furthur rounds is declined");
    else
        System.out.println("Congrats you have won free vikhyath goodies which will be delivered to you . \n you will be receiving emails regarding the delivering charges which is 3.879233 times the cost of the goodies . \n gst excluded .\n t&c  apply");
  }
}
