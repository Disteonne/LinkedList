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
    
  For example:
  ![markdown logo](https://sun9-29.userapi.com/impg/33h-zL6G896t7jCVBIk5OEIlpPrz433-E3TRbQ/CsfPU9SfdE0.jpg?size=537x348&quality=96&proxy=1&sign=eb59930d3b029961965db35ef7021b65&type=album)
    
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
 
For example:
   ![markdown logo](https://sun9-76.userapi.com/impg/Eu6VPDUDjEDnv62FwLaDHC_PU71Hbtt5HaaKyQ/H7n6lB-y3M8.jpg?size=481x288&quality=96&proxy=1&sign=5f70afb927f7f855f58bd8c9be049076&type=album)

### HashMap, LinkedHashMap and TreeMap  
**"first" - faster , "second" - slower then first, "third"-the slowest**
- Input:
    + 100 elem: hashMap "first" , linkedHashMap "second" , treeMap "third" 
    + 1000 elem: hashMap "first" , linkedHashMap "second" , treeMap "third"
    + 10000 elem: hashMap "first" , linkedHashMap "second" , treeMap "third" 
    + 100000 elem: hashMap "second" , linkedHashMap "first" , treeMap "third"
- Remove 1 element (100 000 el):
    + start: hashMap "second" , linkedHashMap "first" , treeMap "third" 
    + end: hashMap "second" , linkedHashMap "first" , treeMap "third" 
    + middle: hashMap "second" , linkedHashMap "first" , treeMap "third" 

For example:
   ![markdown logo](https://sun9-24.userapi.com/impg/akM_1GPLiwHiQsjTc2g70IokA43TEvDD-Mes6A/roatbi6YLyo.jpg?size=480x288&quality=96&proxy=1&sign=424d019b3b8b0e83fd5cfb7649270a46&type=album)
#### Conclusion 
The selection of a collection depends on the data set and the goals you set.

### MyLinkedList VS Java LinkedList
 - In fact, the time values vary: somewhere its implementation is faster, and somewhere-not.
 
For example:
   ![markdown logo](https://sun9-16.userapi.com/impg/HZSu4tbCOx6IZyLRG3LlpZoFlwmdu4SQGY5AvA/zytXH5Xz1_I.jpg?size=481x289&quality=96&proxy=1&sign=a25e5901ce4cf1f8cc1884ff8610770f&type=album)

### P.S.
It should be noted that regardless of the operation and time complexity of the algorithm in the future, at the initial stage, you can select a small interval where the algorithmic complexity will be equal to (blue color).
![markdown logo](https://webattach.mail.yandex.net/message_part_real/slide-42.jpg?exif_rotate=y&no_disposition=y&name=slide-42.jpg&sid=YWVzX3NpZDp7ImFlc0tleUlkIjoiMTc4IiwiaG1hY0tleUlkIjoiMTc4IiwiaXZCYXNlNjQiOiJOcFl5N3ViVlVXZ2R2NUs1dDNPS0hRPT0iLCJzaWRCYXNlNjQiOiJtWEw3ZnVUQklzWVBCN3NjVlJwaSs4MS94NUh5QXpway9GOVlmMndGRDl3TDBOekpYRkNWMysrT2FnNmZJVHN4YjVlRVQ4ZkdoeFZkS2RnOFhXVHh0QWlISytJZFU0Y2ZSQ2Qyb0h2WUJUdWxvc1FuS2ZMYzU2Ulg2Y01Mc1c3TyIsImhtYWNCYXNlNjQiOiJZVXBLV1l2VEFUSnZEQmovWTdvYnEzV01QUzV1b0k0TExjWE5lK0paTUpNPSJ9)