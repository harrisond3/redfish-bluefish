class FromHereToThere
{
	public static void main(String args[])
   {
      Lake myLake = new Lake( 10, 10 );
      myLake.addFish( new RedFish( new Point( 1, 1 ), new Point( 0, 1 ) ) );
      myLake.addFish( new RedFish( new Point( 3, 1 ), new Point( 1, 2 ) ) );
      myLake.reportFishStates();

      System.out.println( "Beginning lake sim" );
      for ( int t = 0; t < 5; t++ )
      {
         myLake.coaxFish();
         myLake.reportFishStates();
      }
   }
}
