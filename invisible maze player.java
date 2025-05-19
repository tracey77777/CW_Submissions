
public class Player {
	
		int rPos;
		int cPos;

	
	
	public Player ()
	{
		rPos = 0;
		cPos = 0;
	}

	public int[] getPos()
	{
		int [] pos = {rPos,cPos};
		return pos;
	}
	
	public void setR (int newR)
	{
		rPos = newR;
	}
	
	public void setC (int newC)
	{
		cPos = newC;
	}
	
	public int getrPos()
	{
		//it will return the row position
		return rPos;
	}
	
	//this is the column getter
	public int getcPos()
	{
		//it will return the column position
		return cPos;
	}
	
	
	
}
