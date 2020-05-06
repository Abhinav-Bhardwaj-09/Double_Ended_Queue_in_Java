package DoubleEndedQueue;

import QueueNode.DoubleEndedQueueNode;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 05-05-2020
 * Time: 21:56
 */

public class MyQueue {
    DoubleEndedQueueNode front ;
    DoubleEndedQueueNode rear ;
    int no_of_Element = 0 ;

    public MyQueue() {
        front = null;
        rear = null;
    }

    public void insertAtFront(DoubleEndedQueueNode NewNode){
        NewNode.setNext(front);
        no_of_Element ++;
    }

    public void insertAtRear(DoubleEndedQueueNode NewNode){
        no_of_Element ++ ;
        if ( front == null ){
            NewNode.setNext(null);
            front = NewNode;
        }
        else{
            DoubleEndedQueueNode temp = front ;
            while ( temp.getNext() != null) temp = temp.getNext();
            NewNode.setNext(temp.getNext());
            temp.setNext(NewNode);
        }
        rear = NewNode;
    }

    public void deleteFromFront(){
        if ( front != null) {
            front = front.getNext();
            no_of_Element -- ;
        }
        else System.out.println("List is empty...");
    }




}