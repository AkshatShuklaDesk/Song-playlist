import java.util.ArrayList;
import java.util.Scanner;
class Songs
{public static void main(String[]args)
    {Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tMENU\t\t");
        System.out.println("Press 1: Show All the songs");
        System.out.println("Press 2: To select a song");
        System.out.println("Press 3: Next song");
        System.out.println("Press 4: Previous song ");
        System.out.println("Press Any Character:To Close");
        int ch=sc.nextInt();
             if(ch>=1||ch<=4)
        {
            switch(ch)
        {
            case 1:
            {
                ArrayList<String> ab=new ArrayList<String>();
                        ab.add("Industry Baby");
                        ab.add("Fate");
                        ab.add("Chances");
                        ab.add("We rollin");
                        ab.add("Brown munde");
                        ab.add("Desires");
                        ab.add("Tere te");
                        ab.add("Saada pyaar");
                        ab.add("Ma Belle");
                System.out.println("ArrayList\n"+ab);
                break;
            }
            case 2:
            {    ArrayList<String> as=new ArrayList<String>();
                        as.add("Industry Baby");
                        as.add("Fate");
                        as.add("Chances");
                        as.add("We rollin");
                        as.add("Brown munde");
                        as.add("Desires");
                        as.add("Tere te");
                        as.add("Saada pyaar");
                        as.add("Ma Belle");
                        String ar[]=new String[as.size()];
                        for(int i=0;i<as.size();i++)
                        {
                         ar[i]=as.get(i);
                        }
                System.out.println("\t\t\tSELECT\t\t");
                for(int i=0;i<as.size();i++)
                {
                 System.out.println(ar[i]+"\n");
                }
                int select_songs=sc.nextInt();
                if(select_songs>=0||select_songs<8)
                {
                switch(select_songs)
                {
                    case 0:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    case 1:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    case 2:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    case 3:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    case 4:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    case 5:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    case 6:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    case 7:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    case 8:
                    {System.out.println("Playing "+ ar[select_songs]);
                    break;}
                    default:
                    {System.out.println("Invalid Choice");
                    }
                }
            }else
            {System.out.println("Invalid");}
            break;
            }
            case 3:
            {
                ArrayList<String> at=new ArrayList<String>();
                        at.add("Industry Baby");
                        at.add("Fate");
                        at.add("Chances");
                        at.add("We rollin");
                        at.add("Brown munde");
                        at.add("Desires");
                        at.add("Tere te");
                        at.add("Saada pyaar");
                        at.add("Ma Belle");
                        String ar[]=new String[at.size()];
                        for(int i=0;i<at.size();i++)
                        {
                         ar[i]=at.get(i);
                        }
                System.out.println("Which is playing?");
                int s=sc.nextInt();   
             System.out.println("Playing "+ar[s+1]);
             break;
            }
            case 4:
            {
                ArrayList<String> au=new ArrayList<String>();
                        au.add("Industry Baby");
                        au.add("Fate");
                        au.add("Chances");
                        au.add("We rollin");
                        au.add("Brown munde");
                        au.add("Desires");
                        au.add("Tere te");
                        au.add("Saada pyaar");
                        au.add("Ma Belle");
                        String ar[]=new String[au.size()];
                        for(int i=0;i<au.size();i++)
                        {
                         ar[i]=au.get(i);
                        }
                System.out.println("Which is playing?");
                int s=sc.nextInt();
                System.out.println("Playing "+ar[s-1]);
                break;
               }
            default:
            {
                System.exit(0);
               
            }
        }
    }
        else{
            {System.out.println("Invalid");}

        }
        }
    }

        