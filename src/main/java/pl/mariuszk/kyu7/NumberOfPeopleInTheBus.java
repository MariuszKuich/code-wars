package pl.mariuszk.kyu7;

import java.util.List;

public class NumberOfPeopleInTheBus {

    public static int countPassengers(List<int[]> stops) {
        return stops.stream()
                .map(arr -> arr[0] - arr[1])
                .reduce(0, Integer::sum);
    }
}
