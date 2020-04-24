class Cache:

    cache = {}
    ages = {}
    age = 1

    def __init__(self, length):
        self.length = length
        

    def set(self, key, value):
        if key not in self.cache:
            if len(self.cache) < self.length:
                self.cache[key] = value
                self.ages[key] = self.age
            else:
                oldest_key = min(self.cache, key=self.cache.get)
                self.pop(oldest_key)
                self.cache[key] = value
                self.ages[key] = self.age

        else:
            self.cache[key] = value
            self.ages[key] = self.age
            
        
        print(self.ages)
        self.age += 1
        

    def pop(self, key):
        del self.cache[key]
        del self.ages[key]

    def cprint(self):
        print(self.cache)
        

        





c = Cache(4)
c.set("A", "a")
c.set("B", "b")
c.set("C", "c")
c.set("D", "d")
c.cprint()
c.set("B","bb")
c.cprint()
c.set("E","e")
c.cprint()
c.set("E","ee")
c.cprint()
c.set('F',"f")
c.cprint()