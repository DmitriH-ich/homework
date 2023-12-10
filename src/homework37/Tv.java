package homework37;

public class Tv {
    private int frequencyTV;
    private int СurrentChannel;

    public Tv(int frequencyTV, int сurrentChannel) {
        this.frequencyTV = frequencyTV;
        СurrentChannel = сurrentChannel;
    }

    public int getFrequencyTV() {
        return frequencyTV;
    }

    public void setFrequencyTV(int frequencyTV) {
        this.frequencyTV = frequencyTV;
    }

    public int getСurrentChannel() {
        return СurrentChannel;
    }

    public void setСurrentChannel(int сurrentChannel) {
        this.СurrentChannel = сurrentChannel;
    }
    public void lifeChannel() {
        System.out.println("На теливизоре показывает канал:  " + getСurrentChannel());
    }
}
