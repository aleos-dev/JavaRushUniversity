package ua.javarush.task.jdk13.task41.task4112;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bowling {

    private final Queue<Track> tracks;
    private final Queue<PairOfShoes> shoesShelf;

    public Bowling(int tracksNumber) {

        tracks = IntStream.rangeClosed(1, tracksNumber)
                .mapToObj(Track::new)
                .collect(Collectors.toCollection(LinkedList::new));

        shoesShelf = Stream.generate(() -> ThreadLocalRandom.current().nextInt(38, 46))
                .limit(50)
                .map(PairOfShoes::new)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public synchronized Track acquireTrack() {

        Track track = tracks.poll();
        if (Objects.isNull(track)) {return null;}

        track.setPrice(100 - tracks.size() * 10);

        return track;
    }

    public synchronized void releaseTrack(Track track) {
        tracks.add(track);
        System.out.printf("З доріжки №%d зняли броню\n", track.getNumber());
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {

        if (shoesShelf.size() < number) {return null;}

        Set<PairOfShoes> shoes = new HashSet<>();
        while (number-- > 0) {
            shoes.add(shoesShelf.poll());
        }

        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        shoesShelf.addAll(shoes);
        System.out.printf("У гардероб повернули %d пар взуття\n", shoes.size());
    }
}
