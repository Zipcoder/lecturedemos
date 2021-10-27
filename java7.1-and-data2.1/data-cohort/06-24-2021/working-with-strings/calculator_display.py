from console import Console

class CalculatorDisplay:
    def __init__(self) -> None:
        super().__init__()
        self.console = Console()
        self.current_value = None

    def clear(self):
        self.current_value = None

    def display(self):
        self.console.print("The current value is", self.current_value)
