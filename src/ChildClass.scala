class ChildClass(override val anyText: String, val anyText2: String) 
    extends ParentClass(anyText) {
  
  //var anyInnerText: String = anyText
  //var anyInnerText2: String = anyText2
  
  override def firstMethod(otherText: String){
    println("Variable are " + 
        "anyText=" + anyText + 
        " anyText2=" + anyText2 + 
        " otherText=" + otherText); 
    
    println("Result is " + anyInnerText + " " + otherText);    
  }
}
