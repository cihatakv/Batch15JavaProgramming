package day41;

public class TV {

    String name;
    boolean isOn;
    int currentChannel;

    public void turnOn() {
        if (isOn == false) {
            System.out.println("Turning on TV");
            isOn = true;
        }
    }

    public void turnOff() {
        if (isOn == true) { // if (isOn)
            System.out.println("Turning off TV");
            isOn = false;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    // We cannot set a channel if the TV is Off!!!
    public void setCurrentChannel(int newChannelNumber) {
        if (isOn == true) {
            currentChannel = newChannelNumber;
        } else
            System.out.println("TURN ON THE TV FIRST");
    }

    public void moveForward() {
        currentChannel++;
    }

    public void moveBackward() {
        currentChannel--;
    }

    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
