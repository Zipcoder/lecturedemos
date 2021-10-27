class Console:
    def __init__(self) -> None:
        super().__init__()

    def print(self, prompt, *args):
        print(prompt, args)

    def get_string_input(self, prompt, *args):
        self.print(prompt, args)

    def get_double_input(self, prompt, *args):
        return float(self.get_string_input(prompt, args))

    def get_integer_input(self, prompt, *args):
        return int(self.get_string_input(prompt, args))