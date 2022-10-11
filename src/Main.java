public class Main
{
    public static void main(String[] args)
    {
        for(int x=0;x <= 30; x++)
        {
            System.out.println(x);
        }
//====================================================
        for(int l=0; l<3; l++)
            System.out.println();
        for(int x=30; x >= 0; x--)
        {
            System.out.println(x);
        }
//=====================================================
        for(int l=0; l<3; l++)
            System.out.println();
        for(int x=0;x <=18; x += 3)
        {
            System.out.println(x);
        }

        for(int l=0; l<3; l++)
            System.out.println();

        for(int x = 10; x >=0; x -= 2)
        {
            System.out.println(x);
        }
//=======================================================

        for(int r=0; r <= 4; r++)
        {
            System.out.print("\n*");
            for(int c= 0; c <=3; c++)
            {
                System.out.print("*");
            }
        }
//========================================================
        for(int l=0; l<3; l++)
            System.out.println();


        for(int c=1; c <= 5; c++)
        {
            for(int r = 1; r <= c; r++)
           {
                System.out.print("*");
           }
            System.out.println();

        }
//=========================================================
        for(int l=0; l<3; l++)
            System.out.println();

        for(int w = 5; w>= 1; w--)
        {
            for(int r = 1; r <= w; r++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//=========================================================================






    }
}