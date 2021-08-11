package com.tcs.uncheckedexceptiondemo;

public class OverAgeException extends RuntimeException {
public OverAgeException(String message) {
	super(message);
}
}
