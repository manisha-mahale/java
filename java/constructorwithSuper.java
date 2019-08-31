class constSup
{
	constSup()
	{
		System.out.println( " Super A... " ) ;
	}
	constSup( int a )
	{
		this() ;
		System.out.println( " Super B... ") ;
	} 
}
class constructorwithSuper extends constSup
{
	constructorwithSuper()
	{
		this(2);
		System.out.println( " Sub A... " ) ;
	}
	constructorwithSuper( int b )
	{
		super( 10 ) ; 
		System.out.println( " Sub B... " ) ;
	}
	public static void main( String args[] )
	{
		constructorwithSuper Sup = new constructorwithSuper();
	}
}
