package main.try_2.functionalProgramming.lesson_16_5.optional;

public class SoundCardOpt {
    private USBOpt usb;

    public SoundCardOpt(USBOpt usb) {
        this.usb = usb;
    }

    public USBOpt getUsb() {
        return usb;
    }
}
