<br/>
Name ____________________________
CPT-167-27
Moar Objects
Points 65

##### 1. What is the Single Responsiblity Principle? (5 pts)
<br/><br/><br/><br/>

##### 2. Does this class conform to Open Close? and Why? (10 pts)
```Java
class Wine{
  private String name;
  private int year;
  private String winery;
  private double milliliter;
  
  public String bottleType(){
    if(this.milliliter > 750){
      return "big bottle";
    }else if(this.milliliter < 750){
      return "normal bottle";
    }else{
      return "unknown bottle";
    }
  }
}
```
<br/><br/>

##### 3. Write a "Player" object with appropriate constructors and methods (20 pts)
###### Reqs
- Player has a `hitpoint`(starts at 20 max is 20) stat and an `ac`(starts at 20) stat
- Player can take damage and should have a `damageTaken` method (AC mitigates its values worth of damage so if damage taken is 30 and AC is 20 the actual damage taken is 10 -> damage - `ac` = 10)
- Player can `heal` and when they heal they gain 5hp but never more than their max (20)
- Player can also see her health with the `hitpoint` accessor
- Player should have a `name`, `class`, and `race` properties
<br/><br/>

##### 4. Write a program that can manage a Todo list. (30 pts)
A todo list or check list is a series of items that have the state of done or not done
###### Reqs
- User shall be able to add a Todo
- User shall be able to find a Todo by index
- User shall be able to complete a Todo
- User shall be able to print all of the Todos to the screen with their index
- User shall be able to exit the program when they are done managing the Todo list
