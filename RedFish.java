class RedFish extends Fish
{
   public RedFish( final Point aLocation, final Point aDirection )
   {
      super( aLocation, aDirection, Color.RED );
   }
   

   public void swim( final Point aLakeBounds )
   {
      _mLocation.add( _mDirection );
   }
}

