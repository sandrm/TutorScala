class FirstBean(val anyText: String){
  var anyInnerText: String = anyText
  
  def firstMethod(otherText: String){
    println("Result is " + anyInnerText + " " + otherText);    
  }
}



object Demo {
  def main(args: Array[String]){
    println("Hello Scala !");
    
    val firstBean = new FirstBean("my text");
    firstBean.firstMethod("other Text");
  }
}