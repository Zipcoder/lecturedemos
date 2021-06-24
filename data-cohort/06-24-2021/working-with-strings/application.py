def first_few_slides():
    name = 'Marklar'
    first_index = 0
    second_index = 1
    third_index = 2

    first_character = name[first_index]
    second_character = name[second_index]
    second_character = name[first_index + 1]
    third_character = name[third_index]
    number_of_characters = len(name)
    last_index = number_of_characters - 1
    last_character = name[last_index]
    last_character = name[-1]
    second_to_last_character = name[-2]
    third_to_last_character = name[-3]
    # NOTVALID_second_character = name[first_character + 1]

    print(last_character)
    print(second_to_last_character)
    print(third_to_last_character)


    print(first_character)
    print(second_character)
    print(third_character)
    print(name)
    print(number_of_characters)

# first_few_slides()

def while_loop():
    current_index = 0
    word = 'python'
    number_of_characters = len(word)
    while current_index < number_of_characters:
        letter = word[current_index]
        print(letter)
        current_index = current_index + 1


def for_loop():
    word = 'python'
    for letter in word:
        print(letter)


def string_slice():
    full_name = 'Guido van Rossum'
    print(full_name)
    # Guido van Rossum

    first_name = full_name[:5]
    print(first_name)
    # Guido

    last_name = full_name[6:]
    print(last_name)
    # van Rossum

    print(full_name[5:6])
    # ' '



def print_people():
    people = ['Joe', 'Jessica', 'James', 'Jennifer']
    for person in people:
        print(person)

def print_peoples_characters():
    person_names = ['Joe', 'Jessica', 'James', 'Jennifer']
    for person_name in person_names:
        for character in person_name:
            print(character)


def using_the_in_operator():
    person_names = ['Joe', 'Jessica', 'James', 'Jennifer']
    is_joe_here = 'Joe' in person_names
    print(is_joe_here)


def how_does_sum_work():
    grades = [60, 70, 90, 'yerr']
    average = sum(grades) / len(grades)
    print(average)

def lambda_sort():
    students = [
        [1, 'john', 'A', 15],
        [2, 'jane', 'B', 12],
        [3, 'dave', 'B', 10],
    ]

    function_used_to_sort_by_id = lambda student: student[0]
    function_used_to_sort_by_name = lambda student: student[1]
    function_used_to_sort_by_grade = lambda student: student[2]
    function_used_to_sort_by_score = lambda student: student[3]

    sorted_by_id = sorted(students, key=function_used_to_sort_by_id)
    sorted_by_name = sorted(students, key=function_used_to_sort_by_name)
    sorted_by_grade = sorted(students, key=function_used_to_sort_by_grade)
    sorted_by_score = sorted(students, key=function_used_to_sort_by_score)

    print(students)
    print(sorted_by_id)
    print(sorted_by_name)
    print(sorted_by_grade)
    print(sorted_by_score)


lambda_sort()

# how_does_sum_work()

# first_few_slides() # example 1
# while_loop() # example 2
# for_loop() # example 3
# string_slice() # example 4
# print_peoples_characters()