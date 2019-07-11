/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author hp
 */
public class Lista {
    Nodo head;
	
	public void insert(int data)
	{
		Nodo node = new Nodo();
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Nodo n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next =  node;
		}
		
	}
	public void insertAtStart(int data)
	{
		Nodo node = new Nodo();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index,int data)
	{
		Nodo node = new Nodo();
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Nodo n = head;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Nodo n = head;
			Nodo n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}
	
	public void show()
	{
		Nodo node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
    
    
    
    
    
    
    
    
    
    
    
    
}
