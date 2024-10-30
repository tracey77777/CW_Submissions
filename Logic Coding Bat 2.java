public boolean old35(int n) {
  if (n % 3 == 0 && n % 5 == 0) 
  {
    return false;
  }
   if (n % 3 == 0 || n % 5 == 0) 
  {
    return true;
  }
  else
  {
    return false;
  }
}








public String alarmClock(int day, boolean vacation) {
  if (vacation == true)
  {
    if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
    {
      return "10:00";
    }
    if (day == 0 || day == 6) 
    {
      return "off";
    }
  }
  else
  {
  if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
  {
    return "7:00";
  }
  if (day == 0 || day == 6)
  {
    return "10:00";
  }
}
return "off";
}






public boolean in1To10(int n, boolean outsideMode) {
  if (!outsideMode)
  {
    if (n >= 1 && n <= 10)
    {
    return true;
    }
  }
  
  if (outsideMode)
  {
    if (n <= 1 || n >= 10)
    {
      return true;
    }
    else
  {
  return false;
  }
}
return false;
}



