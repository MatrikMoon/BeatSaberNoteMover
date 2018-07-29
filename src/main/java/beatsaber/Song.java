package beatsaber;

import beatsaber.nested.Event;
import beatsaber.nested.Note;
import beatsaber.nested.Obstacle;

import java.util.List;

/**
 * Created by Moon on 7/29/2018
 * Json object representing a song (a single difficulty file) in beat saber
 */

public class Song {
    private String _version;
    private double _beatsPerMinute;
    private double _beatsPerBar;
    private double _noteJumpSpeed;
    private double _shuffle;
    private double _shufflePeriod;
    private List<Event> _events;
    private List<Note> _notes;
    private List<Obstacle> _obstacles;

    public String get_version() {
        return _version;
    }

    public void set_version(String _version) {
        this._version = _version;
    }

    public double get_beatsPerMinute() {
        return _beatsPerMinute;
    }

    public void set_beatsPerMinute(double _beatsPerMinute) {
        this._beatsPerMinute = _beatsPerMinute;
    }

    public double get_beatsPerBar() {
        return _beatsPerBar;
    }

    public void set_beatsPerBar(double _beatsPerBar) {
        this._beatsPerBar = _beatsPerBar;
    }

    public double get_noteJumpSpeed() {
        return _noteJumpSpeed;
    }

    public void set_noteJumpSpeed(double _noteJumpSpeed) {
        this._noteJumpSpeed = _noteJumpSpeed;
    }

    public double get_shuffle() {
        return _shuffle;
    }

    public void set_shuffle(double _shuffle) {
        this._shuffle = _shuffle;
    }

    public double get_shufflePeriod() {
        return _shufflePeriod;
    }

    public void set_shufflePeriod(double _shufflePeriod) {
        this._shufflePeriod = _shufflePeriod;
    }

    public List<Event> get_events() {
        return _events;
    }

    public void set_events(List<Event> _events) {
        this._events = _events;
    }

    public List<Note> get_notes() {
        return _notes;
    }

    public void set_notes(List<Note> _notes) {
        this._notes = _notes;
    }

    public List<Obstacle> get_obstacles() {
        return _obstacles;
    }

    public void set_obstacles(List<Obstacle> _obstacles) {
        this._obstacles = _obstacles;
    }
}
