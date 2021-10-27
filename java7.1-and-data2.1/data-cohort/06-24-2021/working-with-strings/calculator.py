from calculator_engine import CalculatorEngine
from console import Console


class Calculator:

    def __init__(self) -> None:
        super().__init__()
        self.calculator_engine = CalculatorEngine()
        self.console = Console()

    def display(self):
        self.calculator_engine.display()

    def run(self):
        self.console.print("Welcome to my calculator!")
        self.main_menu()

    def main_menu(self):
        def select_option(user_selection):
            switcher = {
                "basic": self.do_basic_arimethic,
                "scientific": self.do_scientific,
                "switch-mode": self.switch_mode,
                "display": self.display,
                "quit": None
            }
            return switcher.get(user_selection, "Invalid Option")
        self.console.print("From here you can select any of the following:")
        user_input = self.console.get_string_input("basic, scientific, switch-mode, display, quit")
        select_option(user_input)()


    def do_basic_arimethic(self):
        def select_option(user_selection):
            switcher = {
                "add": self.calculator_engine.perform_add,
                "subtract": self.calculator_engine.perform_subtract,
                "mulitply": self.calculator_engine.perform_multiply,
                "divide": self.calculator_engine.perform_divide,
                "display": self.display,
                "quit": None
            }
            return switcher.get(user_selection, "Invalid Option")
        self.console.print("From here you can select any of the following:")
        user_input = self.console.get_string_input("basic, scientific, switch-mode, display, quit")
        select_option(user_input)()

    def do_scientific(self):
        return None # TODO - implement method

    def switch_mode(self):
        return None # TODO - implement method