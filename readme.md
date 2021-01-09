# Result of the comparison

### ArrayList and LinkedList
 **"+" - faster , "-" - slower**
 - Input:
    + 100 elem: arraylist "+" , linkedlist "-" 
    + 1000 elem: arraylist "-" , linkedlist "+"
    + 10000 elem: arraylist "-" , linkedlist "+"
    + 100000 elem: arraylist "-" , linkedlist "+"
 - Insert 1 element (100 000 el):
    + start: arraylist "-" , linkedlist "+" 
    + end: arraylist "+" , linkedlist "-" 
    + middle: arraylist "+" , linkedlist "-" 
 - Remove 1 element (100 000 el):    
    + start: arraylist "-" , linkedlist "+" 
    + end: arraylist "+" , linkedlist "-" 
    + middle: arraylist "+" , linkedlist "-" 
    
### HashSet, LinkedHashSet and TreeSet
**"first" - faster , "second" - slower then first, "third"-the slowest**
- Input:
    + 100 elem: hashSet "first" , linkedHashSet "second" , treeSet "third" 
    + 1000 elem: hashSet "first" , linkedHashSet "second" , treeSet "third" 
    + 10000 elem: hashSet "first" , linkedHashSet "second" , treeSet "third" 
    + 100000 elem: hashSet "second" , linkedHashSet "first" , treeSet "third"
- Remove 1 element (100 000 el):
    + start: hashSet "second" , linkedHashSet "first" , treeSet "third" 
    + end: hashSet "second" , linkedHashSet "first" , treeSet "third" 
    + middle: hashSet "second" , linkedHashSet "first" , treeSet "third" 
 
### HashMap, LinkedHashMap and TreeMap  
**"first" - faster , "second" - slower then first, "third"-the slowest**
- Input:
    + 100 elem: hashMap "first" , linkedHashMap "second" , treeMap "third" 
    + 1000 elem: hashMap "first" , linkedHashMap "second" , treeMap "third"
    + 10000 elem: hashMap "first" , linkedHashMap "second" , treeMap "third" 
    + 100000 elem: hashMap "second" , linkedHashMap "first" , treeMap "third"
- Remove 1 element (100 000 el):
    + start: hashSet "second" , linkedHashSet "first" , treeSet "third" 
    + end: hashSet "second" , linkedHashSet "first" , treeSet "third" 
    + middle: hashSet "second" , linkedHashSet "first" , treeSet "third" 

### P.S.
It should be noted that regardless of the operation and time complexity of the algorithm in the future, at the initial stage, you can select a small interval where the algorithmic complexity will be equal to (blue color).
![markdown logo](https://webattach.mail.yandex.net/message_part_real/slide-42.jpg?exif_rotate=y&no_disposition=y&name=slide-42.jpg&sid=YWVzX3NpZDp7ImFlc0tleUlkIjoiMTc4IiwiaG1hY0tleUlkIjoiMTc4IiwiaXZCYXNlNjQiOiJOcFl5N3ViVlVXZ2R2NUs1dDNPS0hRPT0iLCJzaWRCYXNlNjQiOiJtWEw3ZnVUQklzWVBCN3NjVlJwaSs4MS94NUh5QXpway9GOVlmMndGRDl3TDBOekpYRkNWMysrT2FnNmZJVHN4YjVlRVQ4ZkdoeFZkS2RnOFhXVHh0QWlISytJZFU0Y2ZSQ2Qyb0h2WUJUdWxvc1FuS2ZMYzU2Ulg2Y01Mc1c3TyIsImhtYWNCYXNlNjQiOiJZVXBLV1l2VEFUSnZEQmovWTdvYnEzV01QUzV1b0k0TExjWE5lK0paTUpNPSJ9)