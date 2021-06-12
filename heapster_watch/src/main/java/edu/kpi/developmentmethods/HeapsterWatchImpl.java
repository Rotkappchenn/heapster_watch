package edu.kpi.developmentmethods;


public class HeapsterWatchImpl implements HeapsterWatch{
    /**
     * Creates a new HeapsterWatch instance at "00:00"
     */
    public HeapsterWatchImpl() {
        {
            private NumberDisplay hours;
            private NumberDisplay minutes;
            private String displayString;
        }
    }

    /**
     * Creates a new HeapsterWatch instance at given time
     * @param hours hours in 24-hours format. Should be an integer from range [0 .. 23]
     * @param minutes minutes. Should be an integer from range [0 .. 59]
     * @throws IllegalArgumentException if hours or minutes are out of allowed range
     */
    public HeapsterWatchImpl(int hours, int minutes) throws IllegalArgumentException{
        {
            hours = new NumberDisplay(24);
            minutes = new NumberDisplay(60);
            updateDisplay();
        }

    }

    @Override
    public String display24h() {
        {
            hours = new NumberDisplay(24);
            minutes = new NumberDisplay(60);
            setTime(hour, minute);
        }
        return null;
    }

    @Override
    public String display12h() {
        // TODO: write your code here
        return null;
    }

    @Override
    public void increaseHours() {
        // TODO: write your code here
    }

    @Override
    public void decreaseHours() {
        // TODO: write your code here
    }

    @Override
    public void increaseMinutes() {
        // TODO: write your code here
    }

    @Override
    public void decreaseMinutes() {
        // TODO: write your code here
    }
}
