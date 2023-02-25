public class RemoteController implements Controller {
    private int volume;
    private boolean on;
    private boolean playing;

    public RemoteController() {
        this.volume = 40;
        this.on = true;
        this.playing = false;
    }

    public RemoteController(int volume, boolean on, boolean playing) {
        this.volume = volume;
        this.on = on;
        this.playing = playing;
    }

   private int getVolume() {
        return volume;
    }

   private void setVolume(int volume) {
        this.volume = volume;
    }

   private boolean isOn() {
        return on;
    }

   private void setOn(boolean on) {
        this.on = on;
    }

   private boolean isPlaying() {
        return playing;
    }

   private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    // Abstract methods
    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        System.out.println("Tv is on? " + this.isOn());
        System.out.println("Is playing? " + this.isPlaying());
        System.out.print("Volume: " + this.getVolume());

        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print(" | ");
        }

    }

    @Override
    public void closeMenu() {
        System.out.println("Closing menu...");
    }

    @Override
    public void increaseVolume() {
        if (this.isOn()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void decreaseVolume() {
        if (this.isOn()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void mute() {
        if (this.isOn() && this.getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void unmute() {
        if (this.isOn() && this.getVolume() == 0) {
            this.setVolume(1);
        }
    }

    @Override
    public void play() {
        this.setPlaying(true);
    }

    @Override
    public void pause() {
        this.setPlaying(false);
    }

    // toString
    @Override
    public String toString() {
        return "RemoteController [volume=" + volume + ", on=" + on + ", playing=" + playing + "]";
    }
}
