public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    start= st;
    size= sz;
    cir= new Object[lin.length];
    for(int i= 0, j= start; i<cir.length; i++, j++)
    {
      int index= j%lin.length;
      cir[index]= lin[i];
    }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){   
    for(int i=0; i<cir.length; i++)
        {
          if(i==cir.length-1)
          {
            System.out.println(cir[i]+".");
          }
          else
          {
            System.out.print(cir[i]+", ");
          }
        }
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    for(int i=start, j=size;j>0; j--, i++)
    {
      int index= i%cir.length;
      
      if(j==1)
      {
        System.out.println(cir[index]+".");
      }
      else
      {
        System.out.print(cir[index]+", ");
        
      }
    }
  }
  
  
  public void printBackward(){
    int index= start +size-1; 
    index= index%cir.length;
    for(int i=index, j=size;j>0; i--, j--)
    {
      if(i<0)
      {
        i= cir.length-1;
      }
      if(j==1)
      {
        System.out.println(cir[i]+".");
      }
      else
      {
        System.out.print(cir[i]+", ");
      }
    }
  }
  
  // With no null cells
  public void linearize(){
    Object [] newarray= new Object[size];
    for(int i = start, j=0; j<newarray.length; j++, i++)
    {
      int index= i%cir.length; 
      newarray[j]= cir[index];
    }
    cir= newarray;
    
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object [] resized= new Object[newcapacity];
    {
      if(newcapacity>size)
      {
        for(int i=start, j=size; j>0; i++, j--)
        {
          int index= i%cir.length;
          int index2= i%resized.length;
          resized[index2]= cir[index];
        }
      }
      else
      {
        for(int i= start,j= resized.length; j>=0; i++, j--)
        {
          int index= i%cir.length; 
          int index2= i%resized.length;
          resized[index2]= cir[index];
        }
      }
      
      cir= resized;
    }
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object [] resized= new Object[newcapacity];
    {
      if(newcapacity>size)
      {
        for(int i=start, j=0; j<size; i++, j++)
        {
          int index= i%cir.length;
          resized[j]= cir[index];
        }
      }
      else
      {
        for(int i= start,j= 0; j<resized.length; i++, j++)
        {
          int index= i%cir.length; 
          resized[j]= cir[index];
        }
      }
      
      cir= resized;
    }
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    if(pos<0 && pos>=size)
    {
      System.out.println("Invalid position");
    }
    if(size==cir.length)
    {
      int newlength= size+3;
      resizeStartUnchanged(newlength);
    }
    int from= (start+size-1)%cir.length; 
    int to= (from+1)%cir.length;
    for(int i= from; i>= start+pos; i--)
    {
      if(from<0)
      {
        from = cir.length-1;
      }
      cir[to]= cir[from];
      cir[from]= null;
      to = from;
      from--;
    }
    cir[pos+start]= elem;
    size++; 
  }
  
  public void insertByLeftShift(Object elem, int pos){
    if(pos<0 || pos>=size)
    {
      System.out.println("Invalid position");
    }
    if(size==cir.length)
    {
      int newlength= size+3;
      resizeStartUnchanged(newlength);
    }
    int from= start;
    int to= (start-1);
    if(to<0)
    {
      to = cir.length-1;
    }
    int nshift= pos+1;
    for(int i=nshift; i>0; i--)
    {
      from= from%cir.length;
      cir[to]= cir[from];
      to= from;
      from++;
    }
    cir[start+pos]= elem;
    start--; 
    if(start<0)
    {
      start = cir.length-1;
    }
    size++;
    size= size%cir.length;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    if(pos<0 || pos>size-1)
    {
      System.out.println("Invalid position");
    }
    int removalIndex= (start+pos)%cir.length; 
    cir[removalIndex]= null;
    int nshift= size-1-pos;
    int from = removalIndex+1;
    int to= removalIndex;
    for(int i = nshift; i>0; i--)
    {
      from= from%cir.length;
      cir[to] = cir[from];
      cir[from] =null;
      to = from;
      from++;
    }
    size--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    if(pos<0 || pos>size-1)
    {
      System.out.println("Invalid position");
    }
    int removalIndex= (start+pos)%cir.length; 
    cir[removalIndex]= null;
    int nshift= size-pos+1;
    int from = removalIndex-1;
    int to= removalIndex;
    for(int i = nshift; i>0; i--)
    {
      if(from<0)
      {
        from = cir.length-1;
      }
      cir[to]= cir[from];
      cir[from] =null;
      to= from;
      from--;
    }
    start++;
    start= start%cir.length;
    size--;
  }
  
}