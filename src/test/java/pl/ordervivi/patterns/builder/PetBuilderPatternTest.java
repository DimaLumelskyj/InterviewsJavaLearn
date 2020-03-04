package pl.ordervivi.patterns.builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PetBuilderPatternTest {
    @Test
    public void legalBuild() {
        final Pet.Builder builder = new Pet.Builder();
        final Pet pet = builder
                .withAnimal(Animal.DOG)
                .withPetName("Bobby")
                .withOwnerName("John")
                .withAddress("123 California Street Mozambique")
                .withTelephone("084578554")
                .withEmailAddress("JohnBob@gmail.com")
                .build();
        //test pass - no exception thrown
    }

    @Test
    public void IllegalBuild() {

        assertThrows(IllegalStateException.class,
                () -> {
                    final Pet.Builder builder = new Pet.Builder();
                    final Pet pet = builder
                            .withAnimal(Animal.DOG)
                            .withPetName("Bobby")
                            .withOwnerName("John")
                            .build();
                });


    }
}