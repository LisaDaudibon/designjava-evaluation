package com.zenika;

import net.datafaker.Faker;

import java.util.List;
import java.util.Locale;

public class StoryGenerator {
    private static final int FAKER_LIST_LENGTH = 12;
    private String characterName;
    Faker faker = new Faker(Locale.FRANCE);
    List<String> firstNames = faker.collection(() -> faker.name().firstName()).len(FAKER_LIST_LENGTH).generate();
}
