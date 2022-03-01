package ru.otus.spring.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayName("Tests of Class Person")
class PersonTests {

	private Person person;

	@BeforeEach
	void setUp() {

		String a = "Ivan";
		int b = 18;

		person = new Person(a, b);
		System.out.println("Test started.");
	}

	@AfterEach
	void tearDown() {
		System.out.println("Test done.");
	}

	@DisplayName("the constructor works correct")
	@Test
	void shouldHaveCorrectConstructor() {
		assertEquals("Ivan", person.getName());
		assertEquals(18, person.getAge());
	}

	@DisplayName("the getName method works correct")
	@Test
	void getName_01() {
		assertEquals("Ivan", person.getName());
	}

	@DisplayName("the getAge method works correct")
	@Test
	void getAge() {
		assertEquals(18, person.getAge());
	}
}