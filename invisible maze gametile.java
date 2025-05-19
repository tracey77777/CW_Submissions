
public class GameTile 
{

	boolean hasPlayer;
	boolean isRevealed;
	boolean isWall;
	
	public GameTile (boolean hasPlayer, boolean isRevealed, boolean isWall)
	{
		this.hasPlayer = hasPlayer;
		this.isRevealed = isRevealed;
		this.isWall = isWall;
	}
	
	//this is the hadPlayer setter
		public void setHasPlayer(boolean newHP)
		{
			//the old hasPlayer changed into newHp
			hasPlayer = newHP;
		}
		
		//this is the isRevealed setter
		public void setIsRevealed(boolean newIsR)
		{
			//the old isRevealed changed into newHp
			isRevealed = newIsR;
		}
		
		//this is the iswall setter
		public void setIsWall(boolean newIsWall)
		{
			//the old isWall changed into isWall
			isWall = newIsWall;
		}
		
		//this is the hasplayer getter
		public boolean getHasPlayer()
		{
			//it will return hasplayer
			return hasPlayer;
		}
		
		//this is the isrevealed getter
		public boolean getIsRevealed()
		{
			//it will return isrevealed
			return isRevealed;
		}
		
		//this is the iswall getter
		public boolean getIsWall()
		{
			//it will return iswall
			return isWall;
		}
	
	
	
	public String toString()
	{
		if (hasPlayer == true)
		{
			return "!";
		}
		if (isRevealed == false)
		{
			return "X";
		}
		
		else if (isRevealed == true)
		{
			if (isWall == true)
			{
				return "|";
			}
			
			else if (isWall == false)
			{
				return "*";
			}
		}
		return "A";	
		
		//if it's not revealed, return whatever would be your blank character like a zero or underscore or something
		//else if , if it's a wall with whatever will print as your wall like "X"
	}
	
	
	
	
}

