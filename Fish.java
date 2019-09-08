abstract class Fish
{
   public enum Color
   {
      RED,
      BLUE,
      GREEN,
      YELLOW,
      ORANGE,
      PURPLE
   }


   public Fish( final Point aLocation, final Point aDirection, final Color aColor )
   {
      _mLocation = aLocation;
      _mDirection = aDirection;
      _mColor = aColor;
   }


   public abstract void swim( final Point aLakeBounds );


   public String toString()
   {
      return "Color: " + _mColor.toString() + " Location: " + _mLocation.toString() + " Direction: " + _mDirection.toString();
   }


   public Point getLocation()
   {
      return _mLocation;
   }


   public Point getDirection()
   {
      return _mDirection;
   }


   protected Point _mLocation;
   protected Point _mDirection;
   protected Color _mColor;
}

