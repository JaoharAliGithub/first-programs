
package objectsandclasses;

public class TV { // data fields below
    int channel = 1; // Default Channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // Tv is off

    public TV() { // constructor
    }

    public void turnOn() {
        on = true; // turn on tv
    }

    public void turnOff() {
        on = false; // turn off tv
    }

    public void setChannel(int newChannel) { // set a new channel
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) { // set a new volume
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }

}