package com.pitisha96.collections;

public class MyBinaryTree<T> {
        private class Node {
            public int key;
            public T data;
            public Node leftChild;
            public Node rightChild;

            public void printNode() {
                System.out.printf("KEY: %s , DATA: %s\n", this.key, this.data);
            }
        }
        Node root;
        public Node find(int key){
            Node current=root;
            while(current.key!=key){
                if(current.key>key){
                    current=current.leftChild;
                }else{
                    current=current.rightChild;
                }
                if(current==null){
                    return null;
                }
            }
            return current;
        }

        public void insert(int key,T data){
            Node node=new Node();
            node.key=key;
            node.data=data;
            if(root==null){
                root=node;
            }else{
                Node current=root;
                Node prev;
                while(true){
                    prev=current;
                    if(key<prev.key){
                        current=current.leftChild;
                        if(current==null){
                            prev.leftChild=node;
                            return;
                        }
                    }else{
                        current=current.rightChild;
                        if(current==null){
                            prev.rightChild=node;
                            return;
                        }
                    }
                }
            }
        }

        public void print(Node startNode){
            if(startNode!=null){
                print(startNode.leftChild);
                startNode.printNode();
                print(startNode.rightChild);
            }
        }
}

