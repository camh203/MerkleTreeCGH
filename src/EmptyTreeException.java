/**
   A class of runtime exceptions thrown by methods to
   indicate that a tree is empty.

   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.2
 */
public class EmptyTreeException extends RuntimeException
{
	public EmptyTreeException()
	{
		this(null);
	} // end default constructor

	public EmptyTreeException(String message)
	{
		super(message);
	} // end constructor
} // end EmptyTreeException
