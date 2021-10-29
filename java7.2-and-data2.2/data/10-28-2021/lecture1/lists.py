def my_first_list():
    some_list = [1, "helo", [], 'c']
    for element in some_list:
        print(element)


def convert_string_to_list():
    string = "The quick brown"
    string_as_list = list(string)
    string_as_list[0] = "Z"
    delimiter = "Jump"  # the value to place between each element in list
    string = "".join(string_as_list)
    print(string)
    print(string_as_list)


def nested_list_example():
    stuff = [1, 'DOG', ['BALL', 'BAT']]
    bat = stuff[2][0]
    print(bat)


def for_each_loop():
    people = ['Joe', 'Jessica', 'James', 'Jennifer']
    for current_person in people:
        print(current_person)


def while_loop():
    people = ['Joe', 'Jessica', 'James', 'Jennifer']
    current_index = 0
    number_of_people = len(people)
    while current_index < number_of_people:
        current_person = people[current_index]
        print(current_person)
        current_index = current_index + 1


def list_operator_in():
    people = ['Joe', 'Jessica', 'James', 'Jennifer']
    is_joe_here = 'Joe' in people
    is_joe_not_here = 'Joe' not in people
    print(is_joe_here)
    print(is_joe_not_here)


def list_operator_concat():
    people1 = ['Joe', 'Jessica']
    people2 = ['James', 'Jennifer']
    people = people1 + people2
    print(people)


def list_operator_repeat():
    people1 = ['Joe', 'Jessica']
    people2 = ['James', 'Jennifer']
    people = people1 + people2
    some_integer_value = 3
    print(people * some_integer_value)


def assignment_with_slicing():
    values = [1, 2, 3, 4, 5, 6]
    values[1:4] = ['a', 'b', 'c']
    print(values)


def append_to_list():
    values = [1, 2, 3, 4, 5, 6]
    values.append('a')
    values.append('b')
    values.append('c')
    print(values)


def insert_into_list():
    letters = ['a', 'b', 'c']
    letters.insert(2, 'what am i even doing with these letters?')
    print(letters)


def insert_into_list_after_end():
    letters = ['a', 'b', 'c']
    letters.insert(3, 'what am i even doing with these letters?')
    print(letters)


def extend_into_list():
    letters1 = ['a', 'b', 'c']
    letters2 = ['d', 'e', 'f']
    letters1.extend(letters2)
    print(letters1)


def sum_a_list():
    list = range(1, 10)
    total = sum(list)
    number_of_elements = len(list)
    average = total / number_of_elements
    print(total)
    print(number_of_elements)
    print(average)


def sorting_a_list():
    letters1 = ['a', 'b', 'c']
    letters2 = ['d', 'e', 'f']
    letters2.extend(letters1)
    letters2.sort()
    print(letters2)

def sorted_list_example():
    letters1 = ['a', 'b', 'c']
    letters2 = ['d', 'e', 'f']
    letters2.extend(letters1)
    letters = sorted(letters2)
    print(letters)


def pop_element():
    some_list = "The quick brown fox".split(" ") # ["The", "quick", "brown", "fox"]
    fetched_value = some_list.pop(1)
    print(fetched_value)
    print(some_list)


def delete_element():
    some_list = "The quick brown fox".split(" ")
    del some_list[2]
    print(some_list)


def remove_element():
    some_list = "The quick brown fox".split(" ")
    some_list.remove("quick")
    print(some_list)

remove_element()
