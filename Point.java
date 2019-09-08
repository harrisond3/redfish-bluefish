class Point
{
   public Point()
   {
      x = 0;
      y = 0;
   }


   public Point( final int aX, final int aY )
   {
      x = aX;
      y = aY;
   }


   public String toString()
   {
      return "x:" + Integer.toString(x) + " y:" + Integer.toString(y);
   }


   public void add( final Point aOther )
   {
      x += aOther.x;
      y += aOther.y;
   }

   public int x;
   public int y;
}

