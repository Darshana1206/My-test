package new1

import scala.util.control.Breaks._
object firstScala {
  def main(hiru:Array[String])
  {
   search("ABCDFABC","ABC")
  }
  
  def search(txt:String,pat:String)
  {
    var m:Int=txt.length()
    var n:Int=pat.length()
    
   
    var i:Int=0
  
    for(i<-0 to (m-n))
    {
       var j:Int=0
      
      while(j<n && txt.charAt(i+j)== pat.charAt(j)){
         j=j+1 
       
      
          if(j==n) 
          {
            println("Pattern found the index "+i)
          }
        
      }
       
     }
   
    }
} 