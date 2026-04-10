class Node:
    def __init__(self,key,val):
        self.key,self.val=key,val
        self.prev=self.next=None
class LRUCache:

    def __init__(self, capacity: int):
        self.capacity=capacity
        self.map={}
        self.head,self.tail=Node(0,0),Node(0,0)
        self.head.next = self.tail
        self.tail.prev = self.head
    def remove(self,node):
        node.prev.next=node.next
        node.next.prev=node.prev
    def insert(self,node):
        node.next=self.head.next;
        node.prev=self.head;
        self.head.next.prev=node
        self.head.next=node


    def get(self, key: int) -> int:
        if key in self.map:
            self.remove(self.map[key])
            self.insert(self.map[key])
            return self.map[key].val
        return -1
        
        

    def put(self, key: int, value: int) -> None:
        if key in self.map:
            self.remove(self.map[key])
        self.map[key]=Node(key,value)
        self.insert(self.map[key])
        if len(self.map)>self.capacity:
            lru=self.tail.prev
            self.remove(lru)
            del self.map[lru.key]

        
