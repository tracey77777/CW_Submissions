//doubleChar
 public String doubleChar(String str)
{
  String twoChar = "";
  for (int i = 0; i < str.length(); i++)
  {
    twoChar += str.charAt(i);
    twoChar += str.charAt(i);
  }
  return twoChar;
}
