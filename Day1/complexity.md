# 时间、空间复杂度

常用的Big O：O(1) O(log n) O(n) O(n^2) O(n^3) O(2^n) O(n!)
n在5以内复杂度相差不大，超过5将有惊人差异，优化算法有益于节省资源，获得更好的效能

###斐波那契函数，时间复杂度如何计算？

递归展开是二叉树，存在很多重复计算的节点，所以是O(2^n)。
如何优化：存储中间计算结果减少计算次数，时间复杂度降到O(n)，但仍需要O(n)空间复杂度；通过循环和两个变量，可以将时间复杂度降到O(n)，空间O(1)。