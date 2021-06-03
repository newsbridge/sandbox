from example import dummy_add, dummy_add2


def test_dummy_add():
    result = dummy_add(2,3)
    assert result == 5

def test_dummy_add2():
    result = dummy_add2(2,3)
    assert result == 5

