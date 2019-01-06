# Union find
## Problem: Dynamic connectivity
Given a set of N objects. 
- Union command: connect two objects.
- Find/connected query: is there a path connecting the two objects?

![Union find statement](../../../r_assets/dynamic-connectivity.png)


### [UF.java](UF.java)
Abstract class with the definition of the methods

### [MyUF.java](MyUF.java)
My attempt to solve the problem, prev the lessons:
- Create an array of elements and initialize them with the index
- union: put the element q as parent of p
- connected: the elements are connected if hay the same parent (root)
- getParent(int p): return the parent of the element iterating its parent till the parent of the element is the same as the index of the element

Initialize | Union | Connected
--- | --- | ---
N | 1 |N  

### [QuickFind.java (eager) ](QuickFind.java)
Quick find solution
![Quick find solution](../../../r_assets/quick-find.png)

Initialize | Union | Connected
--- | --- | ---
N | N | 1  

    
