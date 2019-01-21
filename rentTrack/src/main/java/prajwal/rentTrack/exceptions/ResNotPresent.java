package prajwal.rentTrack.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResNotPresent extends RuntimeException
{
	public ResNotPresent(String msg)
	{
		System.out.println(msg);
	}
}

