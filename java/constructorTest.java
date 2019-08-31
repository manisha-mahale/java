class construct
{
	construct()
	{
		System.out.println( " A " ) ;
	}
	public void m( int i )
	{ 
		System.out.println( " Method called... " ) ;
	}
}
class constructorTest extends construct
{
	constructorTest()
	{
		System.out.println( " B " ) ;
	}
	public static void main( String args[] )
	{
		construct c = new construct() ;
		constructorTest c1 = new constructorTest() ;
		c.m( 10 ) ;
		c1.m( 1 ) ;
	}
}
