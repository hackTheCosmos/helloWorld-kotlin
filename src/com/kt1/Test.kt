package com.kt1

//constante (const val) :: must be assigned a value at compile time, can't be local
const val DATE_OF_BIRTH: Int = 1989

fun main () {
	
	//constante (val) : can be assigned a value at runtime, must be local
	val name = "jo"
	
	
	//variable (var) avec inférence de type(détection automatique du type de la variable, c'est optionnel)
	var greetings:String = "hello"
	
	//variable qui peut être possiblement nulle(?)
	var religion:String? = "xyz"
	//on vérifie si la variable "religion" est nulle avant de la modifier
//	religion?.uppercase()
	
	//affiche variables en console
	println(name)
	println("Hello $name")
	println (greetings)
	println (religion)
	println(DATE_OF_BIRTH)
	
}