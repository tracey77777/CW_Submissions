//makeOutWord
public String makeOutWord(String out, String word) 
{
  return out.substring(0,2) + word + out.substring(2, out.length());
}





//extraEnd
public String extraEnd(String str) 
{
  return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
}





//firstTwo
public String firstTwo(String str) 
{
  if (str.length() >= 2) 
  {
    return str.substring (0,2);
  }
   else 
   {
     return str;
   }
}






//withoutEnd
public String withoutEnd(String str) 
{
  return str.substring(1,str.length()-1);
}

