package org.example;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.logging.Logger;

public class ListCustom<T> extends AbstractList<T>
{
    private static final Logger LOGGER= Logger.getLogger(App.class.getName());
    private static final int INT_CAP = 20;
    public int size;
    private int reference = 0;
    private Object object[];

    public ListCustom()
    {
        this.size = INT_CAP;
        object = new Object[this.size];
    }

    @Override
    public int size() {
        return this.reference;
    }

    private void increaseSize()
    {
        this.size = this.object.length * 2;
        this.object = Arrays.copyOf(this.object,this.reference);
    }

    @Override
    public T set(int index, T element)
    {
        if(this.reference < index)
        {
            new Error("Out of Bound");
        }
        this.object[index] = element;
        return (T) this.object[index];
    }

    @Override
    public boolean add(T da)
    {
        if(this.reference >= this.size)
        {
            increaseSize();
        }
        object[this.reference++] = da;
        return true;
    }

    public void display()
    {
        String str = new String("");
        int i=0;
        while(i < this.reference)
        {
            str += this.object[i++]+" ";
        }
        LOGGER.info(str+"\n");
    }

    @Override
    public T get(int index)
    {
        return (T)this.object[index];
    }

    @Override
    public T remove(int index)
    {
        Object obj = this.object[index];
        for(int i = index;i<this.reference-1;i++)
        {
            this.object[i] = this.object[i+1];
        }
        this.reference--;
        return (T)obj;

    }
}