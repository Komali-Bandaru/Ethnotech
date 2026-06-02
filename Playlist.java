import java.util.*;
class Playlist
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		ArrayList<String> playlist=new ArrayList<>();
		System.out.println("How many songs do you want to add into this playlist");
		int n=s.nextInt();
		System.out.println("Enter the song names:");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+". ");
			String song=s.next();
			playlist.add(song);
			System.out.println();
		}
		System.out.println("\n=======Playlist========");
		System.out.println("Playlist:"+playlist);
		System.out.println("\n Song Removed:"+playlist.remove(1));
		System.out.println("\nSong retrived from index 1:"+playlist.get(1));
		System.out.println("\nIs the list contains the song\"Perfect\":"+playlist.contains("Perfect"));
		playlist.add("Shape of You");
		System.out.println("\n ======= Final Playlist========");
		System.out.println("Playlist:"+playlist);
	}
}