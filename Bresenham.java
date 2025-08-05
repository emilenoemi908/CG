public class Bresenham {

    public void algoritmoB(int x1, int y1, int x2, int y2){

        int dx= x2-x1;
        int dy= y2-y1;

        int y =y1 ,x =x1;

        int D= 2*dy-dx;

        System.out.println("(" + x + "," + y + ")");

        while(x < x2 ){

            if (D>=0){
                D+=2*(dy-dx);
                y++;
            }

            else{

                D+= 2*dy;
            }

            x++;
            System.out.println("(" + x + "," + y + ")");
        }
    }
}
