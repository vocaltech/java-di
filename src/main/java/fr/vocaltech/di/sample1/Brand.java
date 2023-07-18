package fr.vocaltech.di.sample1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Brand {
    @Getter
    @Setter
    private final String name;
}
