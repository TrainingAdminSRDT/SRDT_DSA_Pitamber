# Topic: Simple Binary Tree

class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

# Build Binary Tree
root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.left = TreeNode(4)
root.left.right = TreeNode(5)

# Preorder Traversal (Root Left Right)
def preorder(node):
    if node:
        print(node.data, end=" ")
        preorder(node.left)
        preorder(node.right)

print("Preorder Traversal:")
preorder(root)