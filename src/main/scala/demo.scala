object demo {
  def main(args: Array[String]): Unit = {
    var personOne = new Person("testAgain", 24)
    var personTwo = new Person("test", 24)
    //var personOne =new Person( name="test", age=24)
    //var personTwo=new Person(name="testAgain",age=24)
    personOne.check(personTwo)
  }
}