import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

interface IBinaryTree {

    public TreeNode insert(int data);

    public void delete(int data);

    public TreeNode search(int data);

    public int getHeight();

    public void preOrderTraversal();

    public void inOrderTraversal();

    public void postOrderTraversal();

    public void levelOrderTraversal();
}

class TreeNode {
    int value;
    TreeNode parent;
    TreeNode left;
    TreeNode right;

    public TreeNode(TreeNode parent, int value) {
        this.value = value;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree implements IBinaryTree {
    private TreeNode rootNode;

    @Override
    public TreeNode insert(int data) {
        TreeNode node = search(data);
        if (node != null) {
            return node;
        }
        TreeNode newNode = insert(null, rootNode, data);
        if (rootNode == null) {
            rootNode = newNode;
        }
        return newNode;
    }

    private TreeNode insert(TreeNode parent, TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(parent, data);
        }
        if (data < node.value) {
            node.left = insert(node, node.left, data);
        } else {
            node.right = insert(node, node.right, data);
        }
        return node;
    }

    @Override
    public void delete(int data) {
        TreeNode node = search(data);
        if (node != null) {
            delete(node);
        }
    }

    private void delete(TreeNode node) {
        if (node.left == null && node.right == null) {
            if (node.parent == null) {
                rootNode = null;
            } else if (node.parent.left == node) {
                node.parent.left = null;
            } else {
                node.parent.right = null;
            }
        } else if (node.left == null || node.right == null) {
            TreeNode child = (node.left != null) ? node.left : node.right;
            if (node.parent == null) {
                rootNode = child;
                rootNode.parent = null;
            } else if (node.parent.left == node) {
                node.parent.left = child;
                child.parent = node.parent;
            } else {
                node.parent.right = child;
                child.parent = node.parent;
            }
        } else {
            TreeNode successor = findInOrderSuccessor(node.right);
            node.value = successor.value;
            delete(successor);
        }
    }

    private TreeNode findInOrderSuccessor(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    @Override
    public TreeNode search(int data) {
        return search(rootNode, data);
    }

    private TreeNode search(TreeNode node, int data) {
        if (node == null || node.value == data) {
            return node;
        }
        if (data < node.value) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    @Override
    public int getHeight() {
        return getHeight(rootNode);
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    @Override
    public void preOrderTraversal() {
        preOrderTraversal(rootNode);
    }

    private void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    @Override
    public void inOrderTraversal() {
        inOrderTraversal(rootNode);
    }

    private void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    @Override
    public void postOrderTraversal() {
        postOrderTraversal(rootNode);
    }

    private void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    @Override
    public void levelOrderTraversal() {
        levelOrderTraversal(rootNode);
    }

    public void levelOrderTraversal(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (node != null) {
            queue.add(node);
        }
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.value + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}

public class Solution {
    private static BinaryTree tree;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int OPERATION_COUNT = Integer.parseInt(bufferedReader.readLine().replaceAll("\\s+$", "").split("=")[1].trim());
        bufferedReader.readLine();
        for (int opCountItr = 0; opCountItr < OPERATION_COUNT; opCountItr++) {
            List<String> theInput = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split("\\("))
                    .collect(toList());
            String action = theInput.get(0);
            String argsString = theInput.get(1);
            argsString = argsString.replaceAll("[\\);]", "");
            String arg0 = (argsString.length() > 0) ? argsString.replaceAll("\"", "") : null;
            ProcessInputs(action, arg0);
        }
        bufferedReader.close();
    }

    private static void ProcessInputs(String action, String arg0) {
        int key;
        TreeNode node;
        switch (action) {
            case "createBinaryTree":
                tree = new BinaryTree();
                break;
            case "delete":
                key = Integer.valueOf(arg0);
                tree.delete(key);
                break;
            case "search":
                key = Integer.valueOf(arg0);
                node = tree.search(key);
                if (node != null) {
                    System.out.println(node.value);
                } else {
                    System.out.println("NODE_VALUE_NOT_FOUND");
                }
                break;
            case "insert":
                key = Integer.valueOf(arg0);
                tree.insert(key);
                break;
            case "getHeight":
                key = tree.getHeight();
                System.out.println(key);
                break;
            case "inOrderTraversal":
                tree.inOrderTraversal();
                System.out.println();
                break;
            case "preOrderTraversal":
                tree.preOrderTraversal();
                System.out.println();
                break;
            case "postOrderTraversal":
                tree.postOrderTraversal();
                System.out.println();
                break;
            case "levelOrderTraversal":
                tree.levelOrderTraversal();
                System.out.println();
                break;
        }
    }
}

