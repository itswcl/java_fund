/*
define function, function name, parameter
able to return any type in JS
function getGreeting() {
    return "Hello From your old friend JS!";
}
*/

public String basicGreeting() {return "Hello, lovely to see you. How are you?";};


// method signatures

public String guestGreeting(String name, String dayPeriod) {};

public void fooBar(int someNumber, String someString) {};

// overloading methods // invoke based on arguments giving
public String guestGreeting(String name) {}

public String guestGreeting(String name, String dayPeriod) {}