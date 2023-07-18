package fr.vocaltech.di.sample1;

import lombok.Getter;

public class Engine {
    @Getter
    private EngineState state;
    public void start() {
        state = EngineState.STARTED;
        System.out.println("[Engine.start()] Engine started...");
    }

    public void stop() {
        state = EngineState.STOPPED;
        System.out.println("[Engine.stop()] Engine stopped...");
    }
}
