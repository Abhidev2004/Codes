class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None


def preorder(root):
    if root:
        print(root.val, end=" ")
        preorder(root.left)
        preorder(root.right)


def inorder(root):
    if root:
        inorder(root.left)
        print(root.val, end=" ")
        inorder(root.right)


def postorder(root):
    if root:
        postorder(root.left)
        postorder(root.right)
        print(root.val, end=" ")


n = int(input())

nodes = {}

for _ in range(n):
    node, l, r = map(int, input().split())

    if node not in nodes:
        nodes[node] = Node(node)

    if l != -1:
        nodes[l] = Node(l)
        nodes[node].left = nodes[l]

    if r != -1:
        nodes[r] = Node(r)
        nodes[node].right = nodes[r]

root = nodes[1]

print("Preorder Traversal")
preorder(root)

print("\nInorder Traversal")
inorder(root)

print("\nPostorder Traversal")
postorder(root)
