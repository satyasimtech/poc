package com.example.java8.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.java8.service.StreamService;

@Service
public class StreamServiceImpl implements StreamService {

	@Override
	public List<Integer> filterEvenNumber(@RequestBody List<Integer> numbers) {
		return numbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());

	}

	@Override
	public List<Integer> filterOddNumber(List<Integer> numbers) {
		return numbers.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());

	}

	@Override
	public long countEmptyString(List<String> strings) {
		return strings.stream().filter(s -> s.isEmpty()).count();

	}

	@Override
	public long removeEmptyString(List<String> strings) {
		return strings.stream().filter(s -> s.isEmpty()).count();

	}

	@Override
	public List<String> filterStringStartwith(List<String> strings, String startwith) {
		return strings.stream().filter(s -> s.startsWith(startwith)).collect(Collectors.toList());

	}

	@Override
	public List<String> removeEmptyString(List<String> strings, String startwith) {
		return strings.stream().filter(s -> s.startsWith(startwith)).collect(Collectors.toList());

	}

	public Map<Boolean, List<Integer>> seperateEvenOdd(List<Integer> numbers) {
		return numbers.stream().collect(Collectors.partitioningBy(s -> s % 2 == 0));

	}

	@Override
	public List<Integer> removeDuplicate(List<Integer> numbers) {
		return numbers.stream().distinct().collect(Collectors.toList());

	}

	@Override
	public Map<Integer, Long> findNumberFrequency(List<Integer> numbers) {
		return numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	}

	@Override
	public List<Integer> sortNumber(List<Integer> numbers) {
		return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

	}

}
