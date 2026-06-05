import java.util.*;
class Post
{
	String data;
	Post next;
	Post prev;
	Post(String data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
class Doublelinkedlist
{
	Post head=null;
	Post tail=null;
	Post current=null;
	public void Addpost(String content)
	{
		Post post=new Post(content);
		if(head==null)
		{
			tail=current=head=post;
		}
		else{
		tail.next=post;
		post.prev=tail;
		tail=post;
		}
		System.out.println("Post added successfully");
	}
	public void insertpost(String sppost)
	{
		Post spons=new Post(sppost);
		if(current==null)
		{
			tail=current=head=spons;
		}
		spons.next=current.next;
		spons.prev=current;
		if(current.next!=null)
		{
			current.next.prev=spons;
		}
		else{
			tail=spons;
		}
		current.next=spons;
		System.out.println(sppost+"Insertion of Sponsered post is done");
	}
	public void delete(String pastpost)
	{
		Post delpost=new Post(pastpost);
		if(head == null)
		{
        System.out.println("Error: No posts are available");
		}
		Post curr = head;
		while(curr != null && !curr.data.equals(pastpost))
		{
			curr = curr.next;
		}
		if(curr == null)
		{
			System.out.println(pastpost + " not found");
			return;
		}
		if(curr == head)
		{
			head = head.next;
			if(head != null)
				head.prev = null;
			else
				tail = null;
		}
		else if(curr == tail)
		{
			tail = tail.prev;
			tail.next = null;
		}
		else
		{
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
		}
		System.out.println(pastpost + " Successfully deleted the post");
	}
    public void nextPost() {
    if (current != null && current.next != null) {
        current = current.next;
        System.out.println("Next Post: " + current.data);
    } else {
        System.out.println("No next post.");
    }
}

public void previousPost() {
    if (current != null && current.prev != null) {
        current = current.prev;
        System.out.println("Previous Post: " + current.data);
    } else {
        System.out.println("No previous post.");
    }
}
	public void display()
	{
		if(head == null)
		{
			System.out.println("No posts available");
			return;
		}
		Post temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[]args)
	{
		Doublelinkedlist list=new Doublelinkedlist();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data to be stored(enter n for stopping):");
        while (true) {
            String input = sc.next();
            if (input.equals("n")) break;
            list.Addpost(input);
        }
		list.display();
		list.insertpost("Party");
		System.out.println("=====list after insertion======");
		list.display();
		list.delete("songs");
		System.out.println("=====list after deletion======");
		list.display();
		list.nextPost();
		list.previousPost();
        sc.close();
	}
	
}