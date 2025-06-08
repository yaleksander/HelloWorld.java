package it.nanowar.ofsteel.helloworld;

public class HelloWorldMainLauncherClass
{
	public HelloWorldMainLauncherClass(int foo)
	{
		super();
		this.foo = foo;
	}

	private Integer foo = 0;

	public void SongRefrain()
	{
		for (int i = 0; i < foo; i++)
			System.out.println("Hello World!");

		int pippo = 0;
		while (pippo < foo)
		{
			System.out.println("Hello World!");
			pippo++;
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Hello World Programmer Start");
		HelloWorldMainLauncherClass titzio = new HelloWorldMainLauncherClass(2);
		titzio.SongRefrain();
		System.out.println("Program Finished!");
		titzio.falseMethod();
	}

	/*
	 * If I may introduce a bug, the JVM will manage it for me
	 * ensuring both security and portability
	 * Then I'll write my code once, and run it everywhere!
	 * With Static and Strong Typing, will let my program be type safe!
	 */

	public void falseMethod()
	{
		boolean metal = false;
		if (metal == false)
		{
			String joeyDeCaio = null;
			System.out.println(joeyDeCaio.length());
		}
	}
}
