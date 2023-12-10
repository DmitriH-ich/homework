package homework37;

public class RemoteControl {

    private int frequency;
    private int channel;
    private Tv tv;

    public RemoteControl(int frequency, int channel, int frequencyTV, int currentChannel) {
        this.frequency = frequency;
        this.channel = channel;
        this.tv = new Tv(frequencyTV, currentChannel);
    }

    public int getFrequency() {
        return frequency;
    }

    public int getChannel() {
        return channel;
    }

    public int getFrequencyTV() {
        return tv.getFrequencyTV();
    }

    public int getCurrentChannel() {
        return tv.getСurrentChannel();
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setFrequencyTV(int frequencyTV) {
        this.tv.setFrequencyTV(frequencyTV);
    }

    public void setCurrentChannel(int currentChannel) {
        this.tv.setСurrentChannel(currentChannel);
    }


    public void status() {
        if (getFrequency() == getFrequencyTV()) {
            tv.lifeChannel();
        } else {
            System.out.println("Теливизор не реагирует");
        }
    }
        public void changeUp() {
        setChannel(channel + 1);
        tv.setСurrentChannel(channel);
    }

    public void changeDown() {
        setChannel(channel - 1);
        tv.setСurrentChannel(channel);
    }

    public void changeFree( int ch) {
            setChannel(channel = ch);
            tv.setСurrentChannel(channel = ch);
        }
    public void afterStatus(){
        System.out.println("Частота пульта: " + getFrequency() + " kHz" + "\nЧастота телевизора: "
                + getFrequencyTV() +  " kHz" + "\nВключили канал  " + getChannel());
    }
}


