from calculator_computer import CalculatorComputer
from calculator_display import CalculatorDisplay
from console import Console


class CalculatorEngine:
    def __init__(self) -> None:
        super().__init__()
        self.display = CalculatorDisplay()
        self.computer = CalculatorComputer()
        self.console = Console()

    def perform_add(self):
        first_value = self.console.get_double_input("Enter your first value to be added")
        second_value = self.console.get_double_input("Enter your second value to be added")
        sum = self.computer.add(first_value, second_value)
        self.display.current_value = sum

    def perform_subtract(self):
        return None # TODO - Implement method

    def perform_multiply(self):
        return None # TODO - Implement method

    def perform_divide(self):
        return None # TODO - Implement method

    def display(self):
        self.display.display()