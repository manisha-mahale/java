class accessModifierwithConstructor
{
	private accessModifierwithConstructor()
	{
		System.out.println( " A " ) ;
	}
	public accessModifierwithConstructor( int x )
	{
		System.out.println( " B " ) ;
	}
	protected accessModifierwithConstructor( int y, int z )
	{
		System.out.println( " C " ) ;
	}
	public static void main( String args[] )
	{
		accessModifierwithConstructor a = new accessModifierwithConstructor() ;
		accessModifierwithConstructor b = new accessModifierwithConstructor( 10 ) ;
		accessModifierwithConstructor c = new accessModifierwithConstructor( 20, 30 ) ;
	}
}
