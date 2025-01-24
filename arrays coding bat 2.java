//#1
public int[] rotateLeft3(int[] nums) 
{
  int[] tempArr = new int[3];
  tempArr[0] = nums[1];
  tempArr[1] = nums[2];
  tempArr[2] = nums[0];
  return tempArr;
}





//#2
public int[] reverse3(int[] nums) 
{
  int[] tempArr = new int[3];
  tempArr[0] = nums[2];
  tempArr[1] = nums[1];
  tempArr[2] = nums[0];
  return tempArr;
}















//#3
public int[] maxEnd3(int[] nums) 
{
int[] tempArr = new int[3];
if (nums[0] >= nums[2])
  {
  tempArr[0] = nums[0];
  tempArr[1] = nums[0];
  tempArr[2] = nums[0];
  }
else if (nums[2] >= nums[0])
  {
  tempArr[0] = nums[2];
  tempArr[1] = nums[2];
  tempArr[2] = nums[2];
  }
  
  return tempArr;
}












//#4
public int sum2(int[] nums) 
{
if (nums.length == 0)
  {
    return 0;
  }
else if (nums.length==1)
  {
    return nums[0];
  }
else
  {
    return nums[0] + nums[1];
  }
  
}















//#5
public int[] middleWay(int[] a, int[] b) 
{
  int[] temp = new int[2];
  temp[0] = a[1];
  temp[1] = b[1];
  return temp;
}















//#6
public int[] makeEnds(int[] nums) 
{
  int[] newArr = {nums[0], nums[nums.length-1]};
  return newArr;
}
















