class Bucket:
    def __init__(self):
        self.data = []

    def put(self, key: int, value: int) -> None:
        index = -1

        for i, e in enumerate(self.data):
            if e[0] == key:
                index = i
                break

        if index == -1:
            self.data.append((key, value))
        else:
            self.data[index] = (key, value)

    def get(self, key: int) -> int:
        for i, e in enumerate(self.data):
            if e[0] == key:
                return e[1]
        return -1

    def remove(self, key: int) -> None:
        for i, e in enumerate(self.data):
            if e[0] == key:
                self.data.remove(e)
                return





class MyHashMap:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.data = []
        self.key_size = 2069
        for i in range(self.key_size):
            self.data.append(Bucket())

    def put(self, key: int, value: int) -> None:
        """
        value will always be non-negative.
        """
        hash = key % self.key_size
        bucket = self.data[hash]
        bucket.put(key, value)

    def get(self, key: int) -> int:
        """
        Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
        """
        hash = key % self.key_size
        bucket = self.data[hash]
        return bucket.get(key)


    def remove(self, key: int) -> None:
        """
        Removes the mapping of the specified value key if this map contains a mapping for the key
        """
        hash = key % self.key_size
        bucket = self.data[hash]
        return bucket.remove(key)
