package com.example.java8.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java8.service.StreamService;

@RestController
@RequestMapping("/java8")
public class StreamController {
	
	@Autowired
	private StreamService streamService;

	@PostMapping(path = "/stream/filter/evennumber")
	public List<Integer> filterEvenNumber(@RequestBody List<Integer> numbers) {
		return streamService.filterEvenNumber(numbers);

	}

	@PostMapping(path = "/stream/filter/oddnumber")
	public List<Integer> filterOddNumber(@RequestBody List<Integer> numbers) {
		return streamService.filterOddNumber(numbers);

	}

	@PostMapping(path = "/stream/count/empty/string")
	public long countEmptyString(@RequestBody List<String> strings) {
		return streamService.countEmptyString(strings);

	}

	@PostMapping(path = "/stream/remove/empty/string")
	public long removeEmptyString(@RequestBody List<String> strings) {
		return streamService.removeEmptyString(strings);

	}

	@PostMapping(path = "/stream/filter/{startwith}")
	public List<String> filterStringStartwith(@RequestBody List<String> strings,
			@PathVariable("startwith") String startwith) {
		return streamService.filterStringStartwith(strings, startwith);

	}
	
	@PostMapping(path = "/stream/remove/empty/string1")
	public List<String> removeEmptyString(@RequestBody List<String> strings,
			@PathVariable("startwith") String startwith) {
		return streamService.removeEmptyString(strings, startwith);

	}
	
	
	@PostMapping(path = "/stream/seperate/evenandodd")
	public Map<Boolean,List<Integer>> seperateEvenOdd(@RequestBody List<Integer> numbers) {
		return streamService.seperateEvenOdd(numbers);

	}
	
	@PostMapping(path = "/stream/remove/duplicate")
	public List<Integer> removeDuplicate(@RequestBody List<Integer> numbers) {
		return streamService.removeDuplicate(numbers);

	}
	
	@PostMapping(path = "/stream/number/frequency")
	public Map<Integer,Long> findNumberFrequency(@RequestBody List<Integer> numbers) {
		return streamService.findNumberFrequency(numbers);

	}
	
	@PostMapping(path = "/stream/number/sort")
	public List<Integer> sortNumber(@RequestBody List<Integer> numbers) {
		return streamService.sortNumber(numbers);

	}

}
