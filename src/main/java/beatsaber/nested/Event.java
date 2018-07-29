package beatsaber.nested;

/**
 * Created by Moon on 7/29/2018
 * Json object for an "event" in a Beat Saber json file
 */

public class Event {
    private double _time;
    private int _type;
    private int _value;

    public double get_time() {
        return _time;
    }

    public void set_time(double _time) {
        this._time = _time;
    }

    public int get_type() {
        return _type;
    }

    public void set_type(int _type) {
        this._type = _type;
    }

    public int get_value() {
        return _value;
    }

    public void set_value(int _value) {
        this._value = _value;
    }
}
