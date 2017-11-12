def numbers = 1..10
for (number in numbers) print number

def letters = 'a'..'f'
for (letter in letters) print letter

def enum WEEK_DAYS { L, M, X, J, V, S, D}

def weekDays = WEEK_DAYS.L..WEEK_DAYS.V
weekDays.each {print it}
println ''
println "$weekDays.from - $weekDays.to"

def isEven (def num) {
	return num % 2 == 0
}

println "${isEven 10}"
numbers.each {println it + " is even: ${isEven 10}"}