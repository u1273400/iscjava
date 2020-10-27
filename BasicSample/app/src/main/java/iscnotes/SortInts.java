package iscnotes;

import java.util.List;
import io.TextIO;
import java.util.ArrayList;
import java.util.ListIterator;

public class SortInts {
    public static void main (String[] args){
        List<Integer> list=new ArrayList<Integer>();
        System.out.print("Enter value (negative value quits loop): ");
        int v=TextIO.getInt();
        while(v>=0){
            sortedInsert(list,v);
            System.out.print("Enter value (negative value quits loop): ");
            v=TextIO.getInt();
        }
        for(Integer i:list){
            System.out.print(i+" ");
        }
    }
    public static void sortedInsert(List<Integer> list, int value){
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            int v=it.next();
            if(v>=value){
                it.previous();
                break;
            }
        }it.add(value);
    }
}

