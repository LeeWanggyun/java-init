package p05;

public class SongExec {
		
	public static void main(String[] args) {
		Song s = new Song();
		Song s1 = new Song();
		Song s2 = new Song();
		Song s3 = new Song();
		Song s4 = new Song();
		
		Song[] songs = new Song[5];

		songs[0] = new Song();
		songs[0].name = "Attention";
		songs[0].singer = "뉴진스1";
		songs[0].rank = 1;
		
		songs[1] = new Song();
		songs[1].name = "Hypeboy";
		songs[1].singer = "뉴진스2";
		songs[1].rank = 2;
		
		songs[2] = new Song();
		songs[2].name = "OMG";
		songs[2].singer = "뉴진스3";
		songs[2].rank = 3;

		songs[3] = new Song();
		songs[3].name = "Ditto";
		songs[3].singer = "뉴진스4";
		songs[3].rank = 4;
		
		songs[4] = new Song();
		songs[4].name = "Hurt";
		songs[4].singer = "뉴진스5";
		songs[4].rank = 5;
		
		Song fSong = songs[0];
		Song lSong = songs[0];
		
		for(int i=1; i<songs.length; i++) {
			if(fSong.rank > songs[i].rank) {
				fSong = songs[i];
			}
			if(lSong.rank < songs[i].rank) {
				lSong = songs[i];
			}
		}
		
		int max = songs[0].rank;
		int min = songs[0].rank;
		int maxIdx = 0;
		int minIdx = 0;
		
		for (int i=1; i<songs.length; i++) {
			if(min > songs[i].rank) {
				min = songs[i].rank;
				minIdx = i;
			}
			if(max < songs[i].rank) {
				max = songs[i].rank;
				maxIdx = i;
			}
		}
		System.out.println("일등: " + songs[minIdx].singer + "의 " + songs[minIdx].name );
		System.out.println("꼴등: " + songs[maxIdx].singer + "의 " + songs[maxIdx].name );
	}
}
