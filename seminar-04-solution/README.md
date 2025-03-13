<h1 align="center">Solution</h1>


### Tasl 1

```diff
- data class TreeNode(val value: Any) {
+ data class TreeNode<T>(val value: T) {

-     var left: TreeNode? = null
+     var left: TreeNode<T>? = null

-     var right: TreeNode? = null
+     var right: TreeNode<T>? = null
```

### Task 2

```diff
- fun <T> calculateTreeCost(root: TreeNode<T>): Double {
+ fun <T : CostElement> calculateTreeCost(root: TreeNode<T>): Double {
```

### Task 3

```diff
- fun <T> estimateIntersectionSize(treeNode: TreeNode<SetIntersection<T>>): Int {
+ fun <T : Comparable<T>> estimateIntersectionSize(treeNode: TreeNode<SetIntersection<T>>): Int {
```

### Task 4

```diff
- fun <T, S> estimateIntersectionSize(treeNode: TreeNode<T>) : Int {
+ fun <T, S> estimateIntersectionSize(treeNode: TreeNode<T>) : Int where T: Range<S>, T: Measurable, S: Comparable<S> {

- fun <T> printTree(treeNode: TreeNode<T>) {
+ fun <T: CostElement> printTree(treeNode: TreeNode<T>) {
```
