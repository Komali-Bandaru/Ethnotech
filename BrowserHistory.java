import java.util.*;
class Page
{
    String url;
    Page next;
    Page(String url)
    {
        this.url = url;
        this.next = null;
    }
}
class BrowserHistory
{
    Page head = null;
    Page tail = null;
    public void visitPage(String url)
    {
        Page newPage = new Page(url);
        if(head == null)
        {
            head = tail = newPage;
        }
        else
        {
            tail.next = newPage;
            tail = newPage;
        }
        System.out.println(url + " visited successfully");
    }
    public void displayHistory()
    {
        if(head == null)
        {
            System.out.println("No pages in history");
            return;
        }
        Page temp = head;
        while(temp != null)
        {
            System.out.println(temp.url);
            temp = temp.next;
        }
    }
    public void searchPage(String url)
    {
        Page temp = head;
        while(temp != null)
        {
            if(temp.url.equals(url))
            {
                System.out.println(url + " found");
                return;
            }
            temp = temp.next;
        }
        System.out.println(url + " not found");
    }
    public void deletePage(String url)
    {
        if(head == null)
        {
            System.out.println("History is empty");
            return;
        }
        if(head.url.equals(url))
        {
            head = head.next;
            System.out.println(url + " deleted");
            return;
        }
        Page curr = head;
        while(curr.next != null)
        {
            if(curr.next.url.equals(url))
            {
                curr.next = curr.next.next;
                System.out.println(url + " deleted");
                return;
            }
            curr = curr.next;
        }
        System.out.println(url + " not found");
    }
    public void countPages()
    {
        int count = 0;
        Page temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("Total visited pages: " + count);
    }
    public static void main(String[] args)
    {
        BrowserHistory history = new BrowserHistory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter page names (n to stop):");
        while(true)
        {
            String page = sc.next();
            if(page.equals("n"))
                break;
            history.visitPage(page);
        }
        System.out.println("\n===== Browsing History =====");
        history.displayHistory();
        System.out.println("\n===== Search Page =====");
        history.searchPage("Google");
        System.out.println("\n===== Delete Page =====");
        history.deletePage("Google");
        System.out.println("\n===== History After Deletion =====");
        history.displayHistory();
        System.out.println("\n===== Count Pages =====");
        history.countPages();
        sc.close();
    }
}