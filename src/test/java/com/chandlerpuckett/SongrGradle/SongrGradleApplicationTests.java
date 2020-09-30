package com.chandlerpuckett.SongrGradle;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class SongrGradleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testAlbumConstructor (){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);
		assertEquals("Album{title='gravy', " +
				"artist='meatloaf', " +
				"imageUrl='img/url', " +
				"songCount=10, " +
				"length=20}", testAlbum.toString());

	}

//	------------------------

	@Test
	public void testGetTitle (){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);

		assertEquals("gravy",testAlbum.getTitle());
	}

	@Test
	public void testSetTitle (){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);
		testAlbum.setTitle("garth");
		assertEquals("garth",testAlbum.getTitle());
	}

//	------------------------

	@Test
	public void testGetArtist(){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);

		assertEquals("meatloaf",testAlbum.getArtist());
	}

	@Test
	public void testSetArtist(){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);
		testAlbum.setArtist("henry");
		assertEquals("henry",testAlbum.getArtist());
	}

//	------------------------

	@Test
	public void testGetImage(){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);

		assertEquals("img/url",testAlbum.getImageUrl());
	}

	@Test
	public void testSetImage(){

		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);
		testAlbum.setImageUrl("image.jpg");
		assertEquals("image.jpg",testAlbum.getImageUrl());
	}

//	------------------------

	@Test
	public void testGetSongCount(){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);
		assertEquals(10,testAlbum.getSongCount());
	}

	@Test
	public void testSetSongCount(){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);
		testAlbum.setSongCount(60);
		assertEquals(60,testAlbum.getSongCount());

	}

//	------------------------

	@Test
	public void testGetLength(){
		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);
		assertEquals(20,testAlbum.getLength());
	}

	@Test
	public void testSetLength(){

		Album testAlbum = new Album(
				"gravy",
				"meatloaf",
				"img/url",
				10,
				20
		);
		testAlbum.setLength(400);
		assertEquals(400,testAlbum.getLength());
	}
}
