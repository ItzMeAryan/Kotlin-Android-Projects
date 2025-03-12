package com.example.kotlinbasics


fun main(){
    // Multiline Comments
    /*
    *a
    *b
    *c
    */

    //list
    //this is a immutable list
    val shoppingList = listOf("Processor", "RAM", "SSD", "Graphics Card")
    // so we can't use shoppingList.add()

    // to solve this wee can use immutable list
    val shoppingList1 = mutableListOf("Processor", "RAM", "SSD", "Graphics Card")
    shoppingList1.add("Cooling System")
    shoppingList1.remove("Graphics Card")//either by index or by name, both works
    shoppingList1.add("Graphics Card RTX 4090")
    println(shoppingList1)

    // index in lists
    println(shoppingList1.removeAt(2))
    println(shoppingList1)
    shoppingList1.add(2, "SSD")
    println(shoppingList1)

    //Modifying specific items in a list
    println(shoppingList1[2])
    shoppingList1.set(4, "Graphics Card RX 7800XT")
    // or u can use shoppingList[4] = "Graphics Card RX 7800XT"
    println(shoppingList1)

    //contains method
    println(shoppingList1.contains("SSD"))
    println(shoppingList1.contains("Pan"))

    // For Loop
    for (a in shoppingList1){
        print(a+" ")
    }
    println()
    //break
    for (a in shoppingList1){
        print(a+" ")
        if(a == "RAM"){
            shoppingList1.removeAt(shoppingList1.lastIndex)
            break
        }
    }
    println()
    println(shoppingList1)

    //Getting index in a for a loop
    println(shoppingList1.size)
    for (index in 0 until shoppingList1.size){
        println(shoppingList1[index])
    }
    //another way
    for (index in 0..4){
        println(index)
    }

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    for (i in 0 until numbers.size){
        numbers[i] = numbers[i]*2
    }
    println(numbers)
}
