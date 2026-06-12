class TreeNode:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def insert(root, key):
    if root is None:
        return TreeNode(key)

    if key < root.data:
        root.left = insert(root.left, key)
    elif key > root.data:
        root.right = insert(root.right, key)

    return root

def inorder(root):
    if root:
        inorder(root.left)
        print(root.data, end=" ")
        inorder(root.right)

try:
    n = int(input("Enter number of nodes: "))

    root = None

    for i in range(n):
        value = int(input(f"Enter value {i+1}: "))
        root = insert(root, value)

    print("\nBST in sorted order:")
    inorder(root)

except ValueError:
    print("Error: Please enter only integer values.")