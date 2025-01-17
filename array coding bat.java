//#1
public boolean firstLast6(int[] nums) {
  if (nums[0] == 6 || nums[nums.length-1] == 6)
  {
    return true;
  }
  else 
  {
    return false;
  }
}







//#2
public boolean sameFirstLast(int[] nums) 
{
  if (nums.length == 0)
  {
    return false;
  }
     if (nums[0] == nums[nums.length-1])
        {
           return true;
        }
     else
       {
          return false;
      }
}





//#3
public int[] makePi() 
{
 int [] arPi = {3,1,4};
 return arPi;
}






//#4
public boolean commonEnd(int[] a, int[] b) 
{
  if (a[0] == b[0] || a[a.length-1] == b[b.length-1])
  {
    return true;
  }
  else
  {
    return false;
  }
}






//#5
public int sum3(int[] nums) 
{
  return nums[0]+nums[1]+nums[2];
}












