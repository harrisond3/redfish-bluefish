import java.util.List;
import java.util.ArrayList;

class Lake
{
   public Lake( final int aWidth, final int aHeight )
   {
      _mFishInLake = new ArrayList<Fish>();

      _mUpperBounds = new Point( aWidth, aHeight );
      _mTimeStep = 0;
   }

   
   public void addFish( final Fish aNewFish )
   {
      _mFishInLake.add( aNewFish );
   }


   public void coaxFish()
   {
      _mTimeStep++;
      for ( final Fish fish : _mFishInLake )
      {
         fish.swim( _mUpperBounds );
         checkLocation( fish );
      }
   }


   public void reportFishStates()
   {
      System.out.println( "Lake at time stamp " + Integer.toString( _mTimeStep ) );
      for ( final Fish fish : _mFishInLake )
      {
         System.out.println( fish.toString() );
      }
   }


   private void checkLocation( final Fish aFish )
   {
      Point endLocation = aFish.getLocation();
      if ( endLocation.x < 0 )
      {
         System.err.println( "ERROR: Fish " + aFish.toString() + " swam too far West" );
         System.exit(0);
      }
      else if ( endLocation.y < 0 )
      {
         System.err.println( "ERROR: Fish " + aFish.toString() + " swam too far North" );
         System.exit(0);
      }
      else if ( endLocation.x >= _mUpperBounds.x )
      {
         System.err.println( "ERROR: Fish " + aFish.toString() + " swam too far East" );
         System.exit(0);
      }
      else if ( endLocation.y >= _mUpperBounds.y )
      {
         System.err.println( "ERROR: Fish " + aFish.toString() + " swam too far South" );
         System.exit(0);
      }
   }

   // member variables
   private Point _mUpperBounds;
   private int _mTimeStep;
   private List<Fish> _mFishInLake;
}

