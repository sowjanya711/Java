/* Class : 	Class is a template using which we can create an object
   -----
   	
Object : Object is an instance of class. Object has state and behavior
-------	 Object name should be class name for which we are we want to create an object 
		 class : Student
		 class Student Methods : totalMarks() , Rank()
		 Object Creation : Student s = new Student();
		 Calling methods using object : s.totalMarks(), s.Rank()

Static Variables:  Static variables are at class level. 
----------------   When a variable is declared as static, all the objects of its class share the same static variable
				   
Final Keyword: Final variable cannot be changed (once assigned a value, it cannot be changed)
-------------  Final method cannot be overridden (method implementation code cannot be changed)
			   Final Class cannot be extended
			   
Inheritance :  Acquiring the properties of a parent class is called Inheritance
------------   Class can be inherited using "extends" keyword
			   Method OverRiding can be achieved by inheritance

Polymorphism : The ability of an object to take many forms is known as Polymorphism.
------------   1. Method Overloading 2. Method OverRiding
					
Method Overloading : Two or more methods having same name but different parameters ( by changing no of arguments, 
------------------	 by changing data type)  e.g.: add Method
					 
Method OverRiding :  Let's say there are 2 classes. When a method in child class has the same method name and 
-----------------	 type signature as method in its super class, then the method in the sub class 
					 is said to be override the method in the super class e.g.: rateOfInterset Method

Abstraction : Abstraction is a process of hiding the implementation details and showing only functionality to the user.
-----------   Ways to achieve:
			  1. Abstract Class
			  2. Interface
			 
Abstract Class :  A class that is declared as Abstract is an abstract class
--------------

Abstract Method:  A method that is declared as abstract and does not have implementation is known as abstract method.
---------------
	1.	Class needs to be extended and its method needs to be implemented.
	2.	 It cannot be instantiated -- cannot create object for the abstract class.
 
Interface :
--------- 
	Notes:
	�	Interface is like Menu (blue print of class), Class is like Menu with Recipe Details
	�	In interface you declare methods but implementation of the method should be done in the class that implements 
		this interface
	�	Each class can implement the method of the interface in its own way i.e the recipe (implementation)of the menu 
		(method) can be different for each Restaurant (class)
	�	Variables can be declared inside an interface but they are implicitly "final" and "static", meaning they cannot
	 	be changed by the implementing class.
	�	The variables must also be initialized with a constant value. i.e value should be assigned.
	
 Definition:
----------	 
	1.	Interface is a blueprint of class, there can be only abstract methods in instance
	2.	It is used to achieve abstraction and multiple inheritance in Java. 
	3.	Interface can't be instantiated -- can't create an object for instance 
	4.	Interface is used to achieve data abstraction and multiple inheritance	
					 
Encapsulation : Wrapping up of data into a single unit. It provides control over the data. Access Modifiers
-------------

Constructor: It is a special type of method , it is invoked at the time of creation of object.
-----------
			Rules:
  	1. Constructor name must be the same name as its class name
  	2. Constructor must not have explicit return type
  	
Array : It is a collection of similar type of elements that have a memory location
-----	We can have only fixed size of array, it cannot grow its size in runtime.
		
		 syntax : int a [] = new int[5];
		 ------
 dataType arr[];  --> declaration
 new dataType[size] --> Instantiation

Object Class:
------------

The Object class is parent class of all the classes in java by default. 
The Object class is beneficial if you want to refer any object whose type you don't know

Collections:
-----------

Collection Framework provides architecture for storing and manipulating group of objects. It has
	1. Interfaces and its implementations (Classes)
	2. Algorithm
	
	 Collections <interface>
	 1. Set <interface> --> HashSet (class), Linked HashSet (class), TreeSet - Sorted (class)
	 2. List <interface> --> ArrayList (class), LinkedList (class), Vector (class)
	 3. Map <interface> --> HashMap (class), LinkedHashMap (class), Hashtable (class), TreeMap - Sorted (class)
	 
	Iterator / ListIterator :
	-----------------------	 
	
	Both iterator and list iterator are both used to iterate through the elements in the collections class.
	 1. Iterator (One direction - forward)
	 2. ListIterator (both directions - backward and forward)
	 
	 Comparable and Comparator Interfaces :
	 ------------------------------------
	 
	 These interfaces are used for sorting objects of user defined class.

List Collection : 
---------------
 List is an Ordered Collection
	 	* List may contain duplicate elements
	 	* List may include null
	 	* List can grow or shrink dynamically

Syntax for Creation of ArrayList :
--------------------------------

ArrayList<datatype> al = new ArrayList<datatype>();

e.g. : ArrayList<String> al = new ArrayList<String>();






























*/
