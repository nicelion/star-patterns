/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author Ian Thompson
 * @version Today
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i == 0 || i == h - 1 || j + i == h - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    
    public static void starBox(int h) {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                if (i==0 || i==h-1 || j==0 || j==w-1 || (i==j || i+j==h-1)) System.out.print("*");
                else System.out.print(" ");

            }
            System.out.println();
        }   
    }
    
    public static void twoStarBoxes(int h, int w) {
        int hH = h/2;
        int wH = h/2;
        
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {               
                if((i<hH && j<wH)||(i>=hH && j>=wH))System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }      
    }
    
    public static void starTriangle(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i >= j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
    public static void emptyTriangle(int h, int w) {
    
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == j || i == h - 1 || j == 0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void starTriangleUR(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j >= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void isoscelesStarTriangle(int h, int w) {
        w = 2 * w - 1;
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (Math.abs(j - (w / 2)) < i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) 
    {
        starGrid(8, 8);
        System.out.println();

        starBox(8, 8);
        System.out.println();
        
        starX(8);
        System.out.println();
        
        starZ(8);
        System.out.println();
        
        starBox(8);
        System.out.println();
        
        twoStarBoxes(8, 8);
        System.out.println();
        
        starTriangle(8, 8);
        System.out.println();
        
        emptyTriangle(8, 8);
        System.out.println();
        
        starTriangleUR(8, 8);
        System.out.println();
        
        isoscelesStarTriangle(8, 8);
        System.out.println();
            
    }
     
}