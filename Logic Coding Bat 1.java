public boolean cigarParty(int cigars, boolean isWeekend) {
  
  if (isWeekend)
  {
    return (cigars >= 40);
  }
  else 
  {
    return (cigars <= 60 && cigars >= 40);
  }

}




public int dateFashion(int you, int date) {
  if(you <= 2 || date <= 2)
  {
    return 0;
  }
 else if(you >= 8 || date >= 8)
  {
    return 2;
  }
  else
  {
    return 1;
  }
}






public int caughtSpeeding(int speed, boolean isBirthday) {
if (!isBirthday)
  {
      if (speed <= 60)
    {
      return 0;
    }
    if (speed <= 80 && speed >= 61)
    {
      return 1;
    }
    if (speed >= 81)
    {
      return 2;
    } 
    else
    {
     return 0;
    }
  }
  if (isBirthday)
  {
      if (speed <= 65)
    {
      return 0;
    }
    if (speed <= 85 && speed >= 61)
    {
      return 1;
    }
    if (speed >= 86)
    {
      return 2;
    } 
    else
    {
    return 0;
    }
}
return 0;
}






public boolean squirrelPlay(int temp, boolean isSummer) {
  if (isSummer)
  {
    return (temp >= 60 && temp <= 100);
  }
  else 
  {
    return (temp >= 60 && temp <= 90);
  }
  
}







public int sortaSum(int a, int b) {
  if (a + b >= 10 && a + b <= 19)
  {
    return 20;
  }
  return a + b;
}


