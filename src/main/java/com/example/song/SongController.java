package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;

@RestController
public class SongController {
    SongService songservice = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songservice.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songservice.addSong(song);
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return songservice.getSongById(songId);
    }

    

    @PutMapping("/songs/{Songs}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
        return songservice.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleSong(@PathVariable("songId") int songId) {
        songservice.deleteSong(songId);
    }
}