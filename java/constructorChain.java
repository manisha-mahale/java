class constructorChain
{
	constructorChain()
	{
		this( 10 ) ;
		System.out.println( " A " ) ;
	}
	constructorChain( int p )
	{
		this( 20, 30 ) ;
		System.out.println( " B " ) ;
	}
	constructorChain( int q, int r )
	{
		System.out.println( " C " ) ;
	}
	public static void main( String args[] )
	{
		constructorChain c = new constructorChain() ;
	}	
}
