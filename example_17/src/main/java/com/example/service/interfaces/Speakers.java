package com.example.service.interfaces;

import com.example.model.Song;

// We could not create beans on interface class
public interface Speakers {
    // abstract method (no body)
    public String makeSound(Song song);
}
