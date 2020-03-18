package day40;

/*
Create a class called SpaceShip
it has 4 attributes :
	name as String
	currentDirection as String  | up , down , right, left
	xCordinate as int
	yCordinate as int
*/

public class SpaceShip {
    String name;
    String currentDirection;
    int xCoordinate;
    int yCoordinate;

//    setInitialPosition
//    accept 2 int parameters
//    to provide initial position of spaceship

    public void setInitialPosition(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
    }

    //      setDirection  void method
// 	 	accept 1 String parameter to set the direction
    public void setDirection(String newDirection) {

        // direction can only be up , down , right , left
        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {

            currentDirection = newDirection;
        } else {
            System.out.println("Invalid Direction");
            // we set the direction to empty value if user pass wrong direction
            currentDirection = "";
        }
    }


    //  move1Block    void method
// 	 	accept no parameter
// 	 	and change the position according to the direction
    public void move1Block() {
        // currentDirection CAN NOT BE NULL
        // OR IT WILL THROW AN EXCEPTION
        switch (currentDirection) {
            case "right":
                xCoordinate += 1;  // increasing x coordinate by 1 if spaceship move right
                break;
            case "left":
                xCoordinate -= 1; // decreasing x coordinate by 1 if spaceship move left
                break;
            case "up":
                yCoordinate += 1;  // increasing y coordinate by 1 if spaceship move up
                break;
            case "down":
                yCoordinate -= 1;  // decreasing y coordinate by 1 if spaceship move down
                break;
            default:
                break;
        }

    }

    // Add a functionality to move1Block with direction provided in one shot

    /**
     * This will take a direction and move spaceship object 1 block
     *
     * @param newDirection
     */
    public void move1Block(String newDirection) {
        // we are reusing the functionality we already have to set the direction
        setDirection(newDirection);
        // we are reusing the functionality we already have to smove1Block
        move1Block();

    }

// 	 toString method
// 	 	return String representation of Spaceship Object
//    public String toString(){
//        return "[name = " + name + " | currentDirection = " + currentDirection + " | xCoordinate = " + xCoordinate + " | yCoordinate = " + yCoordinate + "]";
//    }

    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
