package main.try_1.functionalProgramming.lesson5;

public class SoundCardWithOpt {
    private USBWithOpt usb;

    public SoundCardWithOpt(USBWithOpt usb) {
        this.usb = usb;
    }

    public USBWithOpt getUsb() {
        return usb;
    }
}
