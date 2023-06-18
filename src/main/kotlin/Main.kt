fun main(){
    var myStack = Stack()
    println(myStack.pop())
    myStack.push(67)
    myStack.push(32)
    myStack.push(45)
    println(myStack.peek())
    myStack.pop()
    myStack.push(18)
    var x = myStack.pop()
    var y = myStack.pop()
    var z = x!!+y!!
    println()

}

class Stack{
    var data = mutableListOf<Int>()


    //adds an element to the stack
    fun push(value:Int){
        data.add(value)
    }
    //removes the list element at the top, if  list is empty returns a null
    //also returns the last element removed from the list.
    fun pop(): Int?{
        if(data.isEmpty()){
            return null
        }
        var top =data[data.lastIndex]
        data.remove(data.lastIndex)
        return top
    }
    //returns null if the list is empty
    fun peek():Int?{
        if(data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    //if the data is empty should return true else false

    fun isEmpty(): Boolean{
        return data.isEmpty()
    }
}