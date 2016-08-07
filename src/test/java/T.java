
import java.io.IOException;

import de.jwi.jspwiki.uptimeplugin.Uptime;

public class T
{
	
	public static void main(String[] args) throws IOException
	{
		Uptime uptime = new Uptime();
		
		String s = uptime.uptime();
		System.out.println(s);
		s = uptime.loadavg();
		System.out.println(s);
	}

}
