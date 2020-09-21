// The array numbers already exists. Write only exchange actions here.
val temp = numbers.last()
numbers[numbers.lastIndex] = numbers[0]
numbers[0] = temp