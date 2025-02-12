public boolean has23(int[] nums) {
  if (nums[0] == 2 || nums[1] == 2)
  {
    return true;
  }
  else if (nums[0] == 3 || nums[1] == 3)
  {
    return true;
  }
  else
  {
    return false;
  }
}







public boolean no23(int[] nums) {
  if (nums[0] == 2 || nums[1] == 2)
  {
    return false;
  }
  if (nums[0] == 3 || nums[1] == 3)
  {
    return false;
  }
  else
  {
    return true;
  }
}








public int[] makeLast(int[] nums) 
{
  int[] temp = new int[2 * nums.length];
  temp[temp.length - 1] = nums[nums.length - 1];
  return temp;
}










public boolean double23(int[] nums)
{
   int twoTwice = 0;
   int threeTwice = 0;
      
    for(int i = 0; i < nums.length; i++) 
    {
        if(nums[i] == 2)
            twoTwice++;
                        
        if(nums[i] == 3)
            threeTwice++;
    }
                                      
    return twoTwice == 2 || threeTwice == 2; 
}









public int[] fix23(int[] nums) 
{
  for(int i = 0; i < nums.length - 1; i++) 
  {
    if(nums[i] == 2 && nums[i + 1] == 3)
    {
      nums[i + 1] = 0;
    }
  }     
    return nums;
}








public int start1(int[] a, int[] b) 
{
 int count = 0;
    
  if(a.length > 0 && a[0] == 1)
    {
      count++;
    }
        
  if(b.length > 0 && b[0] == 1)
    {
      count++;
    }                
    return count;  
}








public int[] biggerTwo(int[] a, int[] b) 
{
  if (a[0] + a[1] > b[0] + b[1])
  {
    return a;
  }
  else if (a[0] + a[1] < b[0] + b[1])
  {
    return b;
  }
  else
  {
    return a;
  }
}









public int[] makeMiddle(int[] nums) 
{
  return new int[] {nums[nums.length/2-1], nums[nums.length/2]};
}









public int[] plusTwo(int[] a, int[] b) 
{
  return new int[] {a[0], a[1], b[0], b[1]};
}





public int[] swapEnds(int[] nums) 
{
   int temp = nums[0];
   nums[0] = nums[nums.length - 1];
   nums[nums.length - 1] = temp;
   return nums;
}











public int[] midThree(int[] nums) 
{
  int[] arr = new int[3];
  arr[0] = nums[nums.length / 2 - 1];
  arr[1] = nums[nums.length / 2];
  arr[2] = nums[nums.length / 2 + 1];
  return arr;
}









public int maxTriple(int[] nums) 
{
  int largest = nums[0];
    
  if(largest < nums[nums.length / 2])
      {
         largest = nums[nums.length / 2];
      }
  if(largest < nums[nums.length - 1])
      {
         largest = nums[nums.length - 1];
      }
                        
    return largest;
}










public int[] frontPiece(int[] nums) 
{
  int[] arr;
    if(nums.length < 2)
      {
        arr = new int[nums.length];
      }
    else
      {
        arr = new int[2];
      }
                  
    if(nums.length > 0)
      {
        arr[0] = nums[0];
      }
                            
    if(nums.length > 1)
      {
        arr[1] = nums[1];
      }
                                    
    return arr;
}









public boolean unlucky1(int[] nums) 
{
  if(nums.length >= 2 && (nums[0] == 1 && nums[1] == 3 || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3))
    { 
      return true;
    }
                       
  if(nums.length >= 3 && nums[1] == 1 && nums[2] == 3)
    {
      return true;
    }
    
  else
    {
      return false;
    }
     
}










public int[] make2(int[] a, int[] b) 
{
    int[] arr = new int[2];
    int count = 0;
    int i;
        
    i = 0;
    while(count < 2 && i < a.length) 
    {
       arr[count] = a[i];
       count++;
       i++;
    }
                            
    i = 0;
    while(count < 2 && i < b.length) 
    {
       arr[count] = b[i];
       count++;
       i++;
    }
                                                
    return arr;
}












public int[] front11(int[] a, int[] b) 
{
  if(a.length > 0 && b.length > 0) 
   {
     return new int[] {a[0], b[0]};
   } 
   
   else if (a.length > 0) 
   {
     return new int[] {a[0]};
   } 
   
   else if (b.length > 0) 
   {
     return new int[] {b[0]};
   }
                      
    return new int[0];
}


