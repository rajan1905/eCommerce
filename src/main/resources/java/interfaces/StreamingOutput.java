package interfaces;

import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.WebApplicationException;

public interface StreamingOutput 
{
	public void write(OutputStream os) throws IOException,	WebApplicationException;
}
