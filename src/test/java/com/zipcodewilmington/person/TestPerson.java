package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {


    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHobby() {
        // Given
        Person person = new Person();
        String expected = "bird watching";

        // When
        person.setHobby(expected);

        // Then
        String actual = person.getHobby();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetJob() {
        // Given
        Person person = new Person();
        String expected = "\"Software Developer\"";

        // When
        person.setJob(expected);

        // Then
        String actual = person.getJob();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        //Given
        Person person = new Person();
        String expected = "6'2";

        // When
        person.setHeight(expected);

        // Then
        String actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetShoeSize() {
        // Given
        Person person = new Person();
        double expected = 10.5;

         // When
        person.setShoeSize(expected);

        // Then
        double actual = person.getShoeSize();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSetAreaCode() {
        // given
        Person person = new Person();
        int expected = 302;

        // When
        person.setAreaCode(expected);

        // Then
        int actual = person.getAreaCode();
        Assert.assertEquals(expected,actual);
    }




}
