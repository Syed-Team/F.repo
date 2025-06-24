from calculator import add, subtract

def test_add():
	assert add(3, 5) == 8

def test_subtract():
	assert subtract(10, 4) == 6

if __name__ == "__main__":
	test_add()
	test_subtract()
	print("All tests passed!")
