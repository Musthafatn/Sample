package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Combinations {

	public static void main(final String[] args) {
		final Set<Integer> superSet = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		final List<Set<Integer>> subSetList = new ArrayList<>();
		subSetList.add(new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(1, 2)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(3, 4)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(5, 6)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(7, 8)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(1, 2, 3)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(4, 5, 6)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(5, 6, 7, 8)));
		subSetList.add(new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5)));
		final List<Set<Integer>> combinations = new ArrayList<>();
		final List<List<Set<Integer>>> combinationsList = new ArrayList<>();
		final int lastElement = (int) superSet.toArray()[superSet.size() - 1];
		Set<Integer> lastCombination;
		int currentLastElement;
		int iterationCount = 0;
		for (final Set<Integer> initialSubSet : subSetList) {
			if (combinations.isEmpty() && initialSubSet.iterator().next() == 1) {
				combinations.add(initialSubSet);
			}
			if (!combinations.isEmpty()) {
				lastCombination = combinations.get(combinations.size() - 1);
				currentLastElement = (int) lastCombination.toArray()[lastCombination.size() - 1];
				if (currentLastElement == lastElement) {
					combinationsList.add(new ArrayList<>(combinations));
					combinations.clear();
					continue;
				}
				while (currentLastElement != lastElement) {
					for (final Set<Integer> subSet : subSetList) {
						if (subSet.iterator().next() - 1 == currentLastElement) {
							combinations.add(subSet);
							break;
						}
					}
					lastCombination = combinations.get(combinations.size() - 1);
					currentLastElement = (int) lastCombination.toArray()[lastCombination.size() - 1];
					if (currentLastElement == lastElement) {
						combinationsList.add(new ArrayList<>(combinations));
						combinations.clear();
						break;
					}
					iterationCount++;
					if (iterationCount == lastElement) {
						break;
					}
				}
			}
		}
		for (final List<Set<Integer>> combinationSets : combinationsList) {
			System.out.println(combinationSets);

		}
	}

}

//{1,2,3,4,5,6,7,8}
//{1,2} {3,4} {5,6} {7,8}
//{1,2,3,4} {5,6,7,8}
//{1,2,3}, {4,5,6}, {7,8}
//{1,2,3,4} {5,6} {7,8}
//{1,2} {3,4},{5,6,7,8}
//{1,2,3,4,5}, {7,8}
