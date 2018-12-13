package me.korkorna.kataexamples.kata02;

public class KarateChap {

    public static int chap(int query, int[] numbers) {
        return binarySearch(query, numbers, 0, numbers.length);
    }

    private static int forloop(int query, int[] numbers) {
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (query == numbers[i]) {
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }

    private static int binarySearch(int query, int[] numbers, int startIndex, int endIndex) {
        // 베이스 조건
        if (numbers.length == 0) {
            return -1;
        }

        int midIndex = getMidIndex(startIndex, endIndex);

        // 체크 로직
        // 중간 값이 같거나
        // 중간 값보다 찾는 값이 크거나
        // 중간 값보다 찾는 값이 작거나

        if (numbers[midIndex] == query) {
            return midIndex;
        } else if (numbers[midIndex] < query && midIndex != endIndex -1) {
            return binarySearch(query, numbers, midIndex + 1, endIndex);
        } else if (numbers[midIndex] > query && midIndex != startIndex) {
            return binarySearch(query, numbers, startIndex, midIndex);
        }

        return -1;
    }

    private static int getMidIndex(int start, int end) {
        int diff = end - start;
        return start + (diff / 2);
    }
}
