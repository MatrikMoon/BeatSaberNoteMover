package beatsaber.nested;

/**
 * Created by Moon on 7/29/2018
 * Json object for an "obstacle" in a Beat Saber json file
 */

public class Obstacle {
    private double _time;
    private int _lineIndex;
    private int _type;
    private double _duration;
    private int _width;

    public double get_time() {
        return _time;
    }

    public void set_time(double _time) {
        this._time = _time;
    }

    public int get_lineIndex() {
        return _lineIndex;
    }

    public void set_lineIndex(int _lineIndex) {
        this._lineIndex = _lineIndex;
    }

    public int get_type() {
        return _type;
    }

    public void set_type(int _type) {
        this._type = _type;
    }

    public double get_duration() {
        return _duration;
    }

    public void set_duration(double _duration) {
        this._duration = _duration;
    }

    public int get_width() {
        return _width;
    }

    public void set_width(int _width) {
        this._width = _width;
    }
}
