package com.example.java8.service;

import java.util.List;
import java.util.Map;

public interface StreamService {

	public List<Integer> filterEvenNumber(List<Integer> numbers);

	public List<Integer> filterOddNumber(List<Integer> numbers);

	public long countEmptyString(List<String> strings);

	public long removeEmptyString(List<String> strings);

	public List<String> filterStringStartwith(List<String> strings, String startwith);

	public List<String> removeEmptyString(List<String> strings, String startwith);

	public Map<Boolean, List<Integer>> seperateEvenOdd(List<Integer> numbers);

	public List<Integer> removeDuplicate(List<Integer> numbers);

	public Map<Integer, Long> findNumberFrequency(List<Integer> numbers);

	public List<Integer> sortNumber(List<Integer> numbers);

}
