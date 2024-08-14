package com.chainsys.skilltesttask;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class PeopleTest {
	public static void main(String[] args) {
		List<PeopleTemp> people = Arrays.asList(new PeopleTemp("Ramya", 20),
				new PeopleTemp("Priya", 26), new PeopleTemp("Radha", 26),
				new PeopleTemp("Siya", 24), new PeopleTemp("Riya", 20));

		Map<Integer, List<PeopleTemp>> peopleAge = people.stream()
				.collect(Collectors.groupingBy(PeopleTemp::getAge));

		peopleAge.forEach((age, peopleList) -> System.out.println(age + ": " + peopleList));

	}
}
