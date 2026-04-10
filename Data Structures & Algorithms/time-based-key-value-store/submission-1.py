class TimeMap:

    def __init__(self):
        self.map={}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.map:
            self.map[key]=[]
        self.map[key].append((timestamp,value))

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.map:
            return ""
        res=""
        for time,val in self.map[key]:
            if time<=timestamp:
                res=val
            else:
                 break
        return res

        
