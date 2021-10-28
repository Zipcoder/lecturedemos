def string_immutability():
    output = "hello world"
    output = output.upper()
    print(output)


def string_indices():
    some_value = 3
    value_to_add = 1
    index_to_select = some_value + value_to_add
    name = 'Marklar'
    first_letter = name[0]
    second_letter = name[1]
    number_of_characters = len(name)
    print(number_of_characters)
    print(first_letter)
    print(second_letter)


def getting_length_of_sequence():
    name = 'Marklar'
    number_of_characters = len(name)
    print(number_of_characters)


def getting_last_element1():
    name = 'Marklar'
    number_of_characters = len(name)
    last_index = number_of_characters - 1
    last_element = name[last_index]
    print(last_element)


def getting_last_element2():
    name = 'Marklar'
    print(name[-1])


def iterating_through_string():
    i = 0
    word = 'python'
    while i < len(word):
        letter = word[i]
        print(letter)
        i = i + 1


def for_each_loop():
    word = 'python'
    for element in word:
        print(element)


def determinate_for_loop_equivalent1():
    n = 10;
    for index in range(n):
        print(index)


def determinate_for_loop_equivalent2():
    current = 0
    stop = 10
    while current < stop:
        print(current)
        current = current + 1


def non_iterable_objects_in_loop_signature():
    word = 999999
    for i in word:
        print(i)


def iterable_objects_in_loop_signature():
    word = "999999"
    for element in word:
        print(element)


def printing_without_range():
    an_array_from_5_to_10 = [5, 6, 7, 8, 9]  # range(5,10)
    for element in an_array_from_5_to_10:
        print(element)


def printing_with_range():
    an_array_from_5_to_10 = range(5, 10)
    for element in an_array_from_5_to_10:
        print(element)


def printing_with_range_and_step():
    an_array_from_5_to_10 = range(5, 10, 2)
    for element in an_array_from_5_to_10:
        print(element)


def slicing_strings():
    some_string = "the quick brown fox"
    some_string_sliced = some_string[1:]
    print(some_string_sliced)


def slicing_lists():
    some_list = [1, 8, "Hello", ["The", 10, 5]]
    sliced_list = some_list[1:]
    print(sliced_list)


def slicing_lists_negative_left_operand():
    another_list = ["The", 10, 5]
    some_list = [1, 8, "Hello", another_list]
    sliced_list = some_list[-1:]
    print(sliced_list)


def slicing_lists_negative_right_operand():
    another_list = ["The", 10, 5]
    some_list = [1, 8, "Hello", another_list]
    sliced_list = some_list[:-1]
    print(sliced_list)


def slicing_lists_negative_left_and_right_operand():
    another_list = ["The", 10, 5]
    some_list = [1, 8, "Hello", another_list]
    sliced_list = some_list[1:-1]
    sliced_list_equivalent = some_list[1:3]
    print(sliced_list)
    print(sliced_list_equivalent)


def slicing_lists_negative_3_operands():
    another_list = ["The", 10, 5]
    some_list = [1, 8, "Hello", another_list]
    sliced_list = some_list[1::1]
    print(sliced_list)


def replace_value_in_string():
    some_string = "top"
    some_string = some_string.replace("t", "p")
    print(some_string)


def string_find():
    fruit = 'apple'
    first_index_of_letter_p = fruit.find('p')
    first_index_of_substring = fruit.find('ple')
    non_existent_index = fruit.find('the quick brown')
    print(first_index_of_letter_p)
    print(first_index_of_substring)
    print(non_existent_index)


string_find()
