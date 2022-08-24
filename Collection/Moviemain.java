package Collection;

import java.util.HashSet;

public class Moviemain {

	public static void main(String[] args)  {
		Movie m1=new Movie("theri","alleat",4,4.5f);
		Movie m2=new Movie("bahubali","rajmaouli",4,3.5f);
		Movie m3=new Movie("tghfhg","alleat",4,3.5f);
		Movie m4=new Movie("th","alleat",4,5.5f);
		HashSet<Movie>set=new HashSet<Movie>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		for(Movie m:set)
		{
			System.out.println(m);
		}
		System.out.println("====================================================================================");		
	
	for(Movie m:set)
	{
		if(m.getRating()>=4 && m.getDuration()>4)
		{
			System.out.println(m.getMoviename()+" "+m.getDirector());
		}
		else
		{
		//	throw new Exception("movie rate low");
		}
		}
	}

}
