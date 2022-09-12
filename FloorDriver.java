class Tile{

    int edgelength;

    Tile(int len)
    {
        edgelength = len;
    }



}


//floor class with area function
class Floor{

    int Rlength, Rwidth, tArea, fArea, TotalTiles;

    Floor(int l, int w)
    {
        Rlength = l;
        Rwidth = w;
    }

    void totalTiles(Tile t)
    {
        tArea= t.edgelength * t.edgelength;

        fArea = Rlength * Rwidth;

        TotalTiles = fArea/tArea;

        System.out.println("The area of a single tile: "+tArea+". The area of the floor is: "+fArea+". Total number of tiles required is : "+TotalTiles);

    }


}




class FloorDriver{
    public static void main(String[] args){

        Tile t1 = new Tile(2);
        Floor f1 = new Floor(4,5);

        f1.totalTiles(t1);

    }
}