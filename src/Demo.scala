class FirstBean(val anyText: String){
  var anyInnerText: String = anyText
  
  def firstMethod(otherText: String){
    println("Result is " + anyInnerText + " " + otherText);    
  }
}



object Demo {
  var peremMutable: String = "Peremennaya 1 - mutable"; 
  val peremImMutable: String = "Peremennaya 2 - immutable";
  
  def main(args: Array[String]){
    println("Hello Scala !");
    
    val firstBean = new FirstBean("my text");
    firstBean.firstMethod("other Text");
    
    println("Print " + peremMutable);
    println("Print " + peremImMutable);
    
    printVariable("A1","A2");
    printVariable(peremMutable, peremImMutable);
    peremMutable = "Peremennaya 1 - changed";
  }

  def printVariable(p1: String, p2: String){
    println("Print p1=" + p1);
    println("Print p2=" + p2);
  }


}